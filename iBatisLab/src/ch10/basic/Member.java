package ch10.basic;

public class Member {

	private int deptNo;
	private String deptName;
	private int id;
	private String name;
	private String addr;

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String toString() {
		return "deptNo["+deptNo+"]\tdeptName["+deptName+"]\tid["+id+"]\tname["+name+"]\taddr["+addr+"]";
	}

}
