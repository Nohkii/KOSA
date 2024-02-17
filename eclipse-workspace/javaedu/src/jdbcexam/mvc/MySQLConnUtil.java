package jdbcexam.mvc;
import java.sql.Connection;
import java.sql.DriverManager;
// util로 끝나는 데이터의 경우 유용하게 사용할 수 있다는 의미이다~
public class MySQLConnUtil {
	public static Connection connect() {
		Connection conn = null;
		try {		
			String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "jdbctest";
			String passwd = "jdbctest";
			conn = DriverManager.getConnection(url, user, passwd);						
		} catch (Exception e) {
			System.out.println("MYSQL 연결 실패");
			System.out.print("사유 : " + e.getMessage());
		}
		return conn;
	}
	public static void close(Connection conn) {
		try {
			if (conn != null) 
				conn.close();
		} catch (Exception e) {
			System.out.println("MYSQL 닫기 실패");
			System.out.print("사유 : " + e.getMessage());
		}
	}
}