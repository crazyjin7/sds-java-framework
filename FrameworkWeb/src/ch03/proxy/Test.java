package ch03.proxy;

public class Test {

	public static void main(String[] args) throws Exception {
		EmpManager empManager = new EmpManagerImpl();

		System.out.println(empManager.getGreetingMessage("ȫ�浿"));
	}
}
