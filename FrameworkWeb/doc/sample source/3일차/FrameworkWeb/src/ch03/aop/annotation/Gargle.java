package ch03.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Gargle {
	
	// 사후충고
	// CityLife 빈의 eat로 지작하는 메소드
	@After("execution(* CityLife.eat*())")
	public void goGargle() throws Throwable{
		System.out.println(" ---> 양치한다.");
	}

}






















