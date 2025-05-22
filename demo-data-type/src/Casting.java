public class Casting {

  public static void main(String[] args) {
    //Type Promotion(Widening conversion)->always safe
    //casting a primitive type to another primitive with larger capacity
    //no parentheses() needed
    long y = 3; //assign int to long
    System.out.println(y);
    
    //! Type Casting(explicit conversion/narrow conversion)->data loss
    //data loss mean 3.3->3 losing decimal places
    //parentheses() needed
    int x=(int) 3.3; //assign double to int
    System.out.println(x);//3

    




  }
  
}
