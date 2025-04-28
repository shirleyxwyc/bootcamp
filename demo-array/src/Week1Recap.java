public class Week1Recap {
  public static void main(String[] args) {
     // Data Type: Primitives
     byte b1 = -128;
     byte b2 = 127;
     // byte b3 = 128;
 
     // short s1 = 33000;
     short s2 = 32000;
     short s3 = -32000;
 
     int i1 = 2_100_000_000;
     int i2 = -2_100_000_000;
 
     // int to long (auto-convert)
     long l1 = 10L;
 
     //
     float f1 = 3.3f;
     double d1 = 1.9;
 
     char c1 = 'a';
     //char - char --> int - int
     System.out.println('a' - 'a'); // 'a' - 'a'=0
     System.out.println('a' - 'b'); // 'a' - 'b'=-1
 
     boolean isElderly = false;
     // isEldery -> formula / definition
     int age = 65;
     isElderly = age >= 65;
 
     if (!isElderly) {
       System.out.println("I am not an elderly.");
     }
     if (age < 65) {
       System.out.println("I am not an elderly.");
     }
     
    //application of true && false --> false
    //application of true || false --> true
    
     int b = 3;
     boolean result = b > 1 || b > 10;
     System.out.println("result="+result);//result=true
     
     boolean result2 = true || false;
     System.out.println("result2="+result2); //result2=true
     
     boolean result3 = true && false;
     System.out.println("result3="+result3); //result3=false
    
    // +, -, *, /, %
    int c = 10;
    boolean isOdd = c % 2 == 1; //false
    System.out.println("boolean isOdd is " + isOdd);
    
    
    //!++a and a++ 
    //!a++ = a+=1 =a=a+1
    //!a+=2 =a=a+2
    
    
    int u = 5;
    int v = ++u;  // u 先变成 6，然后assign 6 to v 
    System.out.println("u= "+u); // u=6
    System.out.println("v= "+v); // v=6
    
    int a = 0;
    a++; //+1
    ++a; //+1
    System.out.println("a= "+ a); //a=2

    int e = 0;
    e++; 
    ++e; 
    System.out.println("++e = "+ ++e);//++e=3//!
    System.out.println("e = " + e);//e=3

    int f = 0;
    f++; 
    ++f; 
    System.out.println("f++= "+ f++);//f++=2
    System.out.println("f= "+ f);//f=3 
    //sames as below int g:
    int g = 0;
    g++; 
    ++g; 
    System.out.println("g ="+g); // g=2=f++ both =2
    g++;
    System.out.println(g++);//3


    int h = 0;
    h++; 
    ++h; 
    System.out.println("h++ = "+ h++);// h++=2

   
    
    //!Other shortcuts: +=, -=, *=, /=
    a += 1; //prefer to use a++ instead
    a += 2; //same as a = a+2
    a += 3; //same as a = a+3
    
    // System.out.println(10 / 0); // system error
    System.out.println(0 / 3); // 0
    System.out.println(10 / 3); // 3 int/int=int decimal places are trimmed away
    System.out.println(10.0 / 3.0); // 3.3333333333333335 double/double=double

       
    //if , if _else if, else
    //!if , else if 唔好写重叠range;

    int y = 10;
    int z = -3;
    if(y>2 && z<1) {
      System.out.println("do something 1");
    } else if (y>2 && z>=1){
      System.out.println("do something 2");
    } else if (y<=2 && z<1) {
      System.out.println("do something 3");
    } else { //y<=2 && z>=1)) 
      System.out.println("do the rest");
    }

    int t=-2;
    if(t>8) {
      System.out.println("t is 9 or above");
    }else if (t>1 && t<=8) {
      System.out.println("t is between 2-8");
    }else if (t>-3 && t<=1){
      System.out.println("t is between -2 to 1");
    }else{ //t<=-3
      System.out.println("t is -3 or below");
    }

    int o = 9; //! please revisit again when you are free
    //! 1. == (cannot check range of values)
    // 2. break;
    switch (o) {
      case 1:
        System.out.println("do something 1 ...");
        break;
      case 2:
        System.out.println("do something 2 ...");
        break;
      default:
        System.out.println("something else ...");
    }

    // loop, repeat to do something in x times
    for (int i = 0; i<3; i++) {// 重复做一样野3次
      System.out.println("hello");// 重复print "hello" 3次
    }

    String s = "bootcamp";
    System.out.println(s.charAt(3)); //t, index =3, the letter is 't'
    System.out.println("length of bootcamp is " + s.length());//!8 but index is from 0-7 
    
    // we can leverage i to do something (i.e. charAt)
    for(int i=0; i<s.length();i++) { 
      System.out.println(s.charAt(i));//重复数由i=0 至i=7(8次) ,i=0, print char index=0'b'....至i=7,char index=7=>'p'
    }
    //! please revisit below again when you are free
    int count = 0;
    while (count < 3) {
      System.out.println("hello");
      count++;
    }

    count = 0;
    do {
      System.out.println("bye");
      count++;
    } while (count < 3);

    // equals
    String w = "Java";
    if (w.equals("Java")) {
      System.out.println("it is Java");
    }

    // ! case sensitive
    if (w.equals("java")) {
      System.out.println("it is java"); // not print
    }

    // ! Preferable
    if ("Java".equals(w)) {
      System.out.println("it is Java");
    }

    // length()
    System.out.println(w.length()); // 4
    System.out.println("Java".length()); // 4

    // charAt()
    System.out.println(w.charAt(0)); // J
    System.out.println("Java".charAt(0)); // J

    // System.out.println("Java".charAt(-1)); // system error
    // System.out.println(w.charAt(w.length())); //! system error
    System.out.println(w.charAt(w.length() - 1)); // a//!记得charAt(i)放index，所以w.length要减1

    //! VERY IMPORTANT --> for loop + if
    String s4 = "Goodbye";
    System.out.println("length of Goodbye is "+s4.length());//7 index from 0-6

    //how many small letters in s4 ("Goodbye")? hint:'a'=97, 'z'=122 
    // ! When you perform +,-,*,/ or comparison, Java will convert char to int.
    int number = 0;
    for(int i = 0; i<s4.length();i++) {//length of Goodbye is 7 
      if (s4.charAt(i)>=97 && s4.charAt(i)<=122) { //G不在97-122这个range,所以可用if去排除G
        number++; //number will + 1 once whenever the above if condition is true
      }
    }
    System.out.println("no.of small letters in Goodbye is " +number);




    
    



  }
  
}
