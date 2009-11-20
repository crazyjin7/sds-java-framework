package ch07.member;

public class MemberTest {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("uzoo");
		member.setAddr("seoul");
		
		MemberDAO mdao = new MemberDAO();
		
		// 등록
		mdao.insertMember(member);
		
		// 상세조회
		System.out.println(mdao.getMember(1));
		
		// 수정
		member.setName("홍길동");
		mdao.updateMember(member);
		System.out.println(mdao.getMember(1));
		
		// 삭제
		//mdao.deleteMember(1);
		System.out.println(mdao.getMember(1));
		
		
	}
}











