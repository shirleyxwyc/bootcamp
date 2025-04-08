public class Demoprimitive {
  public static void main (String[] args) {
    //there are 8 primitives in Java:(int, double, long, short, byte, float, boolean, char)
    //primitive for integer (byte, short, int, long)

    short s1 = 10;
    short s2=-32768;
    short s3=32767;
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    int x1 = 1_000_000;
    int x2 = -2147483648; //-2147483648 is an integer and it is the lowerest limit of integer,so int x3=-2147483649 is an illegal int value
    int x3 = 2147483647;
    System.out.println(x1);
    System.out.println(x2);
    System.out.println(x3);

    //long
    long l1 = 10;
    //long l2 = -2147483649;
    //System.out.println(l2);
    //long l2 = -2147483649; over int limit. so has to add"L" as below
    long l3 = -2147483649L;
    System.out.println(l3);

    //x3=x3+1;
    //System.out.println(x3); //!overflow

    byte b1 = -128;
    byte b2 = 127;
    
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
