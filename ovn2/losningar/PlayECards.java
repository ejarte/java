
import cardswithenum.ECard;
import cardswithenum.Rank;
import cardswithenum.Suit;

public class PlayECards {

    public static void main(String[] args) {
        ECard c1 = new ECard(Rank.KING, Suit.HEARTS);
        ECard c2 = new ECard(Rank.TEN, Suit.SPADES);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        if (c1.compareRank(c2) > 0) {
            System.out.println(c1.toString()
                    + " has higher rank than " + c2.toString());
        } else {
            System.out.println(c2.toString()
                    + " has higher rank than " + c1.toString());
        }
    }
}
