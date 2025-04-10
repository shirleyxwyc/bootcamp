public class Day3String {
  public static void main(String[] args) {
    char c1 = 'H'; //! char use single quote('') not double quote("")

    // String is not a primitive, //! String use double quote("") not single quote('') 
    String s1 = "Hello"; //!since length() returns as an int by default so the maximum length of a string is same as the max range of int (ie, 2^31-1)
    String s2 = "100";

    // String + operation
    s2 = s2 + "100";
    System.out.println("s2= "+s2); // "100100"
    s1 = s1 + "100";
    System.out.println("s1= "+s1); // "Hello100"

    //!String + int =String
    String s3 = "hello" + 13;
    System.out.println("s3= "+s3);//"hello13"

    //! String + boolean -> String
    s3 = s3 + true;
    System.out.println(s3); //"hello13true"

    // ! String Method 1: .equals()
    // ! Primitive has no tools (value storage ONLY)
    // ! String is not a primitive. So String can store value and has tool.
    // ! == checks if two variables point to the same object in memory
    // ! .equals() checks if two strings have the same content
    
    String s4 = "hello";
    System.out.println(s4.equals("hello"));//true
    System.out.println("hello is same as Hello is "+ s4.equals("Hello")); //false, case sensitive
    
    boolean result = s4.equals("hello"); //true
    System.out.println("result is "+result); 

    //!1. Basic equals() Usage
    String name1 = "Alice";
    String name2 = "Alice";
    String name3 = new String("Alice");  // Force new object

    // Compare with equals()
    System.out.println(name1.equals(name2)+", name1 has same content as name2");  // true (same content)
    System.out.println(name1.equals(name3)+", name1 has same content as name3");  // true (same content)

    //! Compare with == (BAD PRACTICE for content comparison)
    System.out.println(name1 == name2);       //! true (due to string pooling)
    System.out.println(name1 == name3);       //! false (different objects as these strings are stored in different memory locations)

    // ! String method 2: length() 括號内不需要參數ｐａｒａｍｅｔｅｒ
    // 參數 = parameter
    // length() has no parameters
    String s5 = "Shirley";
    System.out.println(s5.length()); //length of "shirley" is 7
    String s6 = "Hello World";
    System.out.println(s6.length()); //length of "Hello World" is 11, space is included and count as 1 length

    int s6Length = s6.length();
    System.out.println(s6Length);//11

    double d1 = s6.length(); 
    System.out.println("d1 = " +d1); //11.0// ! why OK?
    //short s10 = s6.length(); //! not ok because String.length() always returns an int in default!

     //  ! String Method 3: charAt()
    // 1 is an index, which always start with 0
    System.out.println(s6.charAt(1)); // e
    System.out.println(s6.charAt(0)); // H



  }
  
}
