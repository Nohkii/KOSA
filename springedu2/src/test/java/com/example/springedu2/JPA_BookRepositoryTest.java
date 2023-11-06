package com.example.springedu2;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Sort;
import springjpa.exam.entity.Book;
import springjpa.exam.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
public class JPA_BookRepositoryTest {
    @Autowired
    BookRepository bookR;
    @BeforeEach()
    void pr(){
        System.out.println("=".repeat(80));
    }
    @Test
    @Order(1)
    @Transactional
    void list(){
       List<Book> list =  bookR.findAll();
       list.parallelStream().forEach(System.out::println);
    }
    @Test
    @Order(2)
    @Transactional
    void OrderByPriceDesc (){
        List<Book> list =  bookR.findAll(Sort.by(Sort.Direction.DESC,"price"));
       list.forEach(System.out::println);
   /*     list.parallelStream().forEach(System.out::println);*/
    }
    @Test
    @Order(3)
    @Transactional
    void findByPriceGreaterThan (){
        List<Book> list =  bookR.findByPriceGreaterThan(20000);
        list.forEach(System.out::println);
    }
    @Test
    @Order(4)
    @Transactional
    void getReferenceById (){
        Optional<Book> book = bookR.findById(10);
        if(book.isPresent()){
            System.out.println(book);
        }else{
            System.out.println("***********존재하지 않음!!************ ");
        }
    }
    @Test
    @Order(5)
    @Transactional
    void findTitleContainsJavaOrSpring (){
        List<Book> list =  bookR.findByTitleContainingOrTitleContaining("자바","스프링");
        list.forEach(System.out::println);
    }
    // 분류별 도서가격 평균
    @Test
    @Order(6)
    @Transactional
    void averagePriceByKind (){
        List<Object[]> list =  bookR.averagePriceByKind();
        for (Object[] objects : list) {
            String kind = (String) objects[0];
            Long price = (Long) objects[1];
            System.out.println(kind+"  "+price);}
    }
 @Test
 @Order(7)
 @Transactional
 void findCheapestPrice (){
     List<Book> list =  bookR.findTop1ByOrderByPrice();
     list.forEach(System.out::println);
 }
    @Test
    @Order(8)
    @Transactional
    void getCount (){
        long num =  bookR.count();
        System.out.println("전체 도서의 수:"+num+"권");
    }
    @Test
    @Order(9)
    @Transactional
    void getCountByKind (){
        Long num =  bookR.countByKind("b05");
        System.out.println("b05 부류의 도서는:"+num+"권");
    }
    @Test
    @Order(10)
    @Transactional
    void getTitleStartsWithBanila (){
        List<Book> list =  bookR.findByTitleStartsWith("바닐라");
        list.forEach(System.out::println);
    }
}
