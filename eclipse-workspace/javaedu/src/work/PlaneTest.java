package work;

public class PlaneTest {
	public static void main(String[] args) {
		Plane[] plane = {
				new Airplane("L747", 1000), 
				new Cargoplane("C40", 1000) 
				};
		printInfo(plane);
//		((Airplane) (plane[0])).flight(100);
//		((Cargoplane) (plane[1])).flight(100);
		/**
		 * 어차피 알아서 먼저 자식객체에 있는 메소드를 찾아가기때문에 
		 * 형변환해주지 않아도 된다(?) (자식 찾아보고 없으면 부모 찾아감)
		 */
		plane[0].flight(100);
		plane[1].flight(100);
		System.out.println("\n[100 운항]");
		printInfo(plane);
		System.out.println("\n[200 주유]");
		plane[0].refuel(200);
		plane[1].refuel(200);
		printInfo(plane);
	}

	public static void printInfo(Plane[] list) {
		System.out.println("Plane\t\tfuelSize");
		System.out.println("--------------------");
		for (Plane p : list) {
			System.out.println(p.getPlaneName() + "           " + p.getFuelSize());
		}
	}
}