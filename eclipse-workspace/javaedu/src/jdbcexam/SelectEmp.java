package jdbcexam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SelectEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		// 이걸 jdbc url이라고 한다
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd); // 디비 서버에 접속 (가장 먼저 할 일) 
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select ename, job, format(sal, 0) sal, deptno  from emp");
		System.out.printf("%10s%10s%10s%10s\n", "성명", "직무", "급여", "부서");
		System.out.println("  -----------------------------------------");
		while (rs.next()) {
				System.out.printf("%10s%10s%10s원%10d\n", 
						rs.getString("ename"), rs.getString("job"), 
						rs.getString("sal"), // format함수에 의해 int -> Stirng으로 바뀌었기 때문에  getString을 써야함
						rs.getInt("deptno"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
