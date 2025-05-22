public class Cat implements Flyable{
  @Override
public void fly(){
  System.out.println("Cat is flying");
}

  public Cat sleep() {
    System.out.println("Cat is sleeping");//stout is not return,just the footprint, return could be further held bu variable, stout cannot
    return this;
  }

  public Cat eat() {
    System.out.println("Cat is eating");//stout is not return,just the footprint, return could be further held bu variable, stout cannot
    return this;
  }

  public static void main(String[] args) {
    new Cat().sleep().eat();

    
  }
  
}
