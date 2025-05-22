public class DemoWrapper {
  public static void main(String[] args) {
    // 8 primitives
    byte b = 1;
    short s = 2;
    int x = 3;
    long l = 4L;
    float f = 3.14f;
    double d = 3.14d;
    char c = 'a';
    boolean b2 = true;

    // Wrapper Class of char
    Character c1 = Character.valueOf('a');
    System.out.println(c1); // a
    char c0 = c1.charValue();
    System.out.println(c0);// a

    System.out.println(c1.compareTo(Character.valueOf('c'))); // -2 'a'-'c'=-2
    System.out.println(Character.valueOf('c').compareTo(c1)); // 2 'c'-'a'=2
    System.out
        .println(Character.valueOf('c').compareTo(Character.valueOf('c'))); // 0

    // Wrapper Class of boolean
    Boolean b3 = Boolean.valueOf(true);
    Boolean b4 = Boolean.valueOf(false);

    // Wrapper Class of byte, short, int, long
    byte b6 = 2;
    Byte b5 = Byte.valueOf((byte) 2);
    // int -> byte (unsafe)
    Short s2 = Short.valueOf((short) 2);
    Integer i1 = Integer.valueOf(2);
    Long l1 = Long.valueOf(2L);

    // Wrapper class of float, double
    Float f3 = Float.valueOf(3.14f);
    Double d3 = Double.valueOf(3.14);

    // ! Autoboxing (Only for the pair of primitive and wrapper class)
    // int value -> Integer variable
    Integer i2 = 2;

    // int -> long (safe conversion)
    long l3 = 2;

    // int value -> long value -> Long (NOT OK for auto-conversion)
    // Long l2 = 2;

    // long value -> Long
    Long l2 = 2L;

    // ! Unboxing
    int i4 = Integer.valueOf(10);
    // int i5 = Long.valueOf(10L); //-NOT OK return type of Long.valueOf(10L) is Long Object,Long Object can not be assigned to int i5 (primitive variable
    int i5 = Long.valueOf(10L).intValue(); // OK return type of intValue() is an int
    long i11 = Long.valueOf(10L);

    //! Long -> long -> int -> (autobox) Integer
    Integer i6 = (int) ((long) Long.valueOf(10L));
    //Explaination:
    // Long.valueOf(10L) creates a Long object.
    // (long) converts the Long object to a primitive long.
    // (int) then converts the long to a primitive int.
    // assigning this primitive int to i6, Java performs autoboxing, converting the int to an Integer.

    // ! compareTo() for Integer Comparison return -1,1 and 0 ONLY
    int age = 102;
    // ! Integer never use >, <, >=, <=, We should use compareTo for comparison
    System.out.println(Integer.valueOf(100).compareTo(Integer.valueOf(age))); // -1 (right is larger)
    System.out.println(Integer.valueOf(102).compareTo(Integer.valueOf(age))); // 0

    // unboxing for Math operation (int - int -> int)
    // When you use the - operator, Java automatically converts these Integer objects to their corresponding primitive int values.
    // This process is called unboxing.
    int diff = Integer.valueOf(100) - Integer.valueOf(age);
    System.out.println(diff); // -2


    // ! compareTo() for String Comparison lexicographically (dictionary order).
    String s10 = "abcd";
    String s11 = "bcde";
    System.out.println(s11.compareTo(s10)); // 1 (compare first char, b - a)
    System.out.println(s10.compareTo(s11)); // -1 (compare first char, a - b)
    String s12 = "ccde";
    System.out.println(s12.compareTo(s10)); // 2 (compare first char, c - a)
    String s13 = "cdde";
    System.out.println(s13.compareTo(s12)); // 1 (d - c)

    String s14 = "Abcd";
    System.out.println(s14.compareTo(s10)); // -32 (A - a) 65-97=-32->ASCII Code of 'A'= 65, ASCII Code od 'a'= 97
    String s16 = "Abcde";
    System.out.println(s14.compareTo(s16)); // -1


    String s18="car";//'r' (Unicode 114)
    String s19 ="cat"; //'t' (Unicode 116).
    System.out.println("s18.compareTo(s19) :"+ s18.compareTo(s19));//-2  =114-116

    String name = "John";
    // if (name.equals("John") == false) {
    if (!name.equals("John")) {
      // do something
      System.out.println("Not John");
    } else { //
      System.out.println("John"); // John
    }



  }
}
