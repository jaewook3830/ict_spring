package com.ict.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// 스프링 컨테이너 : 객체(Bean)를 생성하고 관리한다.
		// 스프링 컨테이너 역할을 하는 인터페이스 :
		// BeanFactory(I) <- ApplicationContext(I) <- ClassPathXmlApplicationContext(C)
		
		// 스프링 컨테이너는 ApplicationContext에 의해서 관리된다.
		// ApplicationContext는 Bean 생성, DI, 생명주기를 관리한다.
		
		// ApplicationContext는 설정정보를 참조해서 Bean 생성, DI, 생명주기를 관리
		// 여기서 설정 정보란 xml 파일이거나 어노테이션을 구성 되어 있다.
		// xml 파일은 spring bean configuration 파일을 선택해서 만든다.
		
		// config.xml 내용을 스프링 컨테이너가 읽어서 객체를 생성하고, 객체간의 의존성을
		// 이어준다.
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ict/ex02/config.xml");
		
		// xml에서 만들어진 service 객체를 가져와서 service 안에 있는 biz()를 실행시키자.
		Service service = (Service) context.getBean("service");
		service.biz();
	}
}
