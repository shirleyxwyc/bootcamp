import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Child {
  private String name;

  public Child(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public static class Ball { // ! Static Nested Class
    private int num;
  }


  // ! Inner Class -non static

  public class Toy {
    private String code;

     public Toy(String code){
    this.code=code;
     }
    // The constructor Child.Toy() is undefined????
    // The constructor of the inner class must include a reference to the outer class instance

    @Override
    public String toString() {
      return "Child.Toy(" + "code=" + this.code + ",name=" + name // ! Inner class is able to access Outer Class (Child) attributes
          + ")";
    }
  }

  @Override
    public String toString() {
      return "Child("+ "name=" + this.name // ! Inner class is able to access Outer Class (Child) attributes
          + ")";
    }
  

  public static void main(String[] args) {
    // !Non-static Inner Class (Toy)->need to create Outter Class Object first:
    Child c1 = new Child("John");
    Child.Ball b1 = new Child.Ball();

    // Child.Toy t1=new Child.Toy();//not OK

    // Child.Toy t1=new Child().new Toy();//ok

    // Child c2 = new Child();//ok
    // Child. Toy t1= c2.new Toy();//ok

    // !Non-static Inner Class (Toy)->need to create Outter Class Object first and then
    // !use outter object to create inner object

    Child c2 = new Child("Peter");
    Child.Toy t1 = c2.new Toy("Code-1234");
    Child.Toy t2 = c2.new Toy("Code-2345");

    System.out.println(t1); // Child.Toy(code=null,name=Peter)null because I didn't wrote constructor
    //Child.Toy(code=Code-1234,name=Peter)
    c2.setName("Annie");
    System.out.println(t1); // Child.Toy(code=null,name=Annie)//Child.Toy(code=Code-1234,name=Annie)

    // t1 c2
    // Map<Child, List<Toy>> map = new HashMap<>();

    // Anomynous Inner Class- no need to create Child Class and that object can implement walk()
    // Write in main ->One time Object(runtime object) :just to implement some action
    Walkable child = new Walkable() {
      @Override
      public void walk() {
        System.out.println("I am child and walking..");
      }
    };

    Eatable child2 = new Eatable() {
      @Override
      public void eat() {
        System.out.println("I am child and eating..");
      }
    };

    child.walk();// I am child and walking..
    child2.eat();// I am child and eating..

    // Java 8: Lambda -> only match with @Functional Interface
    // Write in main ->One time Object(runtime object) :just to implement some action,
    // ! Walkable child3-> child 3 only implement one walk() method
    // !
    Walkable child3 = () -> System.out.println("I am child");


    Walkable child4 = () -> { // if more than 1 line, use ->{stout....}
      System.out.println("I am child");
      System.out.println("I am walking on the road...");
    };
    child4.walk();// I am child I am walking on the road...

    // Living child5 =()-> //compile error , because Living interface has 2 methods-> not a Functional Interface

  }

}


