import java.util.Scanner;

public class Day4GuessingGame {
  public static void main(String[] args) {
    //1-100
    
    //User A:(1-100)93 
    //User A:(1-92)49
    //User A:(50-92)66
    //User A:(67-92)68
    //User A:(67-67)67

    //bomb = 67
    int bomb = 67;
    int min = 1;
    int max = 100;
    int input = -1; //!input a number ranging between 1 - 100 ,所以未開始的狀態 input set -1
    int round = 0; //!未開始的狀態 input set 0，round % 2 才會出雙數 ==0 ，User A先出
    char user = 'A';
    Scanner scanner = new Scanner(System.in);


    while(input != bomb) { //!using while loop as we don't know when will be the final round , for loop is used when we know the exact no. of the final round
      if(round % 2 == 0) {//!round starts from 0, it is user A
        user = 'A';
      } else {
        user = 'B';
      }
      
      System.out.println("User " + user + ", Please input a number ranging between " + min +" - "+ max+" :");
      input = scanner.nextInt(); //input
      if(input >= min && input <= max){
        if(input < bomb) {
          min = input + 1;
        } else {
          max = input - 1;
        }
        round++;//! increment 要放在while {} 及 優先/最外圍的if{} 内//!round decided which user to be called out
      }
      //!round++ increment 不放在這裏！！否則如user input out of range min & max ,不能keep住promp 原user 入input！
    }
    if(round % 2 == 0) { //!難以估計final round是多少，所以現代入，如round 1,user A input bomb and lost, 1%2==0會跳落user B -->print out user B win.
      user = 'A'; 
    }else{
      user = 'B';
    }
    System.out.println("Game Ended! User " + user + " wins and bomb is " + bomb);

     // ! How about 3 Users?















    
  }
}
