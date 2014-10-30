package CDIO2;

public class Dice {

	private int value;
	private int sides;
		
	public Dice(){
		// Antager en standard terning har 6 sider.
		this.sides = 6;
	}
	// overloader contructor for at kunne ændre antal sidder.
	public Dice(int sides){
		this.sides = sides;
	}
	
	public void hit(){
		double d = Math.random()* sides + 1;
		value = (int)d;
	}
	
	public int getValue(){
		return value;
	}
}
