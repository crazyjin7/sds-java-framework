package ch03.proxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) throws Exception {
		//EmpManager empManager = new EmpManagerImpl();

		LoggingHandler handler = new LoggingHandler(new EmpManagerImpl());
		// newProxyInstance(��� ��ü�� Ŭ���� �δ�, �����ؾ� �� �������̽� ���, InvocationHandler ��ü)
		EmpManager empManager = (EmpManager) Proxy.newProxyInstance(
				EmpManagerImpl.class.getClassLoader(),
				EmpManagerImpl.class.getInterfaces(),
				handler);

		System.out.println(empManager.getGreetingMessage("ȫ�浿"));
	}
}
