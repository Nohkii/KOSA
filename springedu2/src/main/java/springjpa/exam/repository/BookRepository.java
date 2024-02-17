package springjpa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springjpa.exam.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
public  List<Book> findByPriceGreaterThanEqual(int price);
  //  전달된 가격 정보와 동일하거나 비싼 도서 리스트를 리턴하는 메서드
  public  List<Book> findByPriceGreaterThan(int price);
  //  전달된 가격 정보보다 비싼 도서 리스트를 리턴하는 메서드
  public  List<Book> findByKind(String keyword);
  //  전달된 분류 정보와 동일한 도서 리스트를 리턴하는 메서드
  public  Long countByKind(String keyword);
  // 전달된 분류 정보에 속하는 도서의 개수를 리턴하는 메서드
  public List<Book> findByTitleContainingOrTitleContaining(String keyword1, String keyword2);
//  전달된 2개의 아규먼트중 하나를 도서 제목에 포함하는 도서 리스트를 리턴하는 메서드
  public  List<Book> findTop1ByOrderByPrice();
//  가격이 가장 싼 도서를 리턴하는 메서드
  public  List<Book> findByTitleStartsWith(String partname);
//  도서 제목이 전달된 아규먼트 값으로 시작하는 도서 리스트를 리턴하는 메서드
  @Query("select b.kind, sum(b.price) from Book b group by kind")
  public  List<Object[]> averagePriceByKind();
  //분류별 도서 가격의 평균을 리턴하는 메서드
}
