import java.util.Scanner;

public class Day4GameuseContinue {
  public static void main(String[] args) {
    //! using for + continue here!
    //1-100
    
    //User A:(1-100)93 
    //User A:(1-92)49
    //User A:(50-92)66
    //User A:(67-92)68
    //User A:(67-67)67

    //bomb = 67
    
    int bomb = 67;
    int round = 0;
    int input = -1;
    int min = 1;
    int max = 100;
    char user = 'A';
    Scanner scanner = new Scanner(System.in);
    
    while(input != bomb) {
      if(round % 2 == 0){
        user = 'A';
      } else {
        user = 'B';
      }
      
      System.out.println("User " + user + ", Please input a number ranging between " + min +" - "+ max+" :");
      input = scanner.nextInt();
      if(input < min || input > max){
        continue; } //! change to if + continue
        if(input < bomb){
          min = input +1;
        } else{
          max = input -1;
        }
        round++; //!round decided which user to be called out
      }

if(round % 2 == 0) {
  user = 'A';
} else {
  user = 'B';
}
System.out.println("Game Ended! User " + user + " wins and bomb is " + bomb);



  }
}
