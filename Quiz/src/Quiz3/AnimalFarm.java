package Quiz3;

public class AnimalFarm {
  
  public static void main(String[] args) {
    Animal cow= new Cow();
    cow.eat();//OK -[Animal] eating something
    //cow.eat("something");//!compile time error as cow is declared as Animal Class, can only call eat()[parent class method]
  //!eat(), eat("something") different method signature, not able to override

  Animal cow2 = new Animal();
  cow2.eat();//[Animal] eating something
  //cow2.eat("something");//!compile time error as cow is declared as Animal Class, can only call eat()[parent class method]
  }
}
