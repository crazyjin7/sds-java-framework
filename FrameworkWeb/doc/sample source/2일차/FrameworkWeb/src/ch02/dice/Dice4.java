package ch02.dice;

public class Dice4 implements Dice{
	
	public int getDiceValue(){
		int num = (int)(Math.random() * 4) + 1;
		System.out.println("1~4���� �߻��� �� : " + num);
		return num;
	}

}
