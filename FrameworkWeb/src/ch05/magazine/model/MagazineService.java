package ch05.magazine.model;

import java.util.List;

public interface MagazineService {

	public List getAllMagazine();

	public Magazine findMagazine(Long magazineId);

	public void insertMagazine(Magazine magazine);

	public void deleteMagazine(Magazine magazine);

}
