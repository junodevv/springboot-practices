package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Spring Boot Test Integration
 * Error: StringBoot Test Integration(@SpringBootTest) 에서는 
 * @Configuration을 달고있는 설정 클래스를 스캔 하지 못한다.
 * 
 */

@SpringBootTest
public class MyApplicationTest02 {
	@Autowired
	MyComponent myComponent;
	
	public void testMyComponentNotNull() {
		assertNotNull(myComponent);
	}
}
