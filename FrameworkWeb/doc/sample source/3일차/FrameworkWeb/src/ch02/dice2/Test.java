package ch02.dice2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {
	
	public static void main(String[] args) {
		BeanFactory context 
			= new XmlBeanFactory(new FileSystemResource("src/ch02/dice2/player.xml"));	
		
//		ApplicationContext context 
//			= new ClassPathXmlApplicationContext("ch02/dice2/player.xml");
		
		System.out.println("컨테이너 생성 완료.");
		
//		Dice dice = new Dice4();
//		Player p = new Player(dice);
		
		Player p = (Player)context.getBean("player");
		
		//ch02.dice2.Dice6 dice = new ch02.dice2.Dice6();
		//ch02.dice2.Player p = new ch02.dice2.Player(dice);
		
		
		
		p.play();
		System.out.println("세번 굴린 주사위의 합 : " + p.getTotalValue());
	}

}














