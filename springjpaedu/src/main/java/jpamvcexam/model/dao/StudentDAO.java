package jpamvcexam.model.dao;
import jpamvcexam.model.dto.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
public class StudentDAO {
    private EntityManagerFactory factory;
    public StudentDAO() {
        super();
        factory = Persistence.createEntityManagerFactory("emptest");
    }
    // 1. 학생 정보 출력
    public List<Student> getAllStudent() {
        EntityManager em = factory.createEntityManager();
        TypedQuery<Student> s = em.createQuery("select s from Student s", Student.class);
        List<Student> list = s.getResultList();
        em.close();
        return list;
    }
    //2 . 학생 정보 입력
    public boolean insertStudent(Student entity) {
        boolean result = true;
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            result = false;
        }
        em.close();
        return result;
    }
    // 3. 학생 정보 삭제
    public boolean deleteStudent(String name) {
        boolean result = true;
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            Student vo = em.find(Student.class, name);
            em.remove(vo);
            em.getTransaction().commit();
        } catch (Exception e) {
            result = false;
        }
        em.close();
        return result;
    }
    // 4. 학생 정보 수정
    public boolean updateStudent(Student entity) {
        boolean result = true;
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            Student oldVo = em.find(Student.class, entity.getName());
            oldVo.setName(entity.getName());
            oldVo.setScore(entity.getScore());
            em.getTransaction().commit();
        } catch (Exception e) {
            result = false;
        }
        em.close();
        return result;
    }
    // 5. 학생 점수 확인
    public List<Student> getScore(String name) {
        EntityManager em = factory.createEntityManager();
        TypedQuery<Student> s = em.createQuery("select s from Student s WHERE s.name = :name", Student.class);
        s.setParameter("name",  name);
        List<Student> list = s.getResultList();
        em.close();
        return list;
    }
    public Student one(String name) {
        EntityManager em = factory.createEntityManager();
        Student vo = em.find(Student.class, name);
        em.close();
        return vo;
    }
    public void close() {
        if (factory != null)
            factory.close();
    }
}