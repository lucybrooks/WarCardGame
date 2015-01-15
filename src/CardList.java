import java.util.*;

public class CardList
{
  //feilds - cards, random
  private ArrayList<String> list;
  private Random random=newRandom();
  
  //Constructors CardList()
  public CardList()
  {
     ArrayList<String> list=new ArrayList[0];
  }
       
  //Accessors size()
  public int size()
  {
    return list.size();
  }
  
  //Mutators - addCardToBottom
  public void addCardToBottom(Card c)
  {
    list.add(c);
  }
  //addCardToTop
  public void addCardToTop(Card c)
  {
    list.add(c);
  }
  //takeCardFromTop
  public void takeCardFromTop(Card c)
  {
    list.remove(c);
  }
  //removeRandomCard
  public void removeRandomCard(Card c)
  {
    int randCardNum=random.nextInt(card.size());
    list.remove(randCardNum);
  }
}
