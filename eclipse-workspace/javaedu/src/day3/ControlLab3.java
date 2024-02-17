package day3;

public class ControlLab3 {
	public static void main(String[] args) {
		int random;
		String text = "";
		while (true) {
			random = (int) (Math.random() * 120) + 1;
			if (random < 50) {
				text += random + ": 50 미만\n";
				if (random % 10 == 3) {
					text += random + ": *듀크팀*\n";
				}
			} else if (random >= 50 && random <= 80) {
				text += random + ": 50 이상 80 이하\n";
				if (random >= 70 && random <= 79) {
					text += random + ": *턱시팀*\n";
				}
			} else if (random >= 81 && random <= 100) {
				continue;
			} else {
				break;
			}
		}
		System.out.printf("%s", text);
	}
}
