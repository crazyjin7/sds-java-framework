package ch03.aop.advice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {
	public static void main(String[] args) {
		BeanFactory context
			= new XmlBeanFactory(new FileSystemResource("build/classes/ch03/aop/advice/player.xml"));

		System.out.println("�����̳� ���� �Ϸ�.");

		Player p = (Player) context.getBean("player");
		p.play();
		System.out.println("���� ���� �ֻ����� �� : " + p.getTotalValue());
	}
}
