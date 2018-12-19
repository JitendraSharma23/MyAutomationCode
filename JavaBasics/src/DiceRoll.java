
public class DiceRoll {
	static int dice;
	
	DiceRoll(){
		roll();
	}
	public void roll() {
		dice = (int)(Math.random()*6)+1;
	}
	public int getdice()
	{
		return dice;
		
	}
	

	public static void main(String[] args) {
		
		DiceRoll ob = new DiceRoll();
		////ob.getdice();
		System.out.println(dice);
	}

}
