public class DemoString {
  //String-Literal Pool
  //!we have only one object "hello"
  String s ="hello";
  String s1 ="hello";

  String s2 ="hello1"; // different String

  //so , at the moment, we got 2 String objects in memory(hello and hello1)
  //but we have 3 objects references(s,s1,s2)

  //Operation
  String s = s + "World"; //s ->helloworld
  //at this moment, we got 3 objects (hello, helloworld and hello1)

  s1=s1+"???" //we got 3 objects (hello???,helloworld and hello1)
  //"hello" object will be collected by JVM (auto-GC)

  //Algorithm -> program (Performance : runtime speed(Time complexity) and memory usage(Space Complexity))

  


  public static void main(String[] args) {
    
  }
}
