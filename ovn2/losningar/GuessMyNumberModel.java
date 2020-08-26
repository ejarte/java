import java.util.Random;

public class GuessMyNumberModel {
	
	private int secret, noOfGuesses, guess;
	private final int MAX;
	private static Random rand = new Random();

	public GuessMyNumberModel(int MAX) {
		this.MAX = MAX;
		initGame();
	}
	
	public void initGame() {
		secret = rand.nextInt(MAX) + 1; // 1..MAX
		noOfGuesses = 0;
		guess = -1;
	}
	
	public int getNoOfGuesses() {
		return noOfGuesses;
	}
	
	public int getGuess() {
		return guess;
	}
	
	public int getMAX() {
		return MAX;
	}
	
	public int getSecret() {
		return secret;
	}
	
	public void setGuess(int guess) {
		this.guess = guess;
		noOfGuesses++;
	}
	
	/**
	 * This method returns < 0 if guess is to low, 
	 * 0 if correct and > 0 if to high.
	 */
	public int compareGuess() {
		return (guess - secret);
	}
	
	public String compareGuessToStr( ) {
		if(compareGuess() > 0) return "to high";
		if(compareGuess() < 0) return "to low";
		return "correct";
	}
}
