package jdbcexam.mvclab;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jdbcexam.mvc.MySQLConnUtil;
public class StudentDAO {
	Scanner scan;
	public boolean insertStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("insert into student (name, score) values (?, ?)")) {
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getScore());
			pstmt.executeUpdate();
			System.out.println("student 테이블에 데이터 삽입 완료");
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		MySQLConnUtil.close(conn);
		return result;
	}
	public List<StudentDTO> getAllStudent(){
		List<StudentDTO> student = new ArrayList<>();
		Connection conn = MySQLConnUtil.connect();
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("select name, score from student");
			while (rs.next()) {
				StudentDTO vo = new StudentDTO();
				vo.setName(rs.getString("name"));
				vo.setScore(rs.getInt("score"));
				student.add(vo);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return student;
	}
	public int getScore(StudentDTO dto) {
		int score = -1;
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn
				.prepareStatement("select score from student where name = ?")) {
			pstmt.setString(1, dto.getName());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				do {
				score = rs.getInt("score");					
				}while(rs.next());
			}else {
				System.out.println("점수가 존재하지 않습니다.");
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return score;
	}
	public boolean updateStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("update student set score = ? where name = ?")) {
			pstmt.setInt(1, dto.getScore());
			pstmt.setString(2, dto.getName());
			pstmt.executeUpdate();		
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}
	public boolean deleteStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = MySQLConnUtil.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("delete from student where name = ?")) {
			pstmt.setString(1, dto.getName());
			pstmt.executeUpdate();
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQLConnUtil.close(conn);
		return result;
	}
}