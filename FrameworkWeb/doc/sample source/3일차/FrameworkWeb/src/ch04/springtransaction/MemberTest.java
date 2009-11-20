package ch04.springtransaction;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberTest {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("/ch04/springtransaction/applicationContext.xml");
		
		MemberService memberService = (MemberService)context.getBean("memberService");
				
		String address1 = "����� ���ı� ��ǵ�";
//		String address2 = "��⵵ ������ ������";
		String address2 = "��⵵ ������ ��������⵵ ������ ��������⵵ ������ ��������⵵ ������ ������ ��⵵ ������ ������ ��⵵ ������ ������ ��⵵ ������ ������ ��⵵ ������ ������ ��⵵ ������ ������ ��⵵ ������ ������ ";
		List<String> address = new LinkedList<String>();

		address.add(address1);
		address.add(address2);
		
		Member member = new Member();
		member.setName("�����");
		member.setAge(29);
		member.setAddress(address);
		
		memberService.registMember(member);
	}
}
