package work;

public abstract class Plane {
	private String planeName;
	private int fuelSize;

	Plane() {
	}

	Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	/**
	 * 연료주입같이 공통적인 메소드는 부모한테 정의해두고 자식들이 사용하는 것이 좋다~ 
	 */
	public void refuel(int fuel) {
		setFuelSize(getFuelSize() + fuel);
		// fuelSize += fuel; 이렇게 해도 된다~
	}
	/**
	 * 연료 사용하는 것은 비행기마다 다르기 때문에 자식들이 각각 구현하도록
	 * 미완성 메서드를 자식들은 무조건 구현해야한다~(강제적인 부분도 있음)
	 */
	public abstract void flight(int distance);

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
}