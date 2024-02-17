package day7;
public class Book {
	String title;
	String author;
	int price;
	
	public Book() {
		this("이것이 자바다", "신용권", 36000);
	};
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getBookInfo() {
		return title + "   " + author + "   " + price;
	}
	public String toString() {
		return "제목: "+title + "\t저자: "+ author + "\t가격: "+ price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
class BookTest {
	public static void main(String[] args) {
		// 객체는 반복문을 돌릴 수가 없음
		Book b1 = new Book();
		Book b2 = new Book("해리포터1", "조앤 롤링", 10000);
		Book b3 = new Book("해리포터2", "조앤 롤링", 20000);
		Book b4 = new Book("해리포터3", "조앤 롤링", 30000);
		Book b5 = new Book("자바의 정석","남궁성",20000);
		
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
		System.out.println(b4.getBookInfo());
		System.out.println(b5.getBookInfo());
	}
}