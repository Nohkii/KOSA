package day3;

public class ForLab9 {
	public static void main(String[] args) {
		int random = (int)(Math.random()*2)+1;
		if(random ==1) {
			for(int i =1; i<=9; i+=2) {
				for (int j=1; j <=9; j+=2) {
					System.out.print(i+"x"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
		}else {
			for(int i =2; i<=9; i+=2) {
				for (int j=2; j <=9; j+=2) {
					System.out.print(i+"x"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
		}
	}
}
