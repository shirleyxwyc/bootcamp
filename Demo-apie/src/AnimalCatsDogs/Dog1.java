public class Dog1 {
  
public static void main(String[] args) {
  Dog d1=new Dog();
  System.out.println(d1.toString());//Dog@5caf905d
  Dog d2=new Dog();
  System.out.println(d2.toString());//Dog@27716f4
  System.out.println(d1.equals(d2));//false
  //at this moment d1 and d2 are always 2 different with different reference as d1 and d2 have no attribute yet
}//so you need to write equals to define what is a dog and toString in the Class Dog  

}
