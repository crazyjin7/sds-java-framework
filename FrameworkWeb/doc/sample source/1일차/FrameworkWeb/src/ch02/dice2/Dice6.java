package ch02.dice2;

public class Dice6 implements Dice{
	
	public int getDiceValue(){
		int num = (int)(Math.random() * 6) + 1;
		System.out.println("1~6���� �߻��� �� : " + num);
		return num;
	}

}
