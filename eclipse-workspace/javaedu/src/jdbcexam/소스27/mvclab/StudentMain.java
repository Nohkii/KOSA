package jdbcexam.mvclab;
import java.util.Scanner;
public class StudentMain {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String num="";
		String name="";
		int score=0;
		StudentController sc = new StudentController();
		end: while(true) {
			choice();
			num = scan.next();
			switch(num) {
			case "1" :
				sc.printAll();
			break;
			case "2" :
				System.out.println("학생의 이름을 입력해주세요.");
				name = scan.next();
				System.out.println("학생의 점수를 입력해주세요.");
				score = scan.nextInt();
				sc.insert(name, score);
				break;
			case "3":
				System.out.println("삭제하려는 학생의 이름을 입력해주세요.");
				name = scan.next();
				sc.delete(name);
				break;
			case "4":
				System.out.println("수정하려는 학생의 이름을 입력해주세요.");
				name = scan.next();
				System.out.println("수정하려는 학생의 점수를 입력해주세요.");
				score = scan.nextInt();
				sc.update(name, score);
				break;
			case "5" :
				System.out.println("점수를 확인하고 싶은 학생의 이름을 입력해주세요.");
				name = scan.next();
				sc.printScore(name);
				break;
			case "6":
				System.out.println("프로그램이 종료됩니다.");
				break end;
			}
		}
	}
	static void choice() {
		System.out.println("\n처리하려는 기능을 선택하세요.");
		System.out.println("1. 학생 정보 출력 ");
		System.out.println("2. 학생 정보 입력");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 점수 확인");
		System.out.println("6. 종료\n");
		System.out.println("입력 :");
	}
}