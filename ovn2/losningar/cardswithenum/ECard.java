package cardswithenum;

public class ECard {

    private final Rank rank;
    private final Suit suit;

    public ECard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
    
    public int getRankValue() {
        return rank.getValue();
    }
    
    public int getSuitValue() {
        return suit.ordinal(); // default values, 0, 1, 2, 3
    }

    public boolean equals(ECard other) {
        return this.rank == other.rank && this.suit == other.suit;
    }
    
    public int compareRank(ECard other) {
    	return this.rank.getValue() - other.rank.getValue();
    }

    @Override
    public String toString() {
        String info = rank + " of " + suit;
        return info;
    }
}
