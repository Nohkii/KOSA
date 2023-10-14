package emp;

public class Secretary extends Employee implements Bonus {
	Secretary() {
	}

	Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() { // 세금
		return getSalary() * 0.1;
	}

	public void incentive(int pay) { 
		setSalary((int) (getSalary() + (pay * 0.8))); 
		// double형이니까 int형으로 형변환시키기
	}
}