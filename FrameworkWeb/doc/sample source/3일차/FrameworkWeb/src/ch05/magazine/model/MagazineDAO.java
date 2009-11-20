package ch05.magazine.model;

import java.util.List;

public interface MagazineDAO {
	
	 // 모든 목록 반환
	public List getAllMagazine();
	
	// 상세정보
	public Magazine findMagazine(Long magazineId);
	
	// 등록
    public void makePersistent(Magazine magazine);

    // 삭제
    public void makeTransient(Magazine magazine);

}












