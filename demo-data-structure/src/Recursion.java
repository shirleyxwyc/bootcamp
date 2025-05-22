public class Recursion {

  // even number ,10...n
//what is recursion : 自己ｃａｌｌ自己，降低ｍｅｍｏｒｙ　ｃｏｎｓｕｍｐｔｉｏｎ，　ｌｏｗ　ｒｅａｄｉｂｉｌｉｔｙ
  public static int sum(int n) {
    // step 1: base case to exit
    if (n <= 10)
      return n;
    // step 2 : pattern to the next round
    return n + sum(n - 2);
  }

public static int question (int n){
if (n<10)
return 0;
if(n % 2==1) 
n--;
return sum(n);
}


  public static void main(String[] args) {
    System.out.println(question (11));
  System.out.println(question (21));

  }
}
