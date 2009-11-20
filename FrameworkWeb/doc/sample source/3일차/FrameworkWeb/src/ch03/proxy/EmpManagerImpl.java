package ch03.proxy;

public class EmpManagerImpl implements EmpManager {

	public String getGreetingMessage(String message) throws Exception {
		System.out.println("비즈니스 로직 수행.");
		String str = null;
		str.charAt(0);	// NullPointerException 발생
		return "Hi " + message;
	}

}
