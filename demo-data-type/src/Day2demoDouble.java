public class Day2demoDouble {
   public static void main(String[]args){

    int x = 9;
    double y = 9.9;
    System.out.println(y);

    //store 99.9 into a variable price
    double price = 99.9;
    //store 3 into variable quantity
    int quantity = 3;
    //calculate checkout amount
     double amount=price * quantity;
     System.out.println(amount);

     //!int/int must be an int
     double w = 10/3;
     System.out.println(w);

     double score1 = 71;
     double score2 = 82;
     double averageScore = (score1 + score2)/2;
     System.out.println(averageScore);

    //!double/int must be double
     double score3 = 71.0;
     int score4 = 82;
     double averageScore2 = (score3 + score4)/2; //76.5
     System.out.println(averageScore2);

     //divide by zero
     //!double r3 = 10 / 0;-->undefined
     //System.out.println(r3);

     double r4 = 0 / 10;
     System.out.println(r4); //0










   } 
}
