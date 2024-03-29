package ch04.nontransaction;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberTest {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("/ch04/nontransaction/applicationContext.xml");
		
		MemberService memberService = (MemberService)context.getBean("memberService");
				
		String address1 = "서울시 송파구 잠실동";
		String address2 = "경기도 성남시 수정구";
//		String address2 = "경기도 성남시 수정구 경기도 성남시 수정구 경기도 성남시 수정구 경기도 성남시 수정구 경기도 성남시 수정구 경기도 성남시 수정구 경기도 성남시 수정구 ";
		List<String> address = new LinkedList<String>();

		address.add(address1);
		address.add(address2);
		
		Member member = new Member();
		member.setName("정길용");
		member.setAge(29);
		member.setAddress(address);
		
		memberService.registMember(member);
	}
}
