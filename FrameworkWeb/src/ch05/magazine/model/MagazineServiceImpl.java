package ch05.magazine.model;

import java.util.List;

public class MagazineServiceImpl implements MagazineService {

	private MagazineDAO magazineDAO;

	public void setMagazineDAO(MagazineDAO magazineDAO) {
		this.magazineDAO = magazineDAO;
	}

	public void deleteMagazine(Magazine magazine) {
		magazineDAO.makeTransient(magazine);
	}

	public Magazine findMagazine(Long magazineId) {
		return magazineDAO.findMagazine(magazineId);
	}

	public List getAllMagazine() {
		return magazineDAO.getAllMagazine();
	}

	public void insertMagazine(Magazine magazine) {
		magazineDAO.makePersistent(magazine);
	}

}
