import java.util.Random;

public class GuessMyNumberModel {
    private int myNumber;
    private int maxNumber;
    private int lastGuess;
    private int noOfGuesses;

    GuessMyNumberModel(int m) {
        noOfGuesses = 0;
        maxNumber = m;
        randomizer();
    }

    public void initGame() {
        randomizer();
        noOfGuesses = 0;
        lastGuess = 0;
    }

    public void setGuess(int i) {
        lastGuess = i;
        noOfGuesses++;
    }

    public String compareGuessToStr() {
        if (compareGuess() == 0) {
            return "correct";
        } else if (compareGuess() == 1) {
            return "to high";
        }
        return "to low";
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public int getMAX() {
        return maxNumber;
    }

    public int getSecret() {
        return myNumber;
    }

    private int compareGuess() {
        if (lastGuess == myNumber) {
            return 0;
        } else if (lastGuess > myNumber) {
            return 1;
        }
        return -1;
    }

    private void randomizer() {
        Random rd = new Random();
        myNumber = rd.nextInt(maxNumber);
    }

}