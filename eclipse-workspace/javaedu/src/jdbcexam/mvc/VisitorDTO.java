package jdbcexam.mvc;
// 행단위로 객체를 생성한다~
public class VisitorDTO {
	private int id;	
	private String name;
	private String writeDate;
	private String memo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	// 객체정보를 하나로 리턴받겠다~
	@Override
	public String toString() {
		return "[id="+id+", name=" + name + ", writeDate=" + writeDate + ", memo=" + memo + "]";
	}	
}
