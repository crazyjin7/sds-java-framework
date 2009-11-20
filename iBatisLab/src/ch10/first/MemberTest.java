package ch10.first;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class MemberTest {

	private static SqlMapClient sqlMapClient;

	public static SqlMapClient getSqlMapClient() throws Exception {
		Reader reader = Resources.getResourceAsReader("sql-map-config.xml");
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		return sqlMap;
	}

	public void printList(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void memberList() throws Exception {
		List list = sqlMapClient.queryForList("getMemberList");
		printList(list);
	}

	public static void main(String[] args) throws Exception {
		MemberTest test = new MemberTest();
		sqlMapClient = getSqlMapClient();

		test.memberList();
	}
}
