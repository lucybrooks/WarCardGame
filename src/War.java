public class War {

 public static void main(String[] args) 
 {
  // create deck, hands and stacks
   CardDeck deck=new CardDeck();
   CardList handA=new CardList();
   CardList handB=new CardList();
   CardList stackA=new CardList();
   CardList stackB=new CardList();
  

  // deal the cards
   for(int i=22; i>0; i--)
   {
     handA.addCardToTop(deck.takeCardFromTop());
     handB.addCardToTop(deck.takeCardFromTop());
   }
   
  // play
   System.out.println("A --- Player --- B");
   Card a; 
   Card b;
   int round=1;
   while(handA.size()>0 && handB.size()>0)
   {
    stackA.addCardToTop(handA.takeCardFromTop());
    stackB.addCardToTop(handB.takeCardFromTop());
    if(a.compareTo(b)<0)
    {
      handA.addCardToBottom(stackA.takeCardFromTop());
      handA.addCardToBottom(stackB.takeCardFromTop());
    }
    else
    {
      handB.addCardToBottom(stackA.takeCardFromTop());
      handB.addCardToBottom(stackB.takeCardFromTop());
    }
    if(a!=b)
    {
      System.out.println(handA.size()+" ---Round"+round+"--- "+handB.size());
      round++;
      System.out.println("     "+a.toString()+" : "+b.toString+"     ");
    }
    else
    {
      System.out.println(handA.size()+" ---WAR--- "+handB.size());
      round=1;
      System.out.println("     "+a.toString()+" : "+b.toString()+"     ");
    } 
 }
 }}
