package emp1;

public class Secretary extends Employee implements Bonus {

	Secretary() {

	}

	Secretary(String name, int number, String department, int salary) {
super(name, number,department, salary);

	}

	double tax() { // 세금
		return getSalary() * 0.1;
	}
	 public void incentive(int pay) { // 인센티브 지급
		setSalary((int) (getSalary()+(pay*0.8)));
	}


}
