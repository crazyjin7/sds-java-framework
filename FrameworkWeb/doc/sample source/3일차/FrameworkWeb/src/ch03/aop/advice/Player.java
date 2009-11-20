package ch03.aop.advice;


public class Player{
	
	Dice dice;
	int totalValue = 0;	
	String id = "";
	
//	public Player(Dice dice){
//		this.dice = dice;
//		System.out.println("Player 생성 완료.");
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
		System.out.println("초기화 작업완료...");
	}


}













