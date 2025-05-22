import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {
  // List is an interface
  // List is an interface that defines a contract of abstract and implicitly public methods for operations
  // such as adding, removing, and accessing elements.
  // These abstract methods must be implemented and overrided by classes like ArrayList, LinkedList, and Vector.



  public static void main(String[] args) {

    // ArrayList<Bird> birds = new ArrayList<>(); 
    // List interface has a set of methods to be imprements
    List<Bird> birds = new ArrayList<>();
    System.out.println(birds.isEmpty());// true

    birds.add(new Bird("John", null));
    //Static /Compile-time Polymorphism(Overloaded methods)
    // At compile time, the variable birds is declared as a List<Bird>,
    // meaning it can use the methods defined in the List interface.
    // Since ArrayList implements the List interface, it must provide concrete implementations for the abstract add() methods in List

    //Dynamic / Run-time Polymorphism(Overriding methods)
    // At runtime, JVM recognizes that birds is actually an instance of ArrayList.
    // Therefore, the add() method's implementation provided by ArrayList is invoked,
    // the add() method from ArrayList is executed,
    // abstract add() method defined in the List interface would not be used.

    // Polymorphism in Short:
    // Compile time: List determines if birds is able to call add()
    // Run time: ArrayList.add()


    birds = new LinkedList<>(birds); // reassign the birds arrayList in which Bird Object John is inside
    System.out.println(birds);// [Bird()name= John)]

    birds.add(new Bird("Vincent", null));
    System.out.println(birds.getLast().getName());// Vincent
    //Vincent is added only to the LinkedList. 
    //The original ArrayList still exists in memory but is no longer referenced by birds. 
    //So, after the reassignment, any new additions (like "Vincent") will go to the LinkedList. 
    //The ArrayList remains unchanged and contains only "John".

    //!why we use List<Bird> as object reference type
      //becoz both LinkedList and ArrayList implement the List interface, making them subtypes of List. 
      //This allows you to use them interchangeably when working with List references.
      //Easily change to LinkedList if needed
      //becoz if we use ArrayList<Bird> as object reference type-> i.e., ArrayList<Bird> birds = new ArrayList<>(); 
      //we can not reassign birds to LinkedList because LinkedList is not a subtype of ArrayList
      //Not valid->ArrayList<Bird> birds = new LinkedList<>(birds);
      //declaring birds variable as List<Bird>, means the you can only access methods defined in the List interface.
   


    //!declaring manyBirds variable as LinkedList<Bird> means:
     //!1)you are able to call methods specific to LinkedList (like addFirst() or addLast()) and not on List,and
     //2)able to call List interface methods
    LinkedList<Bird> manyBirds = new LinkedList<>(); // going to call methods which is unique in LinkedList
    manyBirds.add(new Bird("Ricky", null));
    manyBirds.addFirst(new Bird("Jacky", null));
    System.out.println(manyBirds);// [Bird()name= Jacky), Bird()name= Ricky)]
    manyBirds.poll(); // poll()=Remove first.//!poll()absents in parent List, LinkedList has poll() but List does not
    manyBirds.push(new Bird("Tommy", null)); // push()=insert tommy to the first elment //!LinkedList has poll() but List does not
    System.out.println(manyBirds);// [Bird()name= Ricky)]->[Bird()name= Tommy), Bird()name= Ricky)]

    // we use List as type reference, until you want to use specific methods of class

    // List<String> emails = new ArrayList<>();
    // List<String> emails = new LinkedList<>();

LinkedList<Cat> cats = new LinkedList<>();
cats.add(null);
cats.add(null);
cats.add(new Cat("Peter"));
cats.add(new Cat("Jan"));
System.out.println(cats);
cats.removeFirst();//[null, null, Cat(name= Peter), Cat(name= Jan)]
System.out.println(cats);//[null, Cat(name= Peter), Cat(name= Jan)]
cats.removeAll(cats);
System.out.println(cats);//[]


  }
}
