package ch05.magazine.model;

import java.util.List;

public interface MagazineDAO {
	
	 // ��� ��� ��ȯ
	public List getAllMagazine();
	
	// ������
	public Magazine findMagazine(Long magazineId);
	
	// ���
    public void makePersistent(Magazine magazine);

    // ����
    public void makeTransient(Magazine magazine);

}












