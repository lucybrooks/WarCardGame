public abstract class PlayingCard {
	
	// represents the suit of the card as an integer
	//    Heart, Club, Diamond or Spade
	//   = 1      2     3          4
	private int suit;
	
	// represents the rank of the card as an integer
	//    Ace 2 3 4 5 6 7 8 9 10 Jack Queen King
	//   =  1 2 3 4 5 6 7 8 9 10 11   12    13
	private int rank;
	
	public PlayingCard(int cardSuit, int cardRank) {
		suit=cardSuit;
		rank=cardRank;
	}
		
	public abstract String toString();
	
	// returns the suit of this card
 public int getSuit() 
 {
  return suit;
 }
 
 // returns the rank of this card
 public int getRank() 
 {
  return rank;
 }
}
