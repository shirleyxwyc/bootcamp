//Fly
//Eat
//Class Signature
//extends ONLY one parent class, why?
public class Superman extends Human implements Flyable , Living {
//combined contract Living combined Eatable and Sleepable
public Superman(String name){ //有super先可以放个名（）
  super(name);
}

  @Override //!
  public void eat(){
    System.out.println("I am eating...");
  }

  @Override
  public void drink(){
    System.out.println("I am drinking...");
  }
  @Override//!
  public void fly(){
    System.out.println("I am flying...");
  }

  @Override
  public void sleep(){
    System.out.println("I am sleeping...");
  }


  public static void main(String[] args) {
    Superman s1 = new Superman("Peter"); //Class Superman
    System.out.println(s1.getName());

    s1.eat();//I am eating...
    s1.sleep();//I am sleeping...
    s1.drink();//I am flying...
    s1.fly();//I am flying...
    
    Flyable superman = new Superman("John"); //Interface Flyable vs Class Superman, narrow down the object's skill to flyable only
    //superman.eat();//Not OK
    //superman.sleep();//Not OK
    //superman.drink();//Not OK
    superman.fly();// I am flying...

  }
}
