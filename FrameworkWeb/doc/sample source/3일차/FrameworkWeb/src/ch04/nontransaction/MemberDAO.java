package ch04.nontransaction;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class MemberDAO extends JdbcDaoSupport{
	
	/**
	 * ȸ���� �⺻���� ���
	 * @param member
	 */
	public void registMemberInfo(Member member){
		String sql = "insert into member(memberId, name, age, created) values(?, ?, ?, sysdate)";

		member.setMemberId(getNextMemberId());
		Object[] params = {member.getMemberId(), member.getName(), member.getAge()};
		int[] types = {Types.INTEGER, Types.VARCHAR, Types.INTEGER};
				
		getJdbcTemplate().update(sql, params, types);
	}
	
	/**
	 * ȸ���� �ּ� ���
	 * @param member
	 * @return
	 */
	public int[] registMemberAddress(final Member member){
		String sql = "insert into address(addressId, memberId, address) values(seq_address.nextval, ?, ?)";

		// �������� ������ �ѹ��� �����Ű�� ���ؼ� ���
		BatchPreparedStatementSetter setter = new BatchPreparedStatementSetter(){
			/**
			 * �����ų ������ ������ ��ȯ�Ѵ�.
			 */
			public int getBatchSize(){
				return member.getAddress().size();
			}
			
			/**
			 * PreparedStatement �� ���� ä���.
			 * getBatchSize() ȣ�� �����ŭ �ݺ��Ǹ� ȣ��� ������ index�� 0���� �����Ѵ�. 
			 */
			public void setValues(PreparedStatement ps, int index) throws SQLException{
				ps.setInt(1, member.getMemberId());
				ps.setString(2, (String)member.getAddress().get(index));
			}
		};
				
		return getJdbcTemplate().batchUpdate(sql, setter);
	}
	
	/**
	 * ȸ�� ID�� �ִ밪 ��ȯ
	 * @return
	 */
	public int getNextMemberId(){
		String sql = "select max(memberId) from member";
		return getJdbcTemplate().queryForInt(sql)+1;
	}
}























