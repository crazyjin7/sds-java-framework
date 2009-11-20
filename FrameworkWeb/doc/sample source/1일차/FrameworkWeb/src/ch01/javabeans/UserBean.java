package ch01.javabeans;

// class�� public���� �����Ѵ�.
public class UserBean {
	
	// ��������� private/protected�� �����Ѵ�.
	private String name;
	private int age;
	private boolean male;
	
	// �⺻������
	public UserBean(){
		
	}
	
	// ������ �߰�
	public UserBean(String name, int age, boolean male){
		this.name = name;
		this.age = age;
		this.male = male;
	}
	
	// setter �޼ҵ� �ۼ�(setXxx)
	public void setName(String name){
		this.name = name;
	}
	
	// getter �޼ҵ� �ۼ�(getXxx, isXxx)
	public String getName(){
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}
	
	
	

}

















