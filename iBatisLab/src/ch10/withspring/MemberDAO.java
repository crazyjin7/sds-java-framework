package ch10.withspring;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class MemberDAO extends SqlMapClientDaoSupport {

	public void listMember() {
		try {
			List list = getSqlMapClient().queryForList("Basic.getMemberList");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (Exception e) {

		}

	}

}
