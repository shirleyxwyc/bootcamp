import java.util.Random;

public class ShuffleManager {
  
  public Card[] shuffle(Card[]cards) {
    if(cards.length<=2) //when cards size <3 ,we shuffle cards
    return cards;
    //define how to shuffle 1 time
    //random(1-50), skip 0 and 51, array middle 
//int index = new Random().nextInt(52); // skip 0 and 51->(0-49)+1->1-50
//int idx = new Random().nextInt(50)+1;

int idx = new Random().nextInt(50)+1;



  }

  public static void main(String[] args) {
    int[] arr = new int []{1,2,3,4,5,6,7};
    int[] arr5 = new int[arr.length];

//random->4
//number of cards = 2
//[5,6,1,2,3,4,7]
for(int i=0; i<arr.length;i++) {

}

  }
}
