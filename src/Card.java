public class Card extends PlayingCard implements Comparable <Card>
{
  //constructor - Card(int suit, int rank)
  public Card(int suit, int rank)
  {
    super(suit, rank);
  }
  
  //Accessors - to String
  public String toString()
  {
    return this.getRank()+"-"+this.getSuit();
  }
  // - compareTo(..): compare by rank
  public int compareTo(Card other)
  {
    return this.getRank()-other.getRank();
  }
}
