public class CardDeck extends CardList
{
  //feilds: suits, ranks, swaps
  private int suits;
  private int ranks;
  private int swaps=10000;
  
  //Constructor CardDeck()
  public CardDeck()
  {
    super();
    suits=4;
    ranks=13;
    for(int suit =1; suit<=suits; suit++)
    {
      for(int rank=1; rank<=ranks; rank++)
      {
        addCardToBottom(new Card(suit, rank));
      }
    }
  }
  
  //Accessors shuffle
  public void shuffle()
  {
    Card card;
    for(int count=1; count<swaps; count++)
    {
      card=this.removeRandomCard();
      this.addCardToBottom(card);
    }
  }
}
