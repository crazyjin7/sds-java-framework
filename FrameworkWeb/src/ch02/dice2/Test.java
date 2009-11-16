package ch02.dice2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {
	public static void main(String[] args) {
		BeanFactory context
			= new XmlBeanFactory(new FileSystemResource("build/classes/ch02/dice2/player.xml"));	
		
		//ApplicationContext context
			//= new ClassPathXmlApplicationContext("ch02/dice2/player.xml");
		
		System.out.println("�����̳� ���� �Ϸ�.");
		
		//Dice dice = new Dice4();
		//Player p = new Player(dice);
		Player p = (Player) context.getBean("player");
		p.play();
		System.out.println("���� ���� �ֻ����� �� : " + p.getTotalValue());
	}
}
