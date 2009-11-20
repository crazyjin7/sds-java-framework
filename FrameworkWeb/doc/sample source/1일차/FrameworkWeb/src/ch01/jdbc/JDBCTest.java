package ch01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// 2�ܰ� : ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			// 3�ܰ� : Connection ��ü�� �����Ѵ�.
			con = DriverManager.getConnection("jdbc:oracle:thin:@70.12.220.130:1521:ora9", "java90", "java90");
			System.out.println("���� ����");
			
			// 4�ܰ� : Statement��ü�� �����Ѵ�.
			st = con.createStatement();
			System.out.println("��� �غ� ����");
			
			// 5�ܰ� : ����� �ִٸ� ResultSet ��ü�� �����Ѵ�.
			rs = st.executeQuery("select * from member");
			System.out.println("��� �����");
			
			while (rs.next()) {
				String userid = rs.getString("userid");
				String userpass = rs.getString("userpass");
				System.out.println("userid=" + userid + ",userpass=" + userpass);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6�ܰ� : ��� ��ü�� �ݴ´�.
			if (rs != null) try { rs.close(); } catch (SQLException e) {}
			if (st != null) try { st.close(); } catch (SQLException e) {}
			if (con != null) try { con.close(); } catch (SQLException e) {}
		}
	}
}
