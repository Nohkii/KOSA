package day11;

public class ExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("수행시작");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println("연산 결과 : " + result);
		}
//			catch (Exception e) {
//				System.out.println("예외발생!!----"+e);
//			}
// 			=> Exception이 가장 위에 올라가면 얘가 모든 에러를 잡아버리기 때문에 
//		밑에 있는 catch블록들에서 에러가 남
//     조상 예외 catch블록일 수록 아래에 작성해야 함
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("프로그램 아규먼트를 2 개 전달하세요!!");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.getMessage();
			System.out.println("두번째 프로그램 아규먼트는 0이 아닌 값을 전달하세요!!");
			return;
			// 프로그램 수행을 끝내겠다는 의미 -> finally는 실행되지만 '수행종료'가 출력되지 않음
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("프로그램 아규먼트로 숫자를 전달하세요!!");
		} finally {
			System.out.println("항상 수행!!");
			// 위에서 파일여는 기능을 넣었을 경우 파일 닫는 기능을 여기 넣어두기도 한다~
		}
		System.out.println("수행종료");
	}
}