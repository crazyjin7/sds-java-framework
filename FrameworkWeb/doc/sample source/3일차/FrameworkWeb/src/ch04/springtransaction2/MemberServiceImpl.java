package ch04.springtransaction2;


public class MemberServiceImpl implements MemberService {
	
	private MemberDAO mdao;

	public void setMemberDAO(MemberDAO mdao){
		this.mdao = mdao;
	}

	public void registMember(Member member){
		mdao.registMemberInfo(member);
		mdao.registMemberAddress(member);
	}

}
