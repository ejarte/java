
package cardswithints;

public class ICard {
	
	/*  rank: 1 = Ace, 2 = 2, ...
	 *  suit: 1 = diamonds, 2 = clubs, ...
	 */						
	public ICard(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public boolean equals(ICard other) {
		return this.rank == other.rank && this.suit == other.suit;
	}
	
	public String toString() {
		String info = RANK_TAB[rank-1] + " of " + SUIT_TAB[suit-1];
		return info;
	}
	
	private final int rank, suit;

	// Tables for converting rank & suit to text 
        // static - rankTab is common to all Card objects ("class data")
	private static final String[] RANK_TAB = {
		"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
		"Jack", "Queen", "King"	
	};
	
	private static final String[] SUIT_TAB = {
		"diamonds", "clubs", "hearts", "spades" 
	};
}
