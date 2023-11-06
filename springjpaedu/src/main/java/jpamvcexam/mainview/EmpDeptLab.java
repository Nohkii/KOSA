//package jpamvcexam.mainview;
//
//import jpamvcexam.model.dto.Emp;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.TypedQuery;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class EmpDeptLab {
//    public static void main(String[] args) {
//        EntityManagerFactory fac = Persistence.createEntityManagerFactory("emptest");
//        EntityManager em = fac.createEntityManager();
//        boolean b = new Random().nextBoolean();
//        Scanner scan = new Scanner(System.in);
//        if(b){
//            System.out.println("사원명을 입력하세요");
//            String name = scan.nextLine();
//            TypedQuery<Emp> q = em.createQuery("select d.dname from emp e join e.dept d where e.name = :name", Emp.class);
//            List<Emp> list = q.getResultList();
//            if(list.size()==0){
//                System.out.println("부서를 찾을 수 없네요..ㅜㅜ");
//            }else{
//                System.out.println(list.get(0).getEname()+"의 근무 부서 -"+list.get(0).getDeptno());
//            }
//        }else{
//            System.out.println("거짓");
//        }
//    }
//
//}
