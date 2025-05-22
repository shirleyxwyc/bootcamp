import BankAccount.Dog;

public class DemoPolymorphism {
  


  public static void main(String[] args) {
    // I -> Inheritence (extends)
    // A -> Abstraction (implements)
    // P -> Polymorphism (Parent Class / Interface)
    // E -> Encapsulation (Getter/Setter for private variable)

    Animal a1 = new Dog("Peter");
    // Dog d1 = a1; // why error? type unsafe

    // ! Java compile time: Method readability based on the type of "object reference"
    // a1.bark();-> compile error as a1("object reference") does not have bark() method
    System.out.println(a1.getName()); // Animal.class has getName(), ensures Cat/Dog must contain getName()
    
    // ! Compile-time: Animal has sound(), ensures Cat/Dog has sound() method
    // ! Run-time: Found the object is Dog, so the result "wow wow"
    a1.sound(); // wow ...

    // ! how to elimate the risk? we can use instanceof to check the actual type of object
    if (a1 instanceof Dog) {
      Dog d1 = (Dog) a1; // force converison (downcast) - risky
      //d1.bark(); no bark() in all class
      d1.sound();// wow ...
    } else if (a1 instanceof Cat) {
      Cat c1 = (Cat) a1; // force converison (downcast) - risky
      c1.sound();
    }


     // 2. Interface
     Flyable superman = new Superman("John");
     superman.fly(); // OK, I am flying ...
     // superman.drink(); // NOT OK
     // superman.eat(); // NOT OK
     // superman.sleep(); // NOT OK
 
 
     // Example (Account)
     // Use Polymorphism to create objects
    Account acc1 = new PersonalAccount();
    Account acc2 = new CommercialAccount();

     
    SubAccount subAcc1 = new SavingAccount();
    SubAccount subAcc2 = new CurrentAccount();
    subAcc1.credit(900.0);
    subAcc2.credit(100.0);
    System.out.println(subAcc1.getBalance());//900.0
    System.out.println(subAcc2.getBalance());//100.0

     //NUmber 
//FACT:Long /Integer /double /flow... extends NUmber
Number number =Long.valueOf(3L);
number = Integer.valueOf(10);






}
}
