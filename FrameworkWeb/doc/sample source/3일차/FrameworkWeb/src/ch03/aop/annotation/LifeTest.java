package ch03.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {
	public static void main(String[] args) {
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("ch03/aop/annotation/player2.xml");
		
		ItMan itman = (ItMan)context.getBean("itMan");
		itman.myLife();

	}
}












