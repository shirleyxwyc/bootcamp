    /**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */

public class JavaQuest9 {
  public static void main(String[] args) {


 String str = "VenturenixLAB, Java";

 // prints J
 System.out.println(str.indexOf('J'));//15
 System.out.println(str.charAt(str.indexOf('J')));//J
 // prints e (the 1st e)
 System.out.println(str.indexOf('e'));//1
 System.out.println(str.charAt(str.indexOf('e')));//e
 // code here ...
 
 // Use indexOf()
 // prints 3
 System.out.println(str.indexOf('t')); //3
 // prints 9
 System.out.println(str.indexOf('x'));//9
 // prints 10
 System.out.println(str.indexOf('L'));//10
 // code here ...

 // Use String trim()
 String abc = "    ab c    ";
 System.out.println(abc.trim()); //ab c
 // prints "ab c"

 // Use String replace() method
 // prints VenturenixLAB, Coding
 // code here ...
 System.out.println(str.replace("Java", "Coding"));//VenturenixLAB, Coding

 // int length()
 System.out.println("VenturenixLAB, Coding".length());//21
 System.out.println("VenturenixLAB, Java".length());//19
 System.out.println(str.length());//19
 // prints 19


 // Use String substring(int start, int end)
 // prints "ren"
 // code here ...
 System.out.println(str.substring(5,8));//ren //!substring(begin index, end index+1)記得+1

 // print "VENTURENIXLAB, JAVA"
 System.out.println(str.toUpperCase());//VENTURENIXLAB, JAVA
 // prints "venturenixlab, java"
 System.out.println(str.toLowerCase());//venturenixlab, java
 

 // Method Chaining (one line to complete)
 // prints "V*NTUR*NIXLAB, JAVA!!!"
 // code here ...
System.out.println(str.toUpperCase().replace('E', '*'));//V*NTUR*NIXLAB, JAVA





  }
}
