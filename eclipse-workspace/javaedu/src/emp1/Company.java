package emp1;

public class Company {
public static void main(String[] args) {
	// Employee 배열에 객체들을 생성하여 저장한다.
	Employee[] ep = new Employee[2];
	Secretary sc = new Secretary("Duke",1,"secretary",800);
	Sales sl = new Sales("Tuxi",2,"sales",1200);
	ep[0] = sc;
	ep[1] = sl;
//	ep[0]= new Secretary("Duke",1,"secretary",800);
//	ep[1]= new Sales("Tuxi",2,"sales",1200);
//	ep[0].setSalary(ep[0].incentive(100));
	// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다.
	// 이 때는 세금을 출력하지 않는다.
//	printEmployee(ep,false);
	 // 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은
	 // 다르다.
	sc.incentive(100);
	sl.incentive(100);
	 // printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보
	// 와 세금을 출력한다. 
	printEmployee(ep,true);
}
public static void printEmployee(Employee[] emp, boolean isTax) {
	// 객체의 정보를 출력한다.(실행 결과를 참조) Employee 객체의 정보(직원이름소속 부서명)
	 // isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다.
	
	// Employee의 tax 호출해서 if 조건문
	if(isTax) {
		System.out.print("[인센티브 100 지급]\nname\t\tdepartment\t\tsalary\t\ttax\t\textra pay\n");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t\t%s\t\t%d\t\t%3.1f\n",emp[0].getName(), emp[0].getDepartment(), emp[0].getSalary(), emp[0].tax());
		System.out.printf("%s\t\t%s\t\t\t%d\t\t%3.1f\t\t%3.1f",emp[1].getName(), emp[1].getDepartment(), emp[1].getSalary(), ((Sales)emp[1]).tax(), ((Sales)emp[1]).getExtraPay());
	}else {
		System.out.println();
		System.out.print("name\t\tdepartment\t\tsalary\t\textra pay\n");
		System.out.println("----------------------------------------------------");
		System.out.printf("%s\t\t%s\t\t%d\n",emp[0].getName(), emp[0].getDepartment(), emp[0].getSalary());
		System.out.printf("%s\t\t%s\t\t\t%d\t\t%3.1f",emp[1].getName(), emp[1].getDepartment(), emp[1].getSalary(), ((Sales)emp[1]).getExtraPay());
		// 왜..?Sales형으로 형변환..?
	}
	 }

}
