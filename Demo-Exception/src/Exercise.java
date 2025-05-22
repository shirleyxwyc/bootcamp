
public class Exercise {
// arrayIndexoutofbounds
    // divide by 0
    // numberformatexception
  public static void main(String[] args) {

    int[] arr = new int[5];
    int idx = 4;

    if (arr[idx] < 0 || arr[idx] >= arr.length)
      return;

    System.out.println(arr[idx]);
    
    //! arrayIndexoutofbounds
    int idxInputtedByUser = -1;

    try {
      System.out.println("Start to try");
      System.out.println(arr[idxInputtedByUser]);
      System.out.println("End the try");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("error root cause " + e.getMessage());
      System.out.println("Hello");
    }


    //!NumberFormatException e

    String yearInputedByUser ="2025s";
Integer year =null;

    try{

    }catch{
      
    }




  }

}
