public interface Flyable {

void fly();  
public static void main(String[] args) {
  Flyable superman = new Superman("John");
  superman.fly();
  //superman.drink(); not ok
  


}

  
}
