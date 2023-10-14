package day15;

import javax.swing.JOptionPane;
// 입력할 때까지 아래에 있는 반복문은 대기상태로 있음
class ThreadEx06 {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요. 입력할 때까지 일 안합니다..(^^)");
		System.out.println("입력하신 값은 " + input + "입니다.");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
