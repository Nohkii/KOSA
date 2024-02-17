package day11;

import day6.MethodTest9;

public class LottoGame {
	public static void main(String[] args) {
		LottoMachine lt = new LottoMachine();
		lt.createLottoNums();
		try {
			lt.checkLottoNums();
			MethodTest9.printArray(lt.getNums());
			// 다른 패키지에 있는 클래스를 가져다쓰려면 public으로 접근제어자를 정해두고 사용해야한다
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
		}
	}
}