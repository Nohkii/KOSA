package day11;
import java.util.Random;
// 가장 일반적인 커스텀 에러 클래스의 예 
class TestException extends Exception { 
	// Exception클래스를 만들 때는 에러메시지를 전달받는 생성자를 만들고 
	// 부모의 멤버변수에 초기화가 되도록 만드는 것이 일반적이다~
	TestException(String message){
		super(message); // 조상한테 메시지 저장시켜야함
	}
}
public class ExceptionTest3 {
	public static void main(String[] args)  {
		System.out.println("main()수행시작");
		a();
		System.out.println("main()수행종료");
	}
	static void a()  {
		System.out.println("a()수행시작");
		try {
			b();
		} catch (TestException e){	
			System.out.println("오류 발생 : "+e.getMessage());
			// b를 호출한 a한테 가서 c에서 던진 message를 출력시킴
		}
		System.out.println("a()수행종료");
	}
	static void b() throws TestException {
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}
	static void c() throws TestException {
		System.out.println("c()수행시작");
		boolean flag = new Random().nextBoolean(); 
		// Math.random()대신 Random을 사용하면 다양한 타입을 생성할 수 있음
		// 객채 새롭게 생성하지 않고 .연산자로 바로 사용 가능함
		if(flag){
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>"); 
			// 부모한테 message를 넘김
		}else {
			System.out.println("ㅋㅋㅋㅋ");
		}	
		System.out.println("c()수행종료");
	}	
}