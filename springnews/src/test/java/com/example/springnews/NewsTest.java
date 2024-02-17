package com.example.springnews;

import com.example.springnews.model.News;
import com.example.springnews.repository.NewsRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
public class NewsTest {
    @Autowired
    NewsRepository newsR;

    @Test
    @Transactional
    void list(){
        List<News> list = newsR.findAll();
        list.parallelStream().forEach(System.out::println);
    }
}
