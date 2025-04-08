public class DemoString {
  public static void main(String[]args){
    char c1 = 'H';
    //String is not a primitive;
    String s1 = "Hello"; //String has not boundry
    String s2 = "100";
    
    s2 = s2 +"100";
    System.out.println(s2);//"100100"

    s1 = s1 +"100";
    System.out.println(s1);//"Hello100"

    String s3 = s1+100; 
    System.out.println(s3);//string + int =string??

    System.out.println("I am going to add two numbers together:");








  }
}
