package day15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import day7.Book;
public class AnonyInnerLab {
//	void pr(ArrayList<Book> list) {
//		Collections.sort(list,new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//				if (o1.getPrice() > o2.getPrice()) return 1;
//				else if (o1.getPrice() < o2.getPrice()) return -1;
//				else return 0;
//			}
//		});
//		for(Book b : list) {
//			System.out.println(b);
//		}
//	}
	public static void main(String[] args) {
		AnonyInnerLab al = new AnonyInnerLab();
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("자바의 정석","남궁성",27000));
		list.add(new Book("챗GPT","반병현",11700));
		list.add(new Book("스타트 스프링 부트","남가람",27000));
		list.add(new Book("Doit! 자바프로그래밍","박은중",22500));
		list.add(new Book("이것이 자바다","신용권, 임경균",36000));
		for(Book b : list) {
			System.out.println(b);
		}
//		al.pr(list); -> 굳이 따로 안 빼고 sort 메소드 안에서 바로 해도 됨
//		sort 메서드 호출과 동시에 Annoymous Inner 클래스 생성 
		System.out.println("[소팅 후]");
		Collections.sort(list,new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				if (o1.getPrice() > o2.getPrice()) return 1;
				else if (o1.getPrice() < o2.getPrice()) return -1;
				else return 0;
			}
		});
		for(Book b : list) {
			System.out.println(b);
		}
		
	}
}