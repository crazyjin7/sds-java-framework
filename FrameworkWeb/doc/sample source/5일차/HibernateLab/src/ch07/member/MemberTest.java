package ch07.member;

public class MemberTest {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("uzoo");
		member.setAddr("seoul");
		
		MemberDAO mdao = new MemberDAO();
		
		// ���
		mdao.insertMember(member);
		
		// ����ȸ
		System.out.println(mdao.getMember(1));
		
		// ����
		member.setName("ȫ�浿");
		mdao.updateMember(member);
		System.out.println(mdao.getMember(1));
		
		// ����
		//mdao.deleteMember(1);
		System.out.println(mdao.getMember(1));
		
		
	}
}











