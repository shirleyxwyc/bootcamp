import java.util.Arrays;

public class Deck {
  // there should be 52 different cards (each with different range and suit) in one deck
  private static final char[] SUITS =
      new char[] {Card.DIAMOND, Card.CLUB, Card.HEART, Card.SPADE};

  private static final char[] RANKS = new char[] {Card.ACE, Card.TWO,
      Card.THREE, Card.FOUR, Card.FIVE, Card.SIX, Card.SEVEN, Card.EIGHT,
      Card.NINE, Card.TEN, Card.JACK, Card.QUEEN, Card.KING};

  private Card[] cards;

  // Constructor for array: make sure the reference is pointing empty card array ->NULL-->else can not do .length for safty reason
  // public Deck () {
  // this.cards = new Card[0];
  // }
  // put all 52 cards in the card array, define each suit has range 13 .for loop to loop definitions
  public Deck() {
    this.cards = new Card[SUITS.length * RANKS.length]; //card array not yet assigned
    int idx = 0;
    for (int i = 0; i < SUITS.length; i++) {
      for (int j = 0; j < RANKS.length; j++){
        this.cards[idx] = new Card(RANKS[j], SUITS[i]); // creating new card array to put 52 cards in the array
        idx++;
    }
  }
}

  public Card[] getCards() {
    return this.cards;
  }


  public static void main(String[] args) {
    Deck d1 = new Deck();
    System.out.println(Arrays.toString(d1.getCards()));


  }
}
