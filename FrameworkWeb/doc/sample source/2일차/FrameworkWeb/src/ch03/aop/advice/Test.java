package ch03.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {

		ApplicationContext context 
			= new ClassPathXmlApplicationContext("ch03/aop/advice/player.xml");

		Player p = (Player)context.getBean("player");
		p.play();
		System.out.println("세번 굴린 주사위의 합 : " + p.getTotalValue());
	}

}














