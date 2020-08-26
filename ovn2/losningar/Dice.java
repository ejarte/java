/**
 * Representing a dice.
 * Contract: 1 <= value <= 6
 */

public class Dice {

	private int value;
	
	public Dice() {
		value = 1;
	}
	
	public int getValue() {
		return value;
	}
	
	public void throwDice() {
		// Randomize a value
		value = (int) (Math.random()*6 + 1);
	}
	
	public String toString() {
		String info = "value = " + value; 
		return info;
	}
}
