package ch02.dice2;


public class Player{
	
	Dice dice;
	int totalValue = 0;	
	String id = "";
	
//	public Player(Dice dice){
//		this.dice = dice;
//		System.out.println("Player ���� �Ϸ�.");
//	}
	
	
	public void setDice(Dice dice){
		this.dice = dice;
	}
	
	public void play(){		
		for(int i=0; i<3; i++){
			totalValue += dice.getDiceValue();
		}
	}
	
	public int getTotalValue(){
		return totalValue;
	}

	public void myInit(){
		System.out.println("�ʱ�ȭ �۾��Ϸ�...");
	}


}













