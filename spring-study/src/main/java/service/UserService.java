package service;

import org.springframework.stereotype.Component;

@Component
public class UserService {




	public void hello() throws Exception {
		try {
			System.out.println("hello spring-aop!");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch exception");
		} finally {
			System.out.println("finally");
		}
	}
}
