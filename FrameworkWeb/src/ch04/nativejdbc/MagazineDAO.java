package ch04.nativejdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MagazineDAO {

	public Magazine findMagazine(int magazineId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Magazine result = null;		
		// ������ �ۼ�
		String sql = "select magazineId, title, price, created from MAGAZINE where magazineId = ?";

		try{			
			// Ŀ�ؼ� ���
			con = DBManager.getConnection();
			
			// PreparedStatement ����
			pstmt = con.prepareStatement(sql);
			
			// �Ķ���� ���ε�
			pstmt.setInt(1, magazineId);
			
			// ���� ���� �� ��� �ޱ�
			rs = pstmt.executeQuery();
						
			// ResultSet -> Magazine ����
			if(rs.next()){
				result = new Magazine();
				result.setMagazineId(rs.getInt("magazineId"));
				result.setTitle(rs.getString("title"));
				result.setPrice(rs.getInt("price"));
				result.setCreated(rs.getDate("created"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{	// �ڿ�����
			try{ if(rs != null) rs.close(); }catch(Exception e){}
			try{ if(pstmt != null) pstmt.close(); }catch(Exception e){}
			try{ if(con != null) con.close(); }catch(Exception e){}
		}
		
		return result;
	}
}
