package com.example.springedu2;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import springrest.exam.entity.Friend;
import springrest.exam.repository.FriendRepository;

import java.util.List;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
public class FriendTest {
    @Autowired
    FriendRepository friendR;
    @Test
    @Transactional
    void list(){
        List<Friend> list = friendR.findAll();
        list.parallelStream().forEach(System.out::println);
    }
    @Test
    @Transactional
    @Rollback(false)
    void save(){
        Friend f;
        for(int i = 0; i <2; i++){
            f = new Friend();
            f.setFage(1+i);
            f.setFname("노키"+i);
            friendR.save(f);
        }
        List<Friend> list = friendR.findAll();
        list.stream().forEach(System.out::println);
    }
    @Test
    @Transactional
    void update(){
        Friend f =  friendR.findById(3).get();
        f.setFname("수정테스트");
        friendR.save(f);
        List<Friend> list = friendR.findAll();
        list.stream().forEach(System.out::println);
    }
    @Test
    @Transactional
    void delete(){
        friendR.deleteById(3);
        List<Friend> list = friendR.findAll();
        list.stream().forEach(System.out::println);
    }
}
