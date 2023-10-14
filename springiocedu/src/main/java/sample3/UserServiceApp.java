package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceApp {
	public static void main(String[] args) {
		ApplicationContext factory 
        		= new ClassPathXmlApplicationContext("sample3.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");
		
		UserService u1=(UserService)factory.getBean("userService"); // 객체생성
		UserVo vo = (UserVo)factory.getBean("obj1");
		u1.addUser(vo);
		System.out.println(u1);
		System.out.println("----------------------------------------------------");
		
		UserService u2=factory.getBean("userService", UserService.class);
		// 2번째 아규먼트로 받아오고싶은 타입에 대한 정보를 주면 강제 형변환을 하지않아도 됨
		UserVo vo2 = (UserVo)factory.getBean("obj2");
		u2.addUser(vo2);
		System.out.println(u2);		
		((ClassPathXmlApplicationContext)factory).close();
	}
}





