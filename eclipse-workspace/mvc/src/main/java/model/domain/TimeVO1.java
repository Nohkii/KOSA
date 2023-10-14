package model.domain;

import java.time.LocalTime;

public class TimeVO1 {
	private int hour;
	private int minute;
	void hour(){
		this.hour=LocalTime.now().getHour();
	}
	void minute(){
		this.minute=LocalTime.now().getMinute();
	}
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}
}
