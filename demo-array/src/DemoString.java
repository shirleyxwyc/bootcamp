public class DemoString {
  public static void main(String[] args) {
    // week 1: equals(), length(), charAt()
    // week 2. Other String methods

    // method 1.replace()
    System.out.println("bootcamp".replace("o", "x")); // bxxtcamp,replace("parameter1","parameter2")
    System.out.println("bootcamoop".replace("oo", "lll"));// bllltcamlllp

    // method 2. indexOf() //!important opposit of charAt
    //indexOf(String str):
    //Returns the index of the first occurrence of the substring as an int. If the substring is not found, it returns -1.
    System.out.println("hello".indexOf('o')); // 4, index of char 'o' in String "hello".
    System.out.println("hello".indexOf('a')); // -1, index of "a" in hello".
    System.out.println("hello".indexOf(' ')); // -1, index of " " in hello".
    System.out.println("hello".indexOf('l'));// 2 -->first index char 'l'
    System.out.println("hello".indexOf("el"));//1-->first index of string "el"
    System.out.println("hello".indexOf("llo"));//2-->first index of string"llo"
    System.out.println("hello".indexOf("lo"));//3-->first index of string "lo"
    System.out.println("hello".indexOf("heo"));//-1-->no such string

    // 3. concat()
    String s1 = "hello" + "world";
    System.out.println("s1: "+s1);// s1: helloworld

    // "+"--> slow performance
    String s2 = "hello".concat("world");
    System.out.println("s2: "+s2);//s2: helloworld

    //! 4.lastIndexOf()
    System.out.println("hello world".lastIndexOf('l'));// 9

    // 5.isEmpty()
    boolean result = "".isEmpty();
    System.out.println(result);// true
    System.out.println("hello".isEmpty());// false

    // 6.trim()
    System.out.println(" hello world !!! ".trim()); // trim走头尾space
    System.out.println(" hello world !!! ".trim().length()); // 15

    // code style: chain method
    System.out.println(" hello ".replace('e', 'a').trim().charAt(1)); // a ,//!now it is a char, you can not .length
    // System.out.println(" hello ".replace('L','a'))

    // String method return diffent types

    // 7.substring
    // !get letter 'e(index1)' and 'l(index 2)'so you type 3(parameter-1==2)
    System.out.println("hello".substring(1, 3)); // el //!fist index 1, end index -1
    System.out.println("hello".substring(0)); // hello //! "hello"from the end of string

    // !Example :
    // extract the second & third characters
    // if the string not long enough, extract as much as possible
    String unknown = "hello";
    // "h" -> "" (group 1) indexOf()-->0
    // "he" -> "e" (group 2) indexOf()-->1
    // "hell" -> "el" (group 3 - normal case) indexOf()-->1
    // "hello world" -> "el" (group 3 - normal case) indexOf()-->1

    System.out.println(unknown.substring(1, 3)); // el
    // System.out.println("h".substring(1,3)); //error

    int startIndex = 1;
    int endIndex = 2;
    
    if (unknown.length() < 2) {// (group 1)
      startIndex = 1;
      endIndex = 0;
    } else if (unknown.length() == 2) {// (group 2)
      endIndex = 1;
    } else { // unknown.length()>=3 //(group 3 / normal case)
      startIndex = 1; //'e'
      endIndex = 2; //'l'
    }
    System.out.println("answer: "+ unknown.substring(startIndex, endIndex + 1));// el

    // 8.toLowerCase()
    System.out.println("HELLO!!!".toLowerCase());// hello!!!
    System.out.println("hello!!!".toUpperCase());// HELLO!!!

    // 9.contains()
    System.out.println("hello".contains("ll")); // true
    System.out.println("hello".contains("lll")); // false
    String name = "Steven";
    if (name.contains("t")) {
      System.out.println("your name contains t letter");
    } // your name contains t letter

    // 10. startsWith(),endsWith()
    System.out.println("hello".startsWith("he")); // true
    System.out.println("hello".startsWith("helll")); // false
    System.out.println("hello".endsWith("lo")); // true
    System.out.println("hello".endsWith("lll"));// false

    //! Exercise 
    //Check if the String value is Palindromic左右对称
    //madam
    //ada
    //abcba
    //abccba

    //String s = "madam"; //true
    //1. String to char
    //for(int i=0;i<s.length()/2;i++){
      //if(char(i)==char(i)+4){
        
      //}

    //}
    //System.out.println("madam"+s.length()/2);
    //System.out.println("madam"+s.charAt(i));





  }
}
