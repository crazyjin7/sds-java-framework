package ch01.javabeans;

// class는 public으로 선언한다.
public class UserBean {
	
	// 멤버변수는 private/protected로 선언한다.
	private String name;
	private int age;
	private boolean male;
	
	// 기본생성자
	public UserBean(){
		
	}
	
	// 생성자 추가
	public UserBean(String name, int age, boolean male){
		this.name = name;
		this.age = age;
		this.male = male;
	}
	
	// setter 메소드 작성(setXxx)
	public void setName(String name){
		this.name = name;
	}
	
	// getter 메소드 작성(getXxx, isXxx)
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

















