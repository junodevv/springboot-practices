package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ex04.component.MyComponent;

/*
 * @SpringBootApplication 메타 어노테이션
 * + @SpringBootConfiguration: cf) ex01, ex02
 * + @ComponentScan: ex04패키지 하부를 스케닝한다. cf)ex03
 * + @EnableAutoConfiguration : 
 * 	 1. MVC, AOP, Security, JPA등을 자동(default->꼭 미세설정)설정 
 * 	 2. 발견된 Starter Dependency(Library)기반으로 설정 -> 그러니 쓸데없는 라이브러리는 빼는것이 좋다
 * 
 */

@SpringBootApplication
public class MyApplication {
	
	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}
	public static void main(String[] args) {
		try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){}

	}

}
