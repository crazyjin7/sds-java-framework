package ch04.springtransaction;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class MemberServiceImpl implements MemberService {
	
	private MemberDAO mdao;
	private TransactionTemplate transactionTemplate;

	public void setMemberDAO(MemberDAO mdao){
		this.mdao = mdao;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	public void registMember(final Member member){
		// ���α׷��� ���� Ʈ����� ����
		transactionTemplate.execute(
			new TransactionCallback(){

				public Object doInTransaction(TransactionStatus status) {
					try{
						mdao.registMemberInfo(member);
						mdao.registMemberAddress(member);
							
						// ��� ������ ��� �ڵ����� Ŀ��
					}catch(Exception e){
						e.printStackTrace();
						// ���н� �ѹ�
						status.setRollbackOnly();
					}
					
					return null;
				}					
			}			
		);
	}

}
