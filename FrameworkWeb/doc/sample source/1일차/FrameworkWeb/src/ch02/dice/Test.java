package ch02.dice;

public class Test {
	
	public static void main(String[] args) {
		Dice dice = new Dice4();
		Player p = new Player(dice);
		p.play();
		System.out.println("���� ���� �ֻ����� �� : " + p.getTotalValue());
	}

}
