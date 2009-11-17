package ch03.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpManagerImpl implements EmpManager {

	public String getGreetingMessage(String message) throws Exception {
		try {
			System.out.println("------------------------------");
			System.out.println("�޼ҵ� ȣ�� Start : [" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "]");
			System.out.println("����Ͻ� ���� ����.");
			return "Hi " + message;
		} finally {
			System.out.println("�޼ҵ� ȣ�� End : [" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "]");
			System.out.println("------------------------------");
		}
	}

}
