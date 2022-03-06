package aop;

//import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

	@Before("execution(* service.UserService.hello())")
	public static void logBefore() {
		System.out.println("1 - before ... ...");
	}

	@After("execution(* service.UserService.hello())")
	public static void logAfter() {
		System.out.println("2 - after ... ...");
	}

	@Around("execution(* service.UserService.hello())")
	public static void logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("3 - Around before... ...");
		// MethodInvocationProceedingJoinPoint 通过proceed方法回到调用链中
		proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
		System.out.println("3 - Around after... ...");

	}

	@AfterReturning("execution(* service.UserService.hello())")
	public static void logAfterReturn() {
		System.out.println("4 - AfterReturning ... ...");
	}

	@AfterThrowing("execution(* service.UserService.hello())")
	public static void logAfterThrowing() {
		System.out.println("5 - AfterThrowing ... ...");
	}


}
