import java.util.HashMap;
import java.util.Map;

@FunationalInterface // only ONE method-> void fly()

public interface Flyable {
  // !no ATTRIBUTE
  // int x=10; //implicitly static final variable

  static final int X = 10;

  // ! all methods in interface are abstract method(before Java8)
  void fly();

  // After Java 8:
  // abstract class Vs abstract interface: both have default method which can be inherited by child class
  // but inteface has no attribute

  // Afte Java 8: default method is instance method
  default String drink(String something) {
    return "I am drinking " + something;
  }

  static int sum(int x, int y) {
    return x = y;
  }



  public static void main(String[] args) {
     
    Cat c1=new Cat();
    System.out.println(c1.drink("water"));//I am drinking water
    c1.fly();//Cat is flying

    // Lambda-> get same result as above but no need Class cat and new Cat()->Lamda upgraded after Java 8
    Flyable cat = () -> System.out.println("cat is flying");
    cat.fly(); // cat is flying
    System.out.println(cat.drink("water"));// I am drinking water
    //Lambda default drink(String something) method can be used

    Flyable.sum(1, 2); //Interface can call static method as well

//Map-Lamba
Map<String, Child> childMap = new HashMap<>();
childMap.put("john", new Child("John"));
childMap.put("peter", new Child("Peter"));

Child result = childMap.computeIfAbsent("peter", name-> new Child(name));
System.out.println(result);//Child(name=Peter)
Child result2 = childMap.computeIfAbsent("sally", name-> new Child(name));
System.out.println(result2);//Child(name=sally)

System.out.println(childMap.size());//3


  }
}


