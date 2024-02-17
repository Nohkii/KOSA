package day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput3 {
	public static void main(String[] args) throws Exception{
	System.out.println("입력 : ");
	String input =  new BufferedReader(new InputStreamReader(System.in)).readLine(); 
	System.out.println("입력된 데이터 : "+input);
	}
}
