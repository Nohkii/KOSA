//package jpamvcexam.model.dto;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import java.time.LocalDate;
//
//@Entity
//@Getter
//@Setter
//@ToString
//public class Emp {
//    @Id
//    private int empno;
//    private String ename;
//    private String job;
//    private  int  mgr;
//    private  int  sal;
//    private  int  comm;
//    @ManyToOne
//    @JoinColumn(name="deptno")
//    private  int  deptno;
//    private LocalDate hiredate;
//}
