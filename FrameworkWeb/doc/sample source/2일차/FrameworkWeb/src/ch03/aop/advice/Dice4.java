package ch03.aop.advice;

public class Dice4 implements Dice{
	
	public Dice4(){
		System.out.println("Dice4 ���� �Ϸ�.");
	}
	
	public int getDiceValue(){
		int num = (int)(Math.random() * 4) + 1;
		System.out.println("1~4���� �߻��� �� : " + num);
		return num;
	}
	

}
