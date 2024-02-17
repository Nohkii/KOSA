package day2;

public class TimeTest {
	public static void main(String[] args) {
		int time = 32150; // 초
		int min = time / 60; // 분
		int hour = time / 3600;
		min = min - (hour * 60);
		time = time - ((hour * 3600) + (min * 60));
		System.out.printf("%d시간 %d분 %d초", hour, min, time);
	}
}