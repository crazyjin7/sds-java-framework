package ch03.proxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) throws Exception {
		//EmpManager empManager = new EmpManagerImpl();

		LoggingHandler handler = new LoggingHandler(new EmpManagerImpl());
		// newProxyInstance(대상 객체의 클래스 로더, 구현해야 할 인터페이스 목록, InvocationHandler 객체)
		EmpManager empManager = (EmpManager) Proxy.newProxyInstance(
				EmpManagerImpl.class.getClassLoader(),
				EmpManagerImpl.class.getInterfaces(),
				handler);

		System.out.println(empManager.getGreetingMessage("홍길동"));
	}
}
