package mobile1;
public class Ltab extends Mobile {
	Ltab() {
	}

	Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType); 
		
//	*	어차피 super는 호출되기 때문에 super를 사용해서 처리하는 것이 낫다~
//		(super로 처리할 수 있는 것은 super로 하는 것이 효율적 & 일반적인 방법)
		

	}
	public void operate(int time) {
		setBatterySize(getBatterySize() + (-time * 10));
		// 자손을 먼저 찾아보고 없으면 부모를 찾아봄(컴파일러가 자동으로)
		// 만약 setBatterySize가 부모, 자손 둘 다 있는데 부모의 setBatterySize를 사용할 경우
		// super.setBatterySize로 접근
	}

	public void charge(int time) {
		setBatterySize(getBatterySize() + (time * 10));
	}
}
