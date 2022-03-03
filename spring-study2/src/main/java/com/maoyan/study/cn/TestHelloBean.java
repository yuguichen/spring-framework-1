package com.maoyan.study.cn;

import com.maoyan.study.cn.config.BeanConfig;
import com.maoyan.study.cn.service.IndexService;
import com.maoyan.study.cn.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloBean {
	public static void main(String[] args){

		//IndexService indexService = new IndexService();
		//java对象只有被放到ioc容器中，才会被自动注入；手动创建的对象无法自动注入
		//注入时调用空参构造或调用实现的唯一有参构造（有参构造的bean对象参数同样从容器中注入）
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		new ClassPathXmlApplicationContext();

		// 此时已经完成bean的注入
//		Hello hello = context.getBean(Hello.class);
//		hello.sayHello();

		//测试循环依赖
		//UserService userService = context.getBean(UserService.class);
		IndexService indexService = context.getBean(IndexService.class);
		// userService.getIndexService();
	}
}
