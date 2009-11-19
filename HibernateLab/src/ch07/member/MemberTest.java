package ch07.member;

public class MemberTest {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("uzoo");
		member.setAddr("seoul");

		MemberDAO mdao = new MemberDAO();
		mdao.insertMember(member);
	}
}
