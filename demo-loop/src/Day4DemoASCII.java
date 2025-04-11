public class Day4DemoASCII {
  public static void main(String[] args) {
    // "" -> String value
    // '' -> char value
    char x = 'a';
    int convertA = x;
    System.out.println(convertA); //a is 97 in ASCII

    char y = 'b';
    int convertB = y;
    System.out.println(convertB); //b is 98 in ASCII

    // char (Math operation)
    // char - char -> int - int -> int
    
    System.out.println('b'-'a'); //-1  //! char - char -> int - int -> int

    //! given a-z, convert to 1-26
    char v = 'z';
    int convertZ = v;
    System.out.println(convertZ); //z = 122
    int converted = v - 'a' + 1;
    System.out.println(converted); // 26

   
    for(int i=97; i<=122; i++){
      char letter = (char) i; //! meaning of (char)?
System.out.println(letter + "-->" + (i-'a'+1));
    }


  }
}
