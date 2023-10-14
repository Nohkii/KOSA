package mobile1;

public class MobileTest {

	public static void main(String[] args) {
		// 각각의 Mobile 객체를 생성한다.
		Ltab lt = new Ltab("Ltab", 500, "ABC-01");
		Otab ot = new Otab("Otab", 1000, "XYZ-20");
		// Mobile ot = new Otab("Otab", 1000, "XYZ-20"); -> 이렇게도 가능하다~
		// 생성된 객체의 정보를 출력한다.(printMobile() 호출)
		printTitle();
		printMobile(lt);
		printMobile(ot);
		// 각각의 Mobile 객체에 10분씩 충전을 한다.
		lt.charge(10);
		ot.charge(10);
		System.out.println("\n[10분 충전]");
		printTitle();
		// 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
		printMobile(lt);
		printMobile(ot);
		// 각각의 Mobile 객체에 5분씩 통화를 한다.
		lt.operate(5);
		ot.operate(5);
		// 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출
		System.out.println("\n[5분 통화]");
		printTitle();
		printMobile(lt);
		printMobile(ot);
	}
	public static void printMobile(Mobile mobile) {
		System.out.printf("%s\t\t%d\t\t%s\n",mobile.getMobileName(), mobile.getBatterySize(), mobile.getOsType());
	}
	public static void printTitle() {
		System.out.print("Mobile\t\tBattery\t\tOs\t\t\n");
		System.out.print("-----------------------------------------\n");
	}
}