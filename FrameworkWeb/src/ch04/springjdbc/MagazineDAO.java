package ch04.springjdbc;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MagazineDAO {

	private DataSource dataSource;
	private RowMapper magazineRowMapper;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void setMagazineRowMapper(RowMapper magazineRowMapper) {
		this.magazineRowMapper = magazineRowMapper;
	}

	public Magazine findMagazine(int magazineId) {
		String sql = "select magazineId, title, price, created from MAGAZINE where magazineId = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] params = { magazineId };
		return (Magazine) jdbcTemplate.queryForObject(sql, params, magazineRowMapper);
	}
}
