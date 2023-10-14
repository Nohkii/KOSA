package jdbcexam.mvclab;
import java.util.List;
public class StudentController {
	StudentDTO dto = new StudentDTO();
	StudentDAO dao = new StudentDAO();
	List<StudentDTO> list = null;
	void printAll() {
		list = dao.getAllStudent();
		for (StudentDTO st : list) {
			System.out.println(st);
		}
	}
	void printScore(String name) {
		dto.setName(name);
		int num = dao.getScore(dto);
		if (num < 0) {
			System.out.println(name + "학생은 존재하지 않습니다.");
		} else {
			System.out.println(name + "학생의 점수는 " + num + "입니다.");
		}
	}
	void insert(String name, int score) {
		dto.setName(name);
		dto.setScore(score);
		if (dao.insertStudent(dto)) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력실패");
		}
	}
	 void update(String name, int score) {
		 dto.setName(name);
		 dto.setScore(score);
		 if(dao.updateStudent(dto)) {
			 System.out.println(name+"학생의 점수를 변경했습니다.");
		 }else {
			 System.out.println(name+"학생은 존재하지 않습니다.");
		 }
	 }
	 void delete(String name) {
		 dto.setName(name);
		 if(dao.deleteStudent(dto)) {
			 System.out.println(name+"학생의 데이터를 삭제했습니다.");
		 }else {
			 System.out.println(name+"학생은 존재하지 않습니다.");
		 }
	 }
}