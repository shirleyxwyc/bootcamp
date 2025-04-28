import java.util.Arrays;
import javax.swing.SwingUtilities;

public class Deck {

  public static final char[] SUITS =
      new char[] {Card.CLUB, Card.DIAMOND, Card.HEART, Card.SPADE};

  public static final char[] RANKS = new char[] {Card.ACE, Card.TWO, Card.THREE,
      Card.FOUR, Card.FIVE, Card.SIX, Card.SEVEN, Card.EIGHT, Card.NINE,
      Card.TEN, Card.JACK, Card.QUEEN, Card.KING};

  // Attribute
  private Card[] cards;

  // Contributor

  public Deck() {
    this.cards = new Card[SUITS.length * RANKS.length];
    int idx = 0;
    for (int i = 0; i < SUITS.length; i++) {
      for (int j = 0; j < RANKS.length; j++) {
        this.cards[idx] = new Card(SUITS[i], RANKS[j]);
        idx++;
      }
    }
  }


  // no Setter

  // Getter
  public Card[] getCards() {
    return this.cards;
  }



  public static void main(String[] args) {
    Deck d1 = new Deck();
    System.out.println(Arrays.toString(d1.getCards()));

  }

}
