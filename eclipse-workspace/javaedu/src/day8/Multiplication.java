package day8;
import day6.MethodLab5;
class Multiplication {
	private int dan;
	private int number;
	Multiplication() {
	}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}
	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.print(dan * number);
		}
	}
}

class GuGuDanExpr extends Multiplication {
	GuGuDanExpr() {
	};
	GuGuDanExpr(int dan) {
		super(dan);
	};
	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	};
	public static void printAll() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%d\t", i, j, i * j);
			}
			System.out.println();
		}
	}
}
class GuGuDanApp {
	public static void main(String[] args) {
		int dan = MethodLab5.getRandom(1, 20);
		int number = MethodLab5.getRandom(1, 20);
		GuGuDanExpr gugu;
		if (1 <= dan && dan <= 9 && 1 <= number && number <= 9) {
			gugu = new GuGuDanExpr(dan, number);
			System.out.print(dan + "*" + number + "=");
			gugu.printPart();
		} else if (1 <= dan && dan <= 9 && number >= 10) {
			gugu = new GuGuDanExpr(dan);
			System.out.print(dan + "단 : ");
			gugu.printPart();
		} else if (dan >= 10) {
			gugu = new GuGuDanExpr();
			gugu.printAll();
		}
	}
}