package jdbcexam;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

// 연결하고 서버명 띄우기(이거 하려면 buildPath가서 jar파일 등록해야 실행됨)
public class ConnectMySQL {
	public static void main(String[] args) {
		
// 이전에는 로딩시키려면 아래 코드부분이 필요했는데 이제는 없어도 가능하다~(build path만 등록하면 됨)
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException cnfe) {
//			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
//			return;
//		}
		
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		
		try (Connection conn = DriverManager.getConnection(url, user, passwd);){
			// 만들어진 Connection객체의 이름알기
			System.out.println("이름이 뭐니: "+conn.getClass().getName());
			DatabaseMetaData md = conn.getMetaData();
			System.out.println("DBMS 서버 명 : "+md.getDatabaseProductName());
			System.out.println("DBMS 서버 버전 : "+md.getDatabaseProductVersion());
			System.out.println("사용자명 : "+md.getUserName()); 						
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
