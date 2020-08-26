
import cardswithints.ICard;


public class PlayICards {

    public static void main(String[] args) {
        ICard c1 = new ICard(13, 3);
        ICard c2 = new ICard(10, 4);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        if (c1.getRank() > c2.getRank()) {
            System.out.println(c1.toString()
                    + " has higher rank than " + c2.toString());
        } else {
            System.out.println(c2.toString()
                    + " has higher rank than " + c1.toString());
        }
    }
}
