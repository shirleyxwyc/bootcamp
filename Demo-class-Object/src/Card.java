public class Card {
  //!static-> common values for all objects but not belongs to objects
  //!final-> Cannot modify the value after initialization
  //NON-Static and Non-final
  //Static and Non-final
  //Static and final
  //NON-Static and final
  //creating dictionary--> public so that can be called by Class Deck
  public static final char DIAMOND ='1'; //capital letters means constant
  public static final char CLUB ='2'; //capital letters means constant
  public static final char HEART ='3'; //capital letters means constant
  public static final char SPADE ='4';//capital letters means constant

  public static final char ACE ='Z';
  public static final char TWO ='2';
  public static final char THREE ='3';
  public static final char FOUR ='4';
  public static final char FIVE ='5';
  public static final char SIX ='6';
  public static final char SEVEN ='7';
  public static final char EIGHT ='8';
  public static final char NINE ='9';
  public static final char TEN ='A';
  public static final char JACK ='J';
  public static final char QUEEN ='X';
  public static final char KING ='Y';


  //1.readability
  //2.Data type range(unique and appropriate)
  //range
  //suite (DIANOND,CLUB,HEART,SPADE)

  private char rank; //(1,2,3,4,5,6,7,8,9,T,J,Q,K)
  private char suit; //(D,C,H,S)

  //Constructor
public Card (char rank, char suit){
  this.rank=rank;
  this.suit=suit;
}

  //Setter
//no need as card attributes won't be changed-->constant

  //Getter
  public char getRank (){
    return this.rank;
  }

  public char getSuit (){
    return this.suit;
  }

  //Color
  public boolean isRed () {
    if(suit==DIAMOND || suit==HEART)
    return true;
    return false;
  }


  public boolean equals(Card card) {
    return this.rank==card.getRank() && this.suit==card.getSuit();
  }
  //define range: 0,-1,1
  public int compareTo(Card card) {
    if(this.rank==card.getRank()) {// 比较花色 (suit)
      if(this.suit>card.getSuit()){
      return 1;// 当前牌的花色更大
      }else if (this.suit<card.getSuit()){
        return -1;// 当前牌的花色更小
      }
      return 0;// 花色也相同，两张牌完全相等

    }
    //different ranks
    return this.rank > card.getRank() ?1 :-1;

  }

  // add toString Method-> Card(rankZ, suit1)
  public String toString() {
    return "Card(" + "rank" + this.rank +", suit" + this.suit + ")";
  }


  public static void main(String[] args) {
    Card c1=new Card(TWO, CLUB);
    Card c2=new Card(TWO, CLUB);
    System.out.println(c1.equals(c2));//true testing
    Card c3=new Card(THREE, CLUB);
    Card c4=new Card(TWO, HEART);
    System.out.println(c3.equals(c4));//false  testing
    Card c5=new Card(ACE, SPADE);
    System.out.println(c1.equals(c5));//false  testing
    System.out.println(c3.equals(c4));//false  testing

    System.out.println(c1.compareTo(c2)); // 0
    System.out.println(c1.compareTo(c3)); // -1
    System.out.println(c5.compareTo(c1)); // 1

    Card c6 = new Card(ACE, DIAMOND);
    System.out.println(c5.compareTo(c6)); // 1

    System.out.println(c6); //ACE-->need to add method.toString()-->Card(rankZ, suit1)
    System.out.println(c1);//Card(rank2, suit2) 
    System.out.println(c2);//Card(rank2, suit2)
    System.out.println(c3);//Card(rank3, suit2)
    System.out.println(c4);//Card(rank2, suit3)
    System.out.println(c5);//Card(rankZ, suit4)
  }

  }




