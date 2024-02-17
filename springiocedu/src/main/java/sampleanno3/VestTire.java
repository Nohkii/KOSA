package sampleanno3;

import org.springframework.stereotype.Component;

@Component // name = vestTire -> 이름을 지정하지않은경우
public class VestTire implements Tire{

	public VestTire() {
		System.out.println("VestTire - Create object");
	}
	@Override
	public String getBrand() {
		return "MICHELIN Tire!!";
	}
}
