package com.bitacademy.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
1. 스프링 어플리케이션 부트스트래핑 역할: Bootstrap Class
2. 설정 클래스 역할: Configuration Class
*/
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/* 
		 * SpringApplication.run(...)안에서 일어나는일(Bootstrap) 
		 * 1. 어플리케이션 컨텍스트 생성(ApplicationCOntext, Spring Container)
		 * 2. 만약, 웹 애플리케이션이라면 웹 애플리케이션의 타입(Spring MVC, Reactive)
		 * 3. 어노테이션 스캐닝(auto) + Configuration Class를 통한 
		 * 	  빈 생성/등록/와이어링(주입)작업
		 * 4. 만약, SpringMVC라면
		 * 		1) Auto Configuration
		 * 		2) 내장(embed) 서버(TomcatEmbededServiceServletContainer)인스턴스 생성
		 * 		3) 서버 인스턴스에 웹어플리케이션 배포
		 * 		4) 서버 인스턴스 실행
		 * 5. ApplicationRunner 인터페이스를 구현한 빈을 Container(ApplicationContext)에서 찾아 실행시킴 
		 */
		SpringApplication.run(HelloWorldApplication.class, args);
		
	}

}
