package ch09.hql;

import java.util.ArrayList;
import java.util.List;

public class Parent {
	
	private String name;
	private String job;
	private List<Child> children = new ArrayList<Child>();
	
	public Parent(){}
	
	public Parent(String name, String job){
		this.name = name;
		this.job = job;
	}
	
	public List<Child> getChildren() {
		return children;
	}
	public void setChildren(List<Child> children) {
		this.children = children;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public String toString(){
		return "name : " + name + ", job : " + job + ", children : " + children;
	}
	
	

}













