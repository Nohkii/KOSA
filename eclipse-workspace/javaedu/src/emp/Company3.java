package emp;

public class Company3 {

	public static void main(String[] args) {
		Employee[] emps = {
				new Secretary("Duke", 1, "Secretary", 800),
				new Sales("Tuxi", 2, "Sales", 1200)
		};
		
		printEmployee(emps, false);
		/**
		 *  부모인 Bonus한테 있는 메소드이기 때문에 Bonus로 형변환해도 가능함
		 *  이렇게 하면 반복문으로 해결할 수 있음
		 */
		for(Employee e : emps) {
			((Bonus)e).incentive(100);
		}
		System.out.println("[인센티브 100 지급]");
		printEmployee(emps, true);
	}
	
	public static void printEmployee(Employee[] emp, boolean isTax) {
		/**
		 * 	제목 조건문으로 내보내고 조건문 안에 반복문으로 emp돌려서 내보내기
		 */
		if(isTax) {
			System.out.println("name		department		salary		tax		extra pay");
			System.out.println("---------------------------------------------------------------------------------------");
			
			for(Employee e :emp) {
				e = (Employee)e;
				System.out.printf("%-5s		%-10s		%-5d ", 
									e.getName(), 
									e.getDepartment(),
									e.getSalary());
				
				System.out.printf("		%-5.1f", e.tax());
				if(e instanceof Sales)
					System.out.printf("		%-5.1f",((Sales)e).getExtraPay());
				System.out.println();
			}
		}else {
			System.out.println("name		department		salary		extra pay");
			System.out.println("-----------------------------------------------------------------------");
			
			for(Employee e :emp) {
				e = (Employee)e;
				System.out.printf("%-5s		%-10s		%-5d ", 
									e.getName(), 
									e.getDepartment(),
									e.getSalary());

				if(e instanceof Sales)
					System.out.printf("		%-5.1f",(((Sales)e).getExtraPay()));

				System.out.println();
			}
			System.out.println();
		}
		
	}

}
