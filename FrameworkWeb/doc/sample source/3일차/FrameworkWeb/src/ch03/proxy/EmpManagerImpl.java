package ch03.proxy;

public class EmpManagerImpl implements EmpManager {

	public String getGreetingMessage(String message) throws Exception {
		System.out.println("����Ͻ� ���� ����.");
		String str = null;
		str.charAt(0);	// NullPointerException �߻�
		return "Hi " + message;
	}

}
