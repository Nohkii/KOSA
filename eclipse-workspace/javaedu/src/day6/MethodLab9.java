package day6;
public class MethodLab9 {
	public static void main(String[] args) {
		System.out.println((isRightTriangle(3, 4, 5)) ? "true" : "false");
		System.out.println((isRightTriangle(1, 2, 3)) ? "true" : "false");
	}
	static boolean isRightTriangle(int width, int height, int hypo) {
		if ((width *width)+ (height*height ) == hypo * hypo) {
			return true;
		}
		return false;
	}
}
