public class War 
{
  public static void main(String[] args) 
  {
    // create deck, hands and stacks
    CardDeck deck=new CardDeck();
    CardList handA=new CardList();
    CardList handB=new CardList();
    CardList stackA=new CardList();
    CardList stackB=new CardList();
    // deal the cards
    for(int i=26; i>0; i--)
    {
      handA.addCardToTop(deck.takeCardFromTop());
      handB.addCardToTop(deck.takeCardFromTop());
    }
    System.out.println(handA.getTopCard().toString());
    System.out.println(handB.getTopCard().toString());
    
    // play
    System.out.println("A --- Player --- B");
    int round=1;
    while(handA.size()>0 && handB.size()>0)
    {
      stackA.addCardToTop(handA.takeCardFromTop());
      stackB.addCardToTop(handB.takeCardFromTop());
      System.out.println(stackA.getTopCard().toString());
      System.out.println(stackB.getTopCard().toString());
      if(stackA.getTopCard().compareTo(stackB.getTopCard())>0)
      {
        System.out.println(handA.size()+" ---Round "+round+"--- "+handB.size());
        round++;
        System.out.println("     "+stackA.getTopCard().toString()+" : "+stackB.getTopCard().toString()+"     ");
        handA.addCardToBottom(stackA.takeCardFromTop());
        handA.addCardToBottom(stackB.takeCardFromTop());
      }
      else if(stackB.getTopCard().compareTo(stackA.getTopCard())>0)
      {
        System.out.println(handA.size()+" ---Round "+round+"--- "+handB.size());
        round++;
        System.out.println("     "+stackA.getTopCard().toString()+" : "+stackB.getTopCard().toString()+"     ");
        handB.addCardToBottom(stackA.takeCardFromTop());
        handB.addCardToBottom(stackB.takeCardFromTop());
      }
     else
      {
       System.out.println(handA.size()+" ----- WAR ----- "+handB.size());
        round++;
        if(handA.size()-1>0 && handB.size()-1>0)
        {
          stackA.addCardToTop(handA.takeCardFromTop());
          stackB.addCardToTop(handB.takeCardFromTop());
          if(stackA.getTopCard().compareTo(stackB.getTopCard())>0)
          {
            System.out.println("     "+stackA.getTopCard().toString()+" : "+stackB.getTopCard().toString()+"     ");
            handA.addCardToBottom(stackA.takeCardFromTop());
            handA.addCardToBottom(stackB.takeCardFromTop());
          }
          else if(stackB.getTopCard().compareTo(stackA.getTopCard())>0)
          {
            System.out.println("     "+stackA.getTopCard().toString()+" : "+stackB.getTopCard().toString()+"     ");
            handB.addCardToBottom(stackA.takeCardFromTop());
            handB.addCardToBottom(stackB.takeCardFromTop());
          }
        }
      }
    }
  }
}
