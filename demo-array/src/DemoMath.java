import java.util.Arrays;
import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    
    //abs
    //pow
    double result = Math.abs(-3.0); //!Math.abs (double, double)
    System.out.println("absolute value of -3.0 is " +result); //3.0
    //int --> double ()
    double result2=Math.pow(2,3);
    System.out.println(result2); //8.0

    //square root


    //random () 0-1 
    System.out.println("The Random number from 0-1 is " +Math.random());

    //new random().nextInt()
    System.out.println("The Random number from 0-2 is " +new Random().nextInt(3));//0-2
    
    System.out.println("The Random number from 1-3 is " +new Random().nextInt(3)+1);//1-3

    //0-48
    System.out.println("The Random number from 0-48 is " +new Random().nextInt(48));

    //1-49
    System.out.println("The Random number from 1-49 is " + new Random().nextInt(49)+1);//1-49

    //! Revisit 
    //Generate 6 different numbers between 1-49-->create 1st array markSix with 6 int values
    int [] markSix =new int[6];
    
    int k=0;
    while(k<markSix.length){
      markSix[k]=(new Random().nextInt(49)+1);
      k++;
    }

     //Generate 6 different numbers between 1-49--->create 2nd array markSix2 with 6 int values
     int[] markSix2 = new int[6];
     int uniqueCount = 0;  //unique number counts
     boolean found =false;//boolean isDuplicate =false;
     
     while(uniqueCount<markSix2.length) {
      int generatedValue = new Random().nextInt(49)+1;

      found = false; //reset to false each time if true same as the found not found example //isDuplicate = false;
      
      //code..for loop + if
      for(int i=0; i<markSix2.length; i++) {
        if(markSix2[i]==generatedValue){
          found=true;
          break;
        }
      }
      //!check if generated value is already in the array-->isDuplicated/isfound
      if(!found) { 
        markSix2[uniqueCount]=generatedValue;
        uniqueCount++;
      }
     }
     System.out.println("The 6 non duplicated numbers stored in markSix2 array are " + Arrays.toString(markSix2));




















    
  }
}
