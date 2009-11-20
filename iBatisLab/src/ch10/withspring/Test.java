package ch10.withspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/ch10/withspring/applicationContext.xml");
		MemberDAO mdao = (MemberDAO) context.getBean("memberDAO");
		mdao.listMember();
	}
}
