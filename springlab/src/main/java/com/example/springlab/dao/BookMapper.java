package com.example.springlab.dao;

import com.example.springlab.domain.BookDTO;
import com.example.springlab.domain.BookResultDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select id, title, price, kind from book")     //    전체 도서 리스트 보기 메서드
    public List<BookDTO> list();
    @Select("select id, title, price, kind from book order by price desc") //    가격이 높은 순으로 도서 리스트 보기 메서드
    public List<BookDTO> highPriceOrderList();
    @Select("select id, title, price, kind from book where price >= 20000") //    가격이 20000원 이상인  도서 리스트 보기 메서드
    public List<BookDTO> limitPriceList();
    @Select("select id, title, price, kind from book where kind ='b02'")//    웹 프로그래밍 도서 리스트 보기 메서드
    public List<BookDTO> webProgrammingList();
@Select("select id, title, price, kind from book where kind in ('b04','b05')") //    데이터베이스와 인프라 도서 리스트 보기 메서드
public List<BookDTO> dataNInfraList();
@Select("select id, title, price, kind from book where title like '%자바%'") //    도서명에 '자바'가 포함된 도서 리스트 보기 메서드
public List<BookDTO> javaList();
@Select("select kind, round(avg(price),1) as avgprice from book group by kind") //    분류별 도서 가격의 평균 보기 메서드
public List<BookResultDTO> averagePrice();
    @Insert("insert into book (title, price, kind) values (#{title}, #{price}, #{kind})") //    도서 정보 입력 메서드
            public boolean insert(BookDTO dto);
}
