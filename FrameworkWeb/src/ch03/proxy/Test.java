package ch03.proxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) throws Exception {
		//EmpManager empManager = new EmpManagerImpl();

		ExceptionHandler exceptionHandler = new ExceptionHandler(new EmpManagerImpl());
		EmpManager empManager = (EmpManager) Proxy.newProxyInstance(
				EmpManagerImpl.class.getClassLoader(),
				EmpManagerImpl.class.getInterfaces(),
				exceptionHandler);

		LoggingHandler handler = new LoggingHandler(empManager);
		// newProxyInstance(��� ��ü�� Ŭ���� �δ�, �����ؾ� �� �������̽� ���, InvocationHandler ��ü)
		empManager = (EmpManager) Proxy.newProxyInstance(
				EmpManagerImpl.class.getClassLoader(),
				EmpManagerImpl.class.getInterfaces(),
				handler);

		System.out.println(empManager.getGreetingMessage("ȫ�浿"));
	}
}
