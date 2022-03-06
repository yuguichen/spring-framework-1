package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = {"aop", "service"})
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
}
