package emp;

public class Sales extends Employee implements Bonus {
	Sales() {
	}

	Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() {
		return getSalary() * 0.13;
	}

	public void incentive(int pay) {
		setSalary((int) (getSalary() + (pay * 1.2)));
	}

	public double getExtraPay() { // 추가수당 지급
		return getSalary() * 0.03;
	}
}