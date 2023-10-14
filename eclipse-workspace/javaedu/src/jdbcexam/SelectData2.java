package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectData2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmt = conn.createStatement();
				Scanner scan = new Scanner(System.in);) {
			System.out.print("학생 이름을 입력하세요 : ");
			String name = scan.nextLine();
			ResultSet rs = stmt.executeQuery("select score from student where name = '" + name + "'"); 
			// 이렇게 입력받아서 하는 경우에는 안에 넣어둘 수가 없음
			if (rs.next())
				System.out.println(name + "학생의 점수 : " + rs.getInt("score"));
			else
				System.out.println(name + "학생에 대한 데이터가 없습니다.");
			System.out.println("수행 종료...");
			rs.close();
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}