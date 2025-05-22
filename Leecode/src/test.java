public class test {
  
  public static void main(String[] args) {
       Eatable child4= ()-> { //if more than 1 line, use ->{stout....}
System.out.println("I am child");
System.out.println("I am eating now...");
  };
  child4.eat();//I am child I am eating now...
  }
}
  