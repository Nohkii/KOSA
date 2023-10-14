package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchEmp2 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select ename, job, sal, deptno  from emp where ename like '%T%'");
		if (rs.next()) {
			System.out.printf("%8s%8s%8s%4s\n", "성명", "직무", "급여", "부서");
			System.out.println("  -----------------------------------");
			do {
				System.out.printf("%10s%12s%8d%4d\n", rs.getString("ename"), rs.getString("job"), rs.getInt("sal"),
						rs.getInt("deptno"));
			}while (rs.next()); 
			// select된 결과를 읽어올 때 foward방식으로 내려올 수만 있음 -> do-while문을 사용해서 위에 있는 rs.next()를 가져오면 됨
		} 
		else {
			System.out.println("이름에 X가 들어간 직원은 없습니다.");
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
