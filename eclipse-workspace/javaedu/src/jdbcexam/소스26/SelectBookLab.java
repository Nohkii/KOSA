package jdbcexam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectBookLab {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		String num = "";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmt = conn.createStatement();
				Scanner scan = new Scanner(System.in);) {
			ResultSet rs = null;
			while (true) {
				System.out.print("	1. 모두 출력하기\r\n" + "	2. 가격이 높은 순으로 출력하기\r\n" + "	3. 20000 이상의 도서들만 출력하기 \r\n"
						+ "	4. 웹 프로그래밍 도서들만 출력하기\r\n" + "	5. 데이터베이스와 인프라 도서들만 출력하기\r\n"
						+ "	6. 도서명에 '자바'를 포함하는 도서들만 출력하기\r\n" + "	7. 분류별 도서 가격의 평균을 출력하기 \n\r원하는 메뉴의 번호를 선택 : ");
				num = scan.next();
				if (num.equals("1")) {
					print1(stmt.executeQuery("select title, concat(format(price,0),'원') as price, kind from book"));
				} else if (num.equals("2")) {
					print1(stmt.executeQuery("select * from book order by price desc"));
				} else if (num.equals("3")) {
					print2(stmt.executeQuery("select * from book where price >= 20000"));
				} else if (num.equals("4")) {
					print1(stmt.executeQuery("select * from book where kind = 'b02'"));
				} else if (num.equals("5")) {
					print2(stmt.executeQuery("select * from book where kind = 'b04' or kind = 'b05'"));
				} else if (num.equals("6")) {
					print2(stmt.executeQuery("select * from book where title like '%자바%'"));
				} else if (num.equals("7")) {
					rs = stmt.executeQuery("select concat(format(avg(price),0),'원') price, kind from book group by kind");
					while(rs.next()) {
						if(rs.getString("kind").equals("b01")) {
						System.out.println("프로그래밍 언어 도서들의 가격 평균은 " + rs.getInt("price") + "입니다.");
						}else if(rs.getString("kind").equals("b02")) {
							System.out.println("웹 프로그래밍 도서들의 가격 평균은 " + rs.getInt("price") + "입니다.");
						}else if(rs.getString("kind").equals("b03")) {
							System.out.println("빅데이터 도서들의 가격 평균은 " + rs.getInt("price") + "입니다.");
						}else if(rs.getString("kind").equals("b04")) {
							System.out.println("데이터베이스 도서들의 가격 평균은 " + rs.getInt("price") + "입니다.");
						}else if(rs.getString("kind").equals("b05")) {
							System.out.println("인프라 도서들의 가격 평균은 " + rs.getInt("price") + "입니다.");
						}
					}
				}
				System.out.println("\n계속 처리하시겠습니까? y/n");
				num = scan.next();
				if (num.equals("y")) {
					continue;
				} else if (num.equals("n")) {
					break;
				}
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
	public static void print1(ResultSet rs) throws SQLException {
		System.out.println("도서 제목\t\t가격\t\t분류코드\t");
		System.out.println("==========================");
		if (rs.next()) {
			do {
				System.out.printf("%-40s%-10s%-10s\n", rs.getString("title"), rs.getString("price"),
						rs.getString("kind"));
			} while (rs.next());
		}
	}
	public static void print2(ResultSet rs) throws SQLException {
		System.out.println("도서 제목\t\t가격");
		System.out.println("==========================");
		if (rs.next()) {
			do {
				System.out.printf("%-40s%-10s%-10s\n", rs.getString("title"), rs.getString("price"),
						rs.getString("kind"));
			} while (rs.next());
		}
	}
}