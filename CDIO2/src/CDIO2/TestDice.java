package CDIO2;

public class TestDice {

	public static void main(String[] args) {
		
		Dice die = new Dice();
		Dice die2 = new Dice(20);
		int[][] stats = new int[2][];
		stats[0]= new int[1000];
		stats[1]= new int[1000];
		
		for(int i = 0; i<stats[0].length; i++){
			die.hit();
			stats[0][i] = die.getValue();
			die2.hit();
			stats[1][i] = die2.getValue();
		}
		for(int i : stats[0]){
			System.out.println(i);
		}
		for(int i : stats[1]){
			System.out.println(i);
		}
		

	}

}
