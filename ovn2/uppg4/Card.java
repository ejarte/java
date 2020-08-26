public class Card {
    private int suit;
    private int rank;

    Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card with suit: " + suit + " and rank: " + rank;
    }
}