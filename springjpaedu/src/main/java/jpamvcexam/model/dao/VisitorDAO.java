package jpamvcexam.model.dao;

import jpamvcexam.model.dto.Visitor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class VisitorDAO {
	
	private EntityManagerFactory factory;
	
	public VisitorDAO() {
		super();
		factory = Persistence.createEntityManagerFactory("emptest");
	}

	public List<Visitor> listAll() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Visitor> q = em.createQuery("select t from Visitor t", Visitor.class);
		List<Visitor> list = q.getResultList();
		em.close();
		return list;
	}

	public Visitor one(int id) {
		EntityManager em = factory.createEntityManager();
		Visitor vo = em.find(Visitor.class, id);
		em.close();
		return vo;
	}

	public List<Visitor> search(String keyword) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Visitor> q = em.createQuery("select t from Visitor t WHERE t.memo like :keyword", Visitor.class);
		q.setParameter("keyword", "%" + keyword + "%");
		List<Visitor> list = q.getResultList();
		em.close();
		return list;
	}

	public boolean insert(Visitor vo) {
		boolean result = true;
		EntityManager em = factory.createEntityManager();
		try {			
			em.getTransaction().begin(); // 먼저 트랜잭션 호출
			em.persist(vo); // 트랜잭션이 있어야 persist,,메소드를 사용할 수 있음
			em.getTransaction().commit();
		} catch (Exception e) {
			result = false;
		}
		em.close();
		return result;
	}
	
	public boolean delete(int id) {
		boolean result = true;
		EntityManager em = factory.createEntityManager();
		try {		
			em.getTransaction().begin();
			Visitor vo = em.find(Visitor.class, id);
			em.remove(vo); // 영속 컨텍스트에 저장이 되어 있어야 삭제할 수 있음
			em.getTransaction().commit();
		} catch (Exception e) {
			result = false;
		}
		em.close();
		return result;
	}
	
	public boolean update(Visitor vo) {
		boolean result = true;
		EntityManager em = factory.createEntityManager();
		try {			
			em.getTransaction().begin();
			Visitor oldVo = em.find(Visitor.class, vo.getId()); // find()메소드를 통해 인수로 전달된 ID를 가진 관리 상태의 Entity가 반환
			// 영속성 컨텍스트에 존재하지 않는 경우는 Query를 실행하여 관계형 데이터베이스로부 터 매핑할 레코드를 검색하고 관리 상태의 Entity로 저장
			System.out.println(oldVo.getName());
			oldVo.setName(vo.getName());
			oldVo.setMemo(vo.getMemo());			
			em.getTransaction().commit(); // 만약 바뀐것이 없다면 수행하지않는다,,
		} catch (Exception e) {
			result = false;
		}
		em.close();
		return result;
	}
	public void close() {
		if (factory != null)
			factory.close();
	}
}
