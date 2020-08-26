public class main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        System.out.println(dice.getValue());
        System.out.println(dice.throwDice());
        System.out.println(dice.toString());

        Dice secondDice = new Dice();

        for(int i = 0; i < 10; i++){
            System.out.println("first dice: " + dice.throwDice() + " second dice: " + secondDice.throwDice());
        }

        int[] sides = new int[7];

        for(int i = 0; i < 1000; i++){
            sides[dice.throwDice()]++;
        }

        for(int i = 1; i <= 6; i++){
            System.out.println("This many " + i + ": " + sides[i]);
        }
    }
}