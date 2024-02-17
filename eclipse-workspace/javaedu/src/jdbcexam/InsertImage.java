package jdbcexam;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

// conn, scan, pstme 모두 try-catch-resource방식으로 객체를 생성해서 close를 안해줘도 괜찮음
public class InsertImage {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Scanner scan = new Scanner(System.in);
				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO imgtest (filename, imgcontent) VALUES (?, ?)")){
			System.out.print("저장할 이미지 파일명을 절대 패스로 입력하세요 : "); // 절대패스니까 c:/iotest/파일명
			String name = scan.nextLine();
			File imgFile = new File(name); 
			if (imgFile.exists()) { // 파일이 존재하는지 확인
				FileInputStream fin = new FileInputStream(imgFile); 
				// 이미지 파일의 내용을 읽어서 디비에 넣을거니까 바이너리 타입이니까 바이너리 타입 객체 생성
				pstmt.setString(1, imgFile.getName()); // 파일 이름 설정
				pstmt.setBinaryStream(2, fin, (int)imgFile.length()); 
				// 파일 바이너리 객체 설정(fin : 읽어올 FileInputStream 객체 , (int)imgFile.length() : long형을 int형으로 변환해서 파일 길이 입력(얼마나 읽어올지))
				pstmt.executeUpdate(); // 
				System.out.println("이미지 삽입 성공");
			} else {
				System.out.println("[오류] 이미지가 존재하지 않음");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
