public class RuleManager {

  // Given 5 cards with same suit
  public boolean isFlush(Card[] cards) {
    if (cards == null || cards.length != 5) {
      return false;
    }
    if (cards[0].getSuit() == cards[1].getSuit()
        && cards[1].getSuit() == cards[2].getSuit()
        && cards[2].getSuit() == cards[3].getSuit()
        && cards[3].getSuit() == cards[4].getSuit()) {
      return true;
    }
    return false;
  }


  public static void main(String[] args) {

    Card c1 = new Card(Card.DIAMOND, Card.TWO);
    Card c2 = new Card(Card.DIAMOND, Card.THREE);
    Card c3 = new Card(Card.DIAMOND, Card.FOUR);
    Card c4 = new Card(Card.DIAMOND, Card.SIX);
    Card c5 = new Card(Card.DIAMOND, Card.NINE);

    Card[] cards = {c1, c2, c3, c4, c5}; // Create an array of cards
    System.out.println("Suit of card 0: " + cards[0].getSuit()); //Suit of card 0: D
    System.out.println("Suit of card 1: " + cards[1].getSuit());//Suit of card 1: D
    System.out.println("Suit of card 2: " + cards[2].getSuit());//Suit of card 2: D
    System.out.println("Suit of card 3: " + cards[3].getSuit());//Suit of card 3: D
    System.out.println("Suit of card 4: " + cards[4].getSuit());//Suit of card 4: D


    RuleManager ruleManager = new RuleManager(); // Create an instance of RuleManager
    boolean result = ruleManager.isFlush(cards); // Check if the cards are a flush

    System.out.println("isFlush? " + result); //isFlush? true

  }
}
