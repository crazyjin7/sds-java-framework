package ch03.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class DiceBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object targetObj) throws Throwable {
		System.out.println("[�������] " + method.getName() + " �޼ҵ� ȣ���� �����..");
	}

}
