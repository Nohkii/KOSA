package day13;

import java.io.InputStreamReader;

public class StandardInput {
	public static void main(String[] args) throws Exception{
	System.out.println("입력 : ");
	int input =  new InputStreamReader(System.in).read(); // 키보드 입력(read -> 키보드로부터 1byte를 읽어라)
	System.out.println("입력된 데이터 : "+(char)input);

	}
}
