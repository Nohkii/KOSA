package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
// alias로도 사용 가능하다!~
public class SelectEmpLab {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url,user,passwd);
		Statement stmt = conn.createStatement();
		Random ran = new Random();
		ResultSet rs;
		if(ran.nextBoolean()) {
			rs = stmt.executeQuery("SELECT ename, concat(format(sal,0),'달러') fsal FROM emp");
			while (rs.next()) {
				System.out.printf("%s 직원의 월급은 %s입니다.\n", rs.getString("ename"), rs.getString("fsal")); 
			}
		}else {
			rs = stmt.executeQuery("SELECT ename, date_format(hiredate,'%Y년 %m월 %d일') FROM emp order by hiredate");
//			rs = stmt.executeQuery("SELECT ename, year(hiredate) y, month(hiredate),dayofmonth(hiredate)  FROM emp order by hiredate");
			while (rs.next()) {
				System.out.printf("%s 직원은 %d년 %d월 %d일 입사하였습니다.\n", rs.getString("ename"), rs.getInt("y"), rs.getInt("month(hiredate)"),rs.getInt("dayofmonth(hiredate)"));
			}
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}