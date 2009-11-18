package ch03.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Gargle {

	//���� ���
	//CityLife ���� eat�� �����ϴ� �޼ҵ�
	@After("execution(* CityLife.eat*())")
	//@After("execution(String CityLife.eat*(String))")
	//@After("execution(String CityLife.eat*(..))")
	public void doGargle() throws Throwable {
		System.out.println("---> ��ġ�Ѵ�.");

	}
}