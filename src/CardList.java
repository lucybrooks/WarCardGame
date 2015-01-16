import java.uimport java.util.*;

public class CardList
{
  //feilds - cards, random
  private ArrayList<Card> list;
  private Random random=new Random();
  
  //Constructors CardList()
  public CardList()
  {
    list=new ArrayList<Card>();
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
  public Card takeCardFromTop()
  {
    return list.remove(0);
  }
  //removeRandomCard
  public Card removeRandomCard()
  {
    int randCardNum=random.nextInt(list.size());
    Card k=list.get(randCardNum);
    list.remove(randCardNum);
    return k;
  }
}
