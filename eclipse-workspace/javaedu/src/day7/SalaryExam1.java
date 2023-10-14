package day7;

import java.util.Scanner;

class SalaryExpr1 {
	int bonus;

	SalaryExpr1() {
		this(0);
	};

	SalaryExpr1(int bonus) {
		this.bonus = bonus;
	}

	int getSalary(int grade) {
		if (grade == 1) {
			return this.bonus + 100;
		} else if (grade == 2) {
			return this.bonus + 90;
		} else if (grade == 2) {
			return this.bonus + 80;
		} else {
			return this.bonus + 70;
		}
	}
}

public class SalaryExam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월 정보를 입력하세요.");
		System.out.println("월 >");
		int month = scan.nextInt();
		System.out.println("1부터 4까지 등급 정보를 입력하세요.");
		System.out.println("등급 >");
		int grade = scan.nextInt();
//		while (grade < 0 && grade > 4) {
//			System.out.println("등급을 다시 입력하세요");
//			grade = scan.nextInt();
//			if (grade > 0 && grade < 5) {
//				break;
//			}
//		}
		if (month % 2 == 0) {
			SalaryExpr1 se = new SalaryExpr1(100);
			System.out.println(month + "월 " + grade + "등급의 월급은 " + se.getSalary(grade) + "입니다.");
		} else {
			SalaryExpr1 se = new SalaryExpr1();
			System.out.println(month + "월 " + grade + "등급의 월급은 " + se.getSalary(grade) + "입니다.");
		}
	}
}
