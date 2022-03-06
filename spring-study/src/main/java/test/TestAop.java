package test;

import config.AppConfig;
import service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		try {

			userService.hello();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
