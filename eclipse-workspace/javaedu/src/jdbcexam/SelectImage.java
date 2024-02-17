package jdbcexam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectImage {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Scanner scan = new Scanner(System.in);
				PreparedStatement pstmt = conn.prepareStatement("SELECT filename, imgcontent FROM imgtest WHERE filename = ?");) {
			System.out.print("읽으려는 이미지의 파일명을 입력하세요 : ");
			String name = scan.nextLine();
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery(); // select 하니까 resultSet객체 반환
			if (rs.next()) {
				String imgName[] = rs.getString("filename").split("\\."); // 뒤에 확장자 때기	
				// 백슬래시\를 붙여서 일반문자 '.'임을 알려야 함 + \를 사용할 때는 \를 하나 더 붙여야 함
				// [0]-파일이름 [1]-확장자명
				File imgFile = new File("c:/Temp/"+imgName[0]+new Date().getTime()+"."+imgName[1]);
				InputStream is = rs.getBinaryStream("imgcontent"); // getBinaryStream을 호출하면 InputStream을 리턴
				FileOutputStream fos = new FileOutputStream(imgFile);
				byte[] b = new byte[2048]; // 2048씩 읽어오기
				int n;
				while ((n = is.read(b)) > 0) { // read()읽은 바이트 수를 리턴 읽을게 없으면 -1리턴
					fos.write(b, 0, n);
				}
				fos.close();
			} else {
				System.out.print(name + "이라는 파일명으로 저장된 이미지가 존재하지 않습니다. ");
			}
			System.out.println("이미지 읽기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
