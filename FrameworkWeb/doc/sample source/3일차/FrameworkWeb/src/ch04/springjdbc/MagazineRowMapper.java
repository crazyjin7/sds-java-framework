package ch04.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MagazineRowMapper implements RowMapper{
	// rs -> ��ü�� ����
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {		
		Magazine result = new Magazine();
		result.setMagazineId(rs.getInt("magazineId"));
		result.setTitle(rs.getString("title"));
		result.setPrice(rs.getInt("price"));
		result.setCreated(rs.getDate("created"));
		return result;
	}
}
