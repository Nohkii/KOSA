package day7;
import java.util.Scanner;
import day6.MethodLab7;
class GradeExpr {
	int[] jumsu;

	GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	};
// 수정한 코드)
// 똑같은 코드 
	double getAverage() {
		return  getTotal() / jumsu.length;
	}
// 기존 코드) 같은 코드 반복하지 않고 아래 만든 getTotal() 재활용하면 된다~
//	double getAverage() {
//		double sum = 0;
//		for (int i = 0; i < jumsu.length; i++) {
//			sum += jumsu[i];
//		}
//		return sum / jumsu.length;
//	}
	int getTotal() {
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;
	}
	int getGoodScore() {
		int max = 0;
		for (int i = 0; i < jumsu.length; i++) {
			max = jumsu[0];
			if (max < jumsu[i]) {
				max = jumsu[i];
			}
		}
		return max;
	}
	int getBadScore() {
		int min = 0;
		for (int i = 0; i < jumsu.length; i++) {
			min = jumsu[0];
			if (min > jumsu[i]) {
				min = jumsu[i];
			}
		}
		return min;
	}
}
public class GradeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("처리하려는 데이터의 갯수를 입력해주세요.");
		int[] ary = new int[scan.nextInt()];
		System.out.println("저장할 숫자들을 입력해주세요.");
		for (int i = 0; i < ary.length; i++) {
			ary[i] = scan.nextInt();
		}
		System.out.print("점수들 : ");
		MethodLab7.printArray(ary);
		GradeExpr ge = new GradeExpr(ary);
		System.out.printf("총점 : %d\n평균 : %.2f\n최고 점수 : %d\n최저 점수 : %d", ge.getTotal(), ge.getAverage(),
				ge.getGoodScore(), ge.getBadScore());
		scan.close();
	}
}