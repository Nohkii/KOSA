package emp;

public class Company2 {
	public static void main(String[] args) {

		Employee[] employee = new Employee[2];

		employee[0] = new Secretary("Duke", 1, "secretary", 800);
		employee[1] = new Sales("Tuxi", 2, "sales", 1200);

		printEmployee(employee, false);
		/**
		 * 어떤 클래스가 들어있는지 확인하기 위해 instanceof연산자를 사용
		 */
		for(Employee emp : employee) {
			if(emp instanceof Secretary) {
				((Secretary)emp).incentive(100);	
			} else if(emp instanceof Sales) {
				((Sales)emp).incentive(100);
			} 
		}
		
		//printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보와 세금을 출력한다.
		printEmployee(employee, true);
	}

	public static void printEmployee(Employee[] emp, boolean isTax) {
		if (isTax) {
			System.out.println("[인센티브 100 지급]");
			System.out.println("name" + "\t\t" + "department" + "\t\t" + "salary" + "\t\t" + "tax" + "\t\t" + "extra pay"); //tax 출력
			System.out.println("---------------------------------------------------------------------------------");
			for (Employee employee : emp) {
				if(employee instanceof Sales) {
					System.out.println(employee.getName() + "\t\t" + employee.getDepartment() + "\t\t\t" + employee.getSalary() + "\t\t" + ((Sales)employee).tax() + "\t\t" + ((Sales)employee).getExtraPay());
				} 
				else {
					System.out.println(employee.getName() + "\t\t" + employee.getDepartment() + "\t\t" + employee.getSalary() + "\t\t" + ((Secretary)employee).tax());
				}
			}
		} else {
			System.out.println("name" + "\t\t" + "department" + "\t\t" + "salary" + "\t\t" + "extra pay"); //tax 미출력
			System.out.println("-----------------------------------------------------------------");
			for (Employee employee : emp) {
				if(employee instanceof Sales) {
					System.out.println(employee.getName() + "\t\t" + employee.getDepartment() + "\t\t\t" + employee.getSalary() + "\t\t" + ((Sales)employee).getExtraPay() + "\n");
				} 
				else {
					System.out.println(employee.getName() + "\t\t" + employee.getDepartment() + "\t\t" + employee.getSalary() + "\t\t");
				}
			}
		}

	}

}
