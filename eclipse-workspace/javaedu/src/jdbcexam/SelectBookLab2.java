package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectBookLab2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		String num = "";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmt = conn.createStatement();
				Scanner scan = new Scanner(System.in);) {
			ResultSet rs = null;
			System.out.print("	1. 모두 출력하기\r\n" + "	2. 가격이 높은 순으로 출력하기\r\n" + "	3. 20000 이상의 도서들만 출력하기 \r\n"
					+ "	4. 웹 프로그래밍 도서들만 출력하기\r\n" + "	5. 데이터베이스와 인프라 도서들만 출력하기\r\n"
					+ "6. 도서명에 '자바'를 포함하는 도서들만 출력하기\r\n" + "	7. 분류별 도서 가격의 평균을 출력하기 \n\r원하는 메뉴의 번호를 선택 : ");
			num = scan.next();
			if (num.equals("1")) {
				
//				rs = stmt.executeQuery("select title, concat(format(price,0),'원') as price, kind from book");			 
				print(stmt.executeQuery("select title, concat(format(price,0),'원') as price, kind from book"));
//				titlePrint(1);
//				if (rs.next()) {
//					do {
//						System.out.printf("%-30s\t%-10s\t%-10s\t\n", rs.getString("title"), rs.getString("price"),
//						rs.getString("kind"));
//					} while (rs.next());
//				}
			} else if (num.equals("2")) {
				rs = stmt.executeQuery("select * from book order by price desc");
				titlePrint(1);
				if (rs.next()) {
					do {
						System.out.printf("%-30s\t%-10d\t%-10s\t\n", rs.getString("title"), rs.getInt("price"),
								rs.getString("kind"));
					} while (rs.next());
				}
			} else if (num.equals("3")) {
				rs = stmt.executeQuery("select * from book where price >= 20000");
				titlePrint(2);
				if (rs.next()) {
					do {
						System.out.printf("%-30s\t%-10d\tn", rs.getString("title"), rs.getInt("price"));
					} while (rs.next());
				}
			} else if (num.equals("4")) {
				rs = stmt.executeQuery("select * from book where kind = b02");
				titlePrint(1);
				if (rs.next()) {
					do {
						System.out.printf("%-30s\t%-10d\tn", rs.getString("title"), rs.getInt("price"));
					} while (rs.next());
				}
			} else if (num.equals("5")) {
				rs = stmt.executeQuery("select * from book where kind = b04 or kind = b05");
				titlePrint(2);
				if (rs.next()) {
					do {
						System.out.printf("%-30s\t%-10d\tn", rs.getString("title"), rs.getInt("price"));
					} while (rs.next());
				}
			} else if (num.equals("6")) {
				rs = stmt.executeQuery("select * from book where title like ='%자바%'");
				titlePrint(2);
				if (rs.next()) {
					do {
						System.out.printf("%-30s\t%-10d\tn", rs.getString("title"), rs.getInt("price"));
					} while (rs.next());
				}
			} else if (num.equals("7")) {
				rs = stmt.executeQuery("select avg(price) from book group by kind = 1");
				if (rs.next()) {
					do {
						System.out.println("프로그래밍 언어 도서들의 가격 평균은 "+rs.getInt("price")+"입니다.");
					} while (rs.next());
				}
			}
//			rs.close();
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
	public static void print(ResultSet rs) throws SQLException {		 
		titlePrint(1);
		if (rs.next()) {
			do {
				System.out.printf("%-30s\t%-10s\t%-10s\t\n", rs.getString("title"), rs.getString("price"),
				rs.getString("kind"));
			} while (rs.next());
		}
	}
	public static void titlePrint(int i) {
		if(i ==1) {
			System.out.println("도서 제목\t\t가격\t\t분류코드\t");
			System.out.println("==========================");			
		}else {
			System.out.println("도서 제목\t\t가격");
			System.out.println("==========================");	
		}
	}
}
