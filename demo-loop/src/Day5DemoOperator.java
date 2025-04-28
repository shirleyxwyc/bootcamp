public class Day5DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);//x=3+1=4
    ++x;
    System.out.println(x);//x=4+1=5

    x = ++x + 1;
    System.out.println(x); //x=5+1+1=7

    //!
    int u = x++ + 1;
    System.out.println("u= "+u); //!承上題x=7， u=7+1=8
    System.out.println(x);//!執行assignment 后， x 后增1-> 7+1=8

    x=x+1;
    System.out.println(x); //x=9

    int y =2;
    x = ++y + 1;
    System.out.println("x=" +x); //4
    System.out.println("y=" +y); //3

    x=y++ +1;
    System.out.println(x); //4
    System.out.println(y); //4

    int k = 0;
    while(k++ <3) {
      System.out.println("hello"); //print hello 3 times
    }

  
    y=8;
    x=++y + ++y +2;
    //step 1: first ++y =y=8+1=9
    //Step 2: second ++y , y=step 1(9) +1 =10
    System.out.println(x);//9+10+2=21

    y=8; //reset
    x=y++ + y++ +2;
    //step 1: first y++ -->8(the value before incrementing), after this first y++ postincrement opearation ,y=8 +1 =9
    //step 2: 2nd y++- ->9(the value before incrementing), after this second y++ postincrement opearation ,y=9 +1 =10
    //step 3:x=8+9+2
    System.out.println(x); //19
    System.out.println(y); //10












  }
}
