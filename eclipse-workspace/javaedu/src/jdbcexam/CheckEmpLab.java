package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CheckEmpLab {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs;
		String name="";
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("직원의 이름을 입력하세요 >");
			name = scan.next();
			rs = stmt.executeQuery(
					"SELECT ename, year(hiredate), month(hiredate), deptno FROM emp where ename = '" + name + "'");
			if (rs.next()) {
				do {
					System.out.printf("%s 직원은 근무중입니다.\n%d년 %d월에 입사했고 현재 %d번 부서에서 근무하고 있습니다.\n", rs.getString("ename"),
							rs.getInt("year(hiredate)"), rs.getInt("month(hiredate)"), rs.getInt("deptno"));
				} while (rs.next());
			} else {
				System.out.println(name + "직원은 존재하지 않습니다.");
			}
			System.out.println("계속 검토하시려면 1을 종료하시려면 2를 입력해주세요"); 
			if (scan.nextInt() == 2) {
				System.out.println("직원 확인이 종료됩니다.");
				break;
			}
		}
		scan.close(); // 스캐너 잘 닫아주자,,
		rs.close();
		stmt.close();
		conn.close();
	}
}
