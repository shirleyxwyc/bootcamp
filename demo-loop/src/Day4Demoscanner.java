import java.util.Scanner;

public class Day4Demoscanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int input = scanner.nextInt();

    //System.out.println("input" +input);

    //Determine if the input is odd or even number
    if(input%2==0){
      System.out.println("it is even number");
    }else{
      System.out.println("it is an odd number");
    }



  }
  
}
