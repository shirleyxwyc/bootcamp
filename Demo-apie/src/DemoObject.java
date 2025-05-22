public class DemoObject {
  public static void main(String[] args) {
    
 
  Animal a1 = new Cat ("John",1);
//Animal is a parent class

//the top parent class -> object.java (Concrete Class-> can new Object())
Object o1 = new Cat("Peter", 2); 
//o1.eat();
//methods that top parent class Object has by default?
//equals()->same memory address
//Cat inherits Object's equals()
Object o2= new Cat("Peter", 2); 
System.out.println(o1.equals(o2));//false Cat didn't override 

//Dog overrides the meaning of Object-> same name not meaning same memory address anymore but becoz you re-define same object has same name
Object o3 = new Dog("ABC");
Object o4 = new Dog("ABC");
System.out.println(o3.equals(o4));//was true before object equals() was overriden -> //false (Object equals() was overriden in Class dog)
System.out.println(o3.equals(new Dog("ABC")));//true 
//When you use if to check they are same object in your system/world
//see Class Dog->re-define same object has same name //equal() method original belongs to top class Object has been overriden and encapsulated to another meaning
if(o3.equals(new Dog("ABC"))){

}
//toString() Object (Topclass orginally output address, now i override toString()method in Class cat)
Cat c1 =new Cat("Mary",2);
System.out.println(c1.toString());//Cat(name= Mary, age=2)

//! No overriden Object 's toString() in Class Dog 
Dog d1 =new Dog("Tommy");
System.out.println(d1.toString());//Dog@eed1f14(Object Reference)

//hashCode() return int value
Object d3 = new Dog("Joker");
System.out.println(d3.hashCode());//1915318863 (before overriding Object's hashCode()method)
Object d4 = new Dog("Joker");
System.out.println(d4.hashCode());//1283928880 different to d3 becoz different object-before overriding Object's hashCode()method

//!The defination of hashCode MUST BE same as equals()
Citizen c10 =new Citizen("John", "A1234");
Citizen c11 =new Citizen("Peter", "A1234");
Citizen c12 =new Citizen("John", "B1234");
System.out.println(c10.equals(c11));//true becoz I created new citizen constructor and override the object's original equals() to same hkid only
System.out.println(c11.equals(c12)); //false
System.out.println(c10.hashCode());//61538338 overriden the object's original equals() to same hkid has same hashCode(see Class Citizen)
System.out.println(c11.hashCode());//61538338 overriden the object's original equals() to same hkid has same hashCode(see Class Citizen)
System.out.println(c12.hashCode());//62461859




}
}
