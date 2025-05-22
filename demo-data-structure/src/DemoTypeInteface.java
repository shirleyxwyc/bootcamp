import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTypeInteface { 
//private var age; //compile error.Not OK as var can not be T



  public static void main(String[] args) {
    //Java is Strong type
    String s="hello"; 

    //Chapter 35:-var
//Java 10 -introduced var , var is just for initial declaration(left =right in terms of type). but not recomment to use. lower readability
var s2="Oscar"; 
//During compile time(java file-> class file), var-> String
//s2=13; //compile error as s2 was previously declared as String, so the compiler recognised s2 as String but 13 is int

s2.charAt(0);

var s3 =new Ball(Ball.Color.BLUE, 13);
//s3="Oscar"; NOT OK

//! var should not be used as type/attribute type or return type nor parameter type of a method
//int sum =sum(3+4);-Not OK
//public var sum(int x, int y){ -Not OK
  //return x+y;
//}
//public int sum (var x, var y){-Not OK

//}

List<String> names = new ArrayList<>(Arrays.asList("mary","Oscar","sue"));



  }
}
