package mobile;
public class Otab extends Mobile {
	Otab() {
	}

	Otab(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public void operate(int time) {
		setBatterySize(batterySize - (time * 12));
	}

	public void charge(int time) {
		setBatterySize(batterySize + (time * 8));
	}
}
