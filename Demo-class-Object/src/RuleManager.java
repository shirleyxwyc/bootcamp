public class RuleManager {
  
  //Input -> Output
  public static boolean isPair(Card c1, Card c2) {
    return c1.getRank()==c2.getRank();
  }

  public static boolean isPair(Card c1, Card c2, Card c3) {
    return c1.getRank()==c2.getRank() && c1.getRank()==c3.getRank();
  }

  //given 5 cards
  //8 7 8 8 7 (3,2,0,0,0...)
  public static boolean isFullHouse(Card[] cards) {
    int counter=0;
    for (int i= 0; i<)



  //6,7,8,9,10
  //A,K,Q,J,10
  //no need to care about suit, just consider rank
    public static boolean isStraight(Card[] cards) {
      //array
    }

  //same cards  with same suit
  public static boolean isFlush(Card[] cards) {
    if(cards.length != 5)
    return false;
    return card[0].getSuit()==card[1].getSuit()
        && card[1].getSuit()==card[2].getSuit()
        && card[2].getSuit()==card[3].getSuit()
        && card[3].getSuit()==card[0].getSuit();
  }
  
  public static void main(String[] args) {
    //testing if 5 cards are same isFlush
    Card c1 = new Card(Card.TWO, Card.DIAMOND);
    Card c2 = new Card(Card.TWO, Card.DIAMOND);
    Card c3 = new Card(Card.THREE, Card.DIAMOND);
    Card c4 = new Card(Card.FOUR, Card.DIAMOND);
    Card c5 = new Card(Card.FIVE, Card.DIAMOND);



  }
}
