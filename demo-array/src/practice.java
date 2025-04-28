import java.util.Arrays;
import java.util.Random;

public class practice {
  public static void main(String[] args) {
    //1. Create an array with 6 empty boxes to store 6 undeclared int values --> all initally is default to 0
    
    //2. using while loop to loop through those boxes in the array for 6 times(=array length) and generate 6 values randomly with a range from 1-49-->use Random().nextInt()+1
    
    // Generate 6 different numbers between 1-49
    int[] marksix2 = new int[6];
    int uniqueCount = 0;
    boolean found = false;
    while (uniqueCount < 6) {
      int generatedValue = 2;
      // ! Check if generated value is already in the array -> found (duplicated)
      // code .. for loop + if
      found = false;
      for (int i = 0; i < marksix2.length; i++) {
        if (marksix2[i] == generatedValue) {
          found = true;
          break;
        }
      }
      if (!found) {
        marksix2[uniqueCount] = generatedValue;
        uniqueCount++;
      }
    }
    System.out.println(Arrays.toString(marksix2));


    //3.















  }
}
