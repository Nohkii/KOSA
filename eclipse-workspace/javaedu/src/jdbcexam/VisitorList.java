package jdbcexam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class VisitorList {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url,user,passwd);
		Statement stmt = conn.createStatement();
		String sql = "SELECT id, name, writedate, memo FROM visitor";
		ResultSet rs = stmt.executeQuery(sql);		
		while(rs.next()) {
			System.out.print(rs.getString("id")+"\t");
			System.out.print(rs.getString("name")+"\t");
			System.out.print(rs.getString("writedate")+"\t");
			System.out.println(rs.getString("memo"));
		}	
		// 객체가 만들어진 역순으로 close해라~
		rs.close();
		stmt.close();
		conn.close();
	}
}