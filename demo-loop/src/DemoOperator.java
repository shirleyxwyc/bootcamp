public class DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);
    ++x;
    System.out.println(x);

    x=++x+1;
    System.out.println(x); //7

    x=x+++1;
    System.out.println(x); //8

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
    //step 1: firdt ++y =y=8+1=9
    //Step 2: second ++y , y=step 1(9) +1 =10
    System.out.println(x);

    y=8; //reset
    x=y++ + y++ +2;
    //step 1: first y++ -->8
    //step 2: first y++ -->9
    //step 3:8+9+2
    System.out.println(x); //19
    System.out.println(y); //10












  }
}
