public class Card extends PlayingCard implements Comparable <Card>
{
 private String[] suitstring = new String[5];
  private String[] rankstring = new String[14];
  
  public Card(int suit, int rank)
  {
    super(suit, rank);
    suitstring[1] = "H";
    suitstring[2] = "C";
    suitstring[3] = "D";
    suitstring[4] = "S";
    
    rankstring[1] = "A";
    rankstring[2] = "2";
    rankstring[3] = "3";
    rankstring[4] = "4";
    rankstring[5] = "5";
    rankstring[6] = "6";
    rankstring[7] = "7";
    rankstring[8] = "8";
    rankstring[9] = "9";
    rankstring[10] = "10";
    rankstring[11] = "J";
    rankstring[12] = "Q";
    rankstring[13] = "K";
  }
  
  //Accessors - to String
  public String toString()
  {
    return rankstring[this.getRank()]+"-"+suitstring[this.getSuit()];
  }
  // - compareTo(..): compare by rank
  public int compareTo(Card other)
  {
    return this.getRank()-other.getRank();
  }
}
