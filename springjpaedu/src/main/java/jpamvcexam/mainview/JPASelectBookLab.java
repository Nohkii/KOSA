package jpamvcexam.mainview;
import jpamvcexam.model.dto.Book;
import javax.persistence.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class JPASelectBookLab {
    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("emptest");
    static EntityManager em = factory.createEntityManager();
    public static void close() {
        em.close();
        factory.close();
    }
    public List<Book> getAllBook() {
        TypedQuery<Book> b = em.createQuery("select b from Book b", Book.class);
        return b.getResultList();
    }
    public List<Book> getAllBookSortByHighPrice() {
        TypedQuery<Book> b = em.createQuery("select b from Book b order by price desc", Book.class);
        return b.getResultList();
    }
    public List<Book> findByHigherThanPrice() {
        TypedQuery<Book> b = em.createQuery("select b from Book b where b.price >= 20000", Book.class);
        return b.getResultList();
    }
    public Book findById() {
        Book b = em.find(Book.class, 3);
        return b;
    }
    public List<Book> findByPartTitle() {
        boolean flag = new Random().nextBoolean();
        TypedQuery<Book> b;
        if (flag) {
            b = em.createQuery("select b from Book b where b.title like '%자바%'", Book.class);
        } else {
            b = em.createQuery("select b from Book b where b.title like '%스프링%'", Book.class);
        }
        return b.getResultList();
    }
    public List<Object[]> getTotalPriceByKind() {
        Query query = em.createQuery("select b.kind, sum(b.price) from Book b group by kind");
        List<Object[]> resultList = query.getResultList();
        return resultList;
    }
    public static void main(String[] args) {
        List<Book> bookList;
        Book book;
        JPASelectBookLab bookLab = new JPASelectBookLab();
        Scanner scan = new Scanner(System.in);
        loopOut:
        while (true) {
            System.out.printf("1. 모두 출력하기%n2. 가격이 높은 순으로 출력하기" +
                    "%n3. 20000원 이상의 도서들만 출력하기%n4. id가 3번인 도서 출력하기" +
                    "%n5. 도서명에 '자바'또는 '스프링'을 포함하는 도서들만 출력하기" +
                    "%n6. 분류별 도서 가격의 합을 출력하기%n7. 종료");
            System.out.printf("%n숫자를 고르세요>");
            String num = scan.nextLine();
            switch (num) {
                case "1":
                    bookList = bookLab.getAllBook();
                    bookList.stream().forEach(vo -> System.out.println(vo));
                    break;
                case "2":
                    bookList = bookLab.getAllBookSortByHighPrice();
                    bookList.stream().forEach(vo -> System.out.println(vo));
                    break;
                case "3":
                    bookList = bookLab.findByHigherThanPrice();
                    bookList.stream().forEach(vo -> System.out.println(vo));
                    break;
                case "4":
                    book = bookLab.findById();
                    if (book != null)   System.out.println(book);
                    else  System.out.println("id가 3번인 책이 없습니다.");
                    break;
                case "5":
                    bookList = bookLab.findByPartTitle();
                    bookList.stream().forEach(vo -> System.out.println(vo));
                    break;
                case "6":
                    List<Object[]> resultList = bookLab.getTotalPriceByKind();
                    for (Object[] objects : resultList) {
                        System.out.println("분류 코드  " + (String) objects[0] + "    " +  (Long) objects[1]);
                    }
                    break;
                case "7":
                    close();
                    System.out.println("종료됩니다.");
                    break loopOut;
            }
        }
    }
}