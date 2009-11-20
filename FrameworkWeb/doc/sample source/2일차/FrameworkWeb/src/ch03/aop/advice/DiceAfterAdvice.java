package ch03.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DiceAfterAdvice implements AfterReturningAdvice{

	public void afterReturning(Object returnObj, Method method, Object[] args, Object targetObj) throws Throwable {
		System.out.println("[�������] " + method.getName() + " ȣ�� �Ŀ� ����..");
		System.out.println("�������� : " + returnObj);
		
	}

}
