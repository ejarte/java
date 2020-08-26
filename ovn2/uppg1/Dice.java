import java.util.Random;

public class Dice {
    int value;
    Random rand = new Random();

    Dice(){
        value = 1;
    }

    int throwDice(){
        value = rand.nextInt(6) + 1;
        return value;
    }

    int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return ("The value of Dice is: " + value);
    }
}