public class DemoConversion {
  public static void main(String[] args) {
    //! 1. implicit conversion
    //byte--> short--> int--> long--> float--> double
    //!char(65xxx) --> int (2^31)

    int ascii ='a';
    System.out.println(ascii);//97
    int assciiofA = 'A';
    System.out.println(assciiofA);//65
    int ascii0f0 ='0';
    System.out.println(ascii0f0);//48

    //!2. Explicit conversion
    int x2 = 8; // will get error if x2 >40000
    short s2 = (short) x2;

    //! 3. auto-box , unbox (Wrapper)
    int x3 = Integer.valueOf(9); //unbox
    Integer x4 = x3; //autobox

    



















  }
}
