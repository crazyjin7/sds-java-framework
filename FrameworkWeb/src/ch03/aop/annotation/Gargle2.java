package ch03.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Gargle2 {

	public void doGargle() throws Throwable {
		System.out.println("---> �� ��ġ�Ѵ�.");

	}
}
