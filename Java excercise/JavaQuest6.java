public class JavaQuest6 {
  public static void main(String[] args) {
     /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ... 
   * 
   */
      int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    int next =0;
    for (int i=0; i<15;i++) {
      next = first + second;
      first=second;
      second=next;
      System.out.print(first);
      System.out.print(" ");
      //1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 
    }


    
  }
}
