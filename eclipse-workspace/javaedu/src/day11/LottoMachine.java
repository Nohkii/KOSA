package day11;
import java.util.Random;

public class LottoMachine {
	int[] nums;

	LottoMachine() {
		nums = new int[6];
	}

	public void createLottoNums() {
//		Random randomNum;
		Random randomNum = new Random();
		// 반복문 안에서 객체생성하지않도록 조심해라~
		for (int i = 0; i < 6; i++) {
			nums[i] = randomNum.nextInt(20) + 1;
		}
	}
	public void checkLottoNums() throws DuplicateException {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
				// 예외가 생기면 DuplicateException()를 발생시켜서 던진다~
					throw new DuplicateException();
				} else {
					getNums();
				}
			}
		}
	}
	public int[] getNums() {
		return nums;
	}
}