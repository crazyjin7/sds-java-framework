package ch10.basic;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
			//Map data = (Map) list.get(i);
			//System.out.println(data.get("NAME"));
			System.out.println(list.get(i));
		}
	}

	public void memberList() throws Exception {
		List list = sqlMapClient.queryForList("Basic.getMemberList");
		printList(list);
	}

	// parameterClass 사용 예
	public void test01() throws Exception {
		Member member = new Member();
		member.setDeptNo(1);
		member.setName("홍길동");
		member.setAddr("Busan");
		sqlMapClient.insert("Basic.insertMember", member);

		memberList();
	}

	// parameterMap 사용 예
	public void test02() throws Exception {
		Member member = new Member();
		member.setDeptNo(1);
		member.setName("임꺽정");
		member.setAddr("Incheon");
		sqlMapClient.insert("Basic.insertMemberByMap", member);

		memberList();
	}

	// parameterClass로 Map 사용 예
	public void test03() throws Exception {
		Map map = new HashMap();
		map.put("deptNo", 2);
		map.put("name", "이순신");
		map.put("addr", "Suwon");

		sqlMapClient.insert("Basic.insertMember", map);

		memberList();
	}

	// ResultMap 사용 예
	public void test04() throws Exception {
		Member member = (Member) sqlMapClient.queryForObject("Basic.getMemberListResultMap", new Integer(1));

		System.out.println(member);
	}

	public static void main(String[] args) throws Exception {
		MemberTest test = new MemberTest();
		sqlMapClient = getSqlMapClient();

		//test.memberList();
		//test.test01();
		//test.test02();
		//test.test03();
		test.test04();
	}
}
