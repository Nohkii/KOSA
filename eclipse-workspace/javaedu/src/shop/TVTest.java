package shop;
public class TVTest {
	public static void main(String[] args) {
//	SaleTV, RentalTV 클래스의 객체를 각각 생성한다.
		SaleTV sTV = new SaleTV(300000,"SALETV-1", 40, 1);
		RentalTV rTV = new RentalTV(100000, "RENTALTV-10",42,1);
//	 SaleTV 객체는 채널을 두 개 높인다.
		sTV.channelUp();
		sTV.channelUp();
//	 RentalTV 객체는 채널을 세 개 내린다.
		rTV.channelDown();			
		rTV.channelDown();			
		rTV.channelDown();			
//	 각 객체에 대하여 printAllTV()을 호출한다.
		printAllTV(sTV);
		printAllTV(rTV);
//	 Rentable 타입의 객체인 RentalTV 객체는 printRentalTV() 를 호출한다.
		printRentalTV(rTV);
	}
	static void printAllTV(TV tv) {
// 아규먼트로 전달된 객체의 toString() 을 호출하여 각 상품의 정보를 출력한다.
		System.out.println(tv.toString());
// tv 변수에 전달된 객체가 SaleTV 타입이면 sale() 메서드를 호출한다.
		if(tv instanceof SaleTV) {
			((SaleTV) tv).play();	
			((SaleTV) tv).sale();
		}else {
			/**
			 * play()메소드는 TV가 가지고 있지 않기때문에 가지고 있는 자식으로 형변환을 해줘야함 
			 */
			((RentalTV) tv).play(); 
		}
	}
	static void printRentalTV(Rentable tv) {
// 아규먼트로 전달된 Rentable 객체의 rent() 메서드를 호출한다.
		tv.rent();
	}
}