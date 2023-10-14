package mobile;
public class Ltab extends Mobile {
	Ltab() {
	}

	Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType); 
//	*	어차피 super는 호출되기 때문에 super를 사용해서 처리하는 것이 낫다~
//		(super로 처리할 수 있는 것은 super로 하는 것이 효율적 & 일반적인 방법)
		
//		this.mobileName = mobileName;
//		this.batterySize = batterySize;
//		this.osType = osType;
	}

	public void operate(int time) {
		setBatterySize(batterySize + (-time * 10));
	}

	public void charge(int time) {
		setBatterySize(batterySize + (time * 10));
	}
}
