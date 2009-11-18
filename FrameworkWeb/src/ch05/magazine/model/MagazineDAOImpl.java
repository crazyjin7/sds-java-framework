package ch05.magazine.model;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class MagazineDAOImpl extends JdbcDaoSupport implements MagazineDAO {

	private RowMapper rowMapper;


	public void setRowMapper(RowMapper rowMapper) {
		this.rowMapper = rowMapper;
	}

	public List getAllMagazine() {
		String sql = "select magazineId, title, price, created from MAGAZINE";
		return getJdbcTemplate().query(sql, rowMapper);
	}

	public Magazine findMagazine(Long magazineId) {
		String sql = "select magazineId, title, price, created from MAGAZINE where magazineId = ?";
		return (Magazine) getJdbcTemplate().queryForObject(sql, new Object[] { magazineId }, rowMapper);
	}

	public void makePersistent(Magazine magazine) {
		String sql = "insert into magazine(magazineId, title, price, created) values(seq_magazine.nextval, ?, ?, ?)";
		Object[] params = { magazine.getTitle(), magazine.getPrice(), magazine.getCreated() };
		getJdbcTemplate().update(sql, params);
	}

	public void makeTransient(Magazine magazine) {
	}

}
