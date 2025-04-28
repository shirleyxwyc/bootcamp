public class DemoInteger {
  public static void main(String[] args) {
    Integer x = 3; //autobox
    Integer y = 128; //autobox
    //check if y>x
    System.out.println(y.compareTo(x)>0); //true
    System.out.println(y>x); //true  auto converted to int , but >not preferred

    Integer y2 = 128;
    System.out.println(y.compareTo(y2));//0
    System.out.println(y==y2);//false

    Integer x2=3;
    System.out.println(x==x2); //true ??? 3 is within the -128-127 range so can be reused

    Integer x3= new Integer(3);
    System.out.println(x==x3);//false

    Integer x4 = Integer.valueOf(3);
    System.out.println(x==x4); //true

    //how about out of -128-127 range 
    Integer y3 = Integer.valueOf(128);
    System.out.println(y2==y3); //false
    





  }
}
