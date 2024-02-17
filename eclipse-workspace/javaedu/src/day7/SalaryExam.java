package day7;
import java.util.Scanner;
class SalaryExpr {
	int bonus;

	SalaryExpr() {
		this(0); // 초기화안해도 기본값 0을 가지기는 한다~
	} // 블럭 뒤에는 세미콜론을 주지 않음
	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	int getSalary(int grade) {
		if (grade == 1) {
			return this.bonus + 100; // 기존 코드)매개변수와 이름이 다를 경우 this를 붙이지 않음
		} else if (grade == 2) {
			return bonus + 90; // 수정한 코드)
		} else if (grade == 3) {
			return bonus + 80;
		} else {
			return bonus + 70;
		}
	}
}
public class SalaryExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월 정보를 입력하세요. \n월 >");
		int month = scan.nextInt();
		System.out.println("1부터 4까지 등급 정보를 입력하세요. \n등급 >");
		int grade = scan.nextInt();		
		SalaryExpr se;
		if (month % 2 == 0) {
			se = new SalaryExpr(100);
		} else {
			se = new SalaryExpr();
		}
		System.out.println(month + "월 " + grade + "등급의 월급은 " + se.getSalary(grade) + "입니다.");
// ! 같은 문장을 2번 반복하지 않도록 줄이는 법 !
//		if (month % 2 == 0) {
//			SalaryExpr se = new SalaryExpr(100);
//			System.out.println(month + "월 " + grade + "등급의 월급은 " + se.getSalary(grade) + "입니다.");
//		} else {
//			SalaryExpr se = new SalaryExpr();
//			System.out.println(month + "월 " + grade + "등급의 월급은 " + se.getSalary(grade) + "입니다.");
//		}
		scan.close();
	}
}