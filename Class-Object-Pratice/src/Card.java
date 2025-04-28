public class Card {
  public static final char CLUB = 'C';// ASCII=67
  public static final char DIAMOND = 'D';// ASCII=68
  public static final char HEART = 'H';// ASCII=72
  public static final char SPADE = 'S';// 83

  public static final char ACE = 'z';// ASCII=122
  public static final char TWO = '2';
  public static final char THREE = '3';
  public static final char FOUR = '4';
  public static final char FIVE = '5';
  public static final char SIX = '6';
  public static final char SEVEN = '7';
  public static final char EIGHT = '8';
  public static final char NINE = '9';// ASCII=57
  public static final char TEN = 'v'; // ASCII=118
  public static final char JACK = 'w'; // ASCII=119
  public static final char QUEEN = 'x';// ASCII=120
  public static final char KING = 'y';// ASCII=121


  // Attribute
  private char suit;
  private char rank;


  // Constructor
  public Card(char suit, char rank) {
    this.suit = suit;
    this.rank = rank;
  }

  // Setter-no setter

  // Getter
  public char getSuit() {
    return this.suit;
  }

  public char getRank() {
    return this.rank;
  }

  // Method

  public boolean equals(Card card) {
    return this.suit == card.getSuit() && this.rank == card.getRank();
  }

  // define 0, 1, -1

  public int compareTo(Card card) {
    if (this.rank == card.getRank()) {
      if (this.suit > card.getSuit()) { // comparing suit
        return 1;
      } else if (this.suit < card.getSuit()) {
        return -1;
      }
      return 0;
    }

    // different rank
    if (this.rank > card.getRank()) {
      return 1;
    } else if (this.rank < card.getRank()) {
      return -1;
    }
    return 0;
  }

// return this.rank > card.getRank() ?1 :-1;



// add toString Method-> Card(rankZ, suit1)

   public String toString() {
    return "(" + "Suit " + suit + " , Rank " + rank + ")";
  }



  public static void main(String[] args) {
    Card card = new Card('0', '0');
    Card c1 = new Card(SPADE, ACE);
    Card c2 = new Card(SPADE, ACE);
    Card c3 = new Card(CLUB, TEN);
    Card c4 = new Card(HEART, TEN);
    Card c5 = new Card(DIAMOND, JACK);
    Card c6 = new Card(DIAMOND, QUEEN);

    System.out.println(c3.getSuit());// C=CLUB
    System.out.println(c3.getRank());// v=10
    System.out.println(c1.equals(c2));// true
    System.out.println(c1.equals(c3));// false
    System.out.println(c1.compareTo(c4)); // 1
    System.out.println(c5.compareTo(c6)); // -1
    System.out.println(c1.compareTo(c2)); // 0

    System.out.println(c1);//(Suit S , Rank z)
    System.out.println("c3 = " + c3); //c3 = (Suit C , Rank v)
    System.out.println("c4 = " + c4); //c4 = (Suit H , Rank v)



  }
}
