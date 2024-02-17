package com.example.book9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //엔티티 객체가 생성되거나 변경되었을 때 자동으로 값 지정기능 지원
@SpringBootApplication
public class Book9Application {

	public static void main(String[] args) {
		SpringApplication.run(Book9Application.class, args);
	}

}
