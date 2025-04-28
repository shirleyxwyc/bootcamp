public class Day3Demoprimitive {
  public static void main (String[] args) {

    //variable can only be used after being declared and initialized.
    //local variable only exist within the code block when it is declared. 
    //local variable goes out of scope and is no longer accessible one the code block has finished executing.
    
    //there are 8 primitives in Java:(int, double, long, short, byte, float, boolean, char)
    //primitive for integer (byte, short, int, long)
    //! byte--> short--> int--> long--> float--> double
    //! byte(8bits)--> short(16 bits)--> int(32 bits)--> long(64 bits)--> float(32 bits)--> double(64bits)

    //! short : range from -32xxx to 32xxx
    short s1 = 10;
    short s2=-32768;
    short s3=32767;
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    //!int: range from -2^31(i.e. -2_147_483_648/roughly-2.1b) to 2^31-1(i.e. 2_147_483_647 roughly 2.1b)。
    int x1 = 1_000_000;
    int x2 = -2_147_483_648; //-2147483648 is an integer and it is the lowerest limit of integer,so int x3=-2147483649 is an illegal int value
    int x3 = 2_147_483_647;
    //int x4 = 2_147_483_650;//!out of range//overflow//runtime error
    double x5 = Math.pow(2, 3); //!Math.pow(double base, double exponent)
    System.out.println("x1= "+x1);
    System.out.println("x2= "+x2);
    System.out.println("x3= "+x3);
    //System.out.println("x4= "+x4);//!out of range//overflow//runtime error
    System.out.println("x5= "+x5);
    x3=x3+10;
    System.out.println("overflow x3= "+x3); //! overflow x3= -2147483639 

    //! long
    // ! -2147483649 -> illegal int value
    // ! -2147483649L -> long value
    long l1 = 10L;
    //long l2 = -2147483649;
    //System.out.println(l2);
    //long l2 = -2147483649; over int limit. so has to add"L" as below
    long l3 = -2147483649L;
    System.out.println("l3= "+ l3);//l3= -2147483649

    // long + int -> long
    l1 = l1 + 100;
    System.out.println(l1);//110

    

    //byte : range from -128 to 127
    byte b1 = -128;
    byte b2 = 127;
    
    byte b3= 24;
    byte b4=7;
    byte b5 = (byte)(b3*b4); //24*7=168 out of byte range,overflow,so b5=168-256*n=168-256*1=-88
    System.out.println("b5 is "+b5);//-88

    int i=200;
    byte j = (byte) i;
    System.out.println("j is "+j); //200-256n=200-256*1=-56

    byte value =127;
    for (int k=0; k<10;k++) {//i=0,1,2,3,..9
      value++;
      System.out.println("value =" +value);
    }
//i=0, value=127+1=-128 , 128-256=-128
//i=1, value=-128 +1=-127 
//i=2, value=-127+1=-126
//i=3, value=-126+1=-125 
//i=4, value=-125+1=-124, 
//i=5, value=-124+1=-123, 
//i=6, value=-123+1=-122, 
//i=7, value=-122+1=-121, 
//i=8, value=-121+1=-120,
//i=9, value=-120+1=-119, 



    
    //double, float
    //9.5 is a double 
    //9.5f is a float value
    double d1 = 9.5;
    double d2 = 9.5;
    System.out.println("d2="+d2);
    float f1 = 9.5f;
    System.out.println("f1="+f1);
    //float f2 = 9.5; //y not valid? 9.5 is double which is more precise than float. when a more precise value is assigned to a less prcised one, decimal places would be trimmed.
    float f2 = 9.5f;
    System.out.println("f2="+f2);

    float f3 = 0.3f - 0.1f;
    System.out.println(f2); // 0.20000002 (same problem with double)


    //boolean
    boolean b10 = true;
    b10 = false; //reassignment
    System.out.println("b10=" +b10); //false
    int age = 66; 
    //"age>65 --> comparison"
    boolean isElderly = age > 65;
    System.out.println(isElderly); //true

    //char
    //store single value
    //'a' is char value
    //c1 is char variable
    char c1 = 'a';
    char c2 = '%';
    char c3 = '+';
    char c4 = '1';
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    








  }  
}
