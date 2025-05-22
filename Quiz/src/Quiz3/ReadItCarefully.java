package Quiz3;

public class ReadItCarefully {
  //Question 7
  static final String string = "IamFinalString";
  private static char c = 'C'; // initialization

  public char getC() {
    return c;
  }

  // !A static block initializes static variables when the class is loaded.
  // static block allowing you to modify static variables, including private ones(non final), without a setter method.
  // static block CANNOT modify static final variables
  static {
    char[] chars = string.toCharArray();
    c = chars[2];
    // c was previously declard as char
    // Sets static variable c to 'm' from 'C' in static block

  }

  public static void main(String[] args) {

    ReadItCarefully readItCarefully = new ReadItCarefully();
    System.out.println(readItCarefully.getC());
    
    //object readItCarefully can access a static variable but not recommend to do so
    System.out.println(readItCarefully.c);// m
    // converts the string to a character array and
    // assigns the third character (index 2, which is 'm') to the static variable c
    System.out.println("c is " + c); // c is m
    System.out.println(readItCarefully.getC());// m

  }

}
