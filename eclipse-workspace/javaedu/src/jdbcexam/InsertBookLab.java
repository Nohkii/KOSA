package jdbcexam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertBookLab {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		int count = 0;
		int num = 0; 
		String yn;
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstmt = conn.prepareStatement("insert into book(title, price, kind) values (?,?,?)");
				Scanner scan = new Scanner(System.in);) {
			while (true) {
				System.out.print("도서명을 입력하세요 :");
				pstmt.setString(1, scan.next());
				System.out.print("가격을 입력하세요 :");
				pstmt.setInt(2, scan.nextInt());
				scan.nextLine();
				System.out.print("도서분류에 대한 넘버를 입력하세요.\r\n" + "	    1. 프로그래밍 언어\r\n" + "	    2. 웹 프로그래밍\r\n"
						+ "	    3. 빅데이터\r\n" + "	    4. 데이터베이스\r\n" + "	    5. 인프라\r\n" + "            선택(1~5) :");
				num = scan.nextInt();
				// pstmt.setString(3, "b0"+num); -> 입력한 수 더해서 바로 set한다~
				if (num == 1) {
					pstmt.setString(3, "b01");
				} else if (num == 2) {
					pstmt.setString(3, "b02");
				} else if (num == 3) {
					pstmt.setString(3, "b03");
				} else if (num == 4) {
					pstmt.setString(3, "b04");
				} else if (num == 5) {
					pstmt.setString(3, "b05");
				}
				int rs = pstmt.executeUpdate();
				count++;
				System.out.println("정보가 입력되었습니다./n계속 입력하겠습니까?(y/n)");
				yn = scan.next();
				// y가 아니면 break해라 이거만 해도 괜찮다~
				
				if (yn.equalsIgnoreCase("y")) { // 소문자 y와 대문자 Y모두 처리할 수 있도록
//					if (yn.equals("y")) {					
					continue;
				} else if (yn.equals("n")) {
					System.out.println(count + "개의 데이터 입력 완료!");
					break;
				}
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}