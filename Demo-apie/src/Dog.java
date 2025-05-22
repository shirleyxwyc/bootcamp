public class Dog extends Animal { //ｄｏｇ是Ａｎｉｍａｌ的延申 
//Animal private String name; and private int age;  no need to type them
  //private String name;
  //private int age;
//Constructor
public Dog(String name) {
  super(name);
}


@Override
public void sound(){
  System.out.println("wow");
}

public void bark(){
  System.out.println("bark...");
}

@Override  //re-define same object has same name
public boolean equals(Object obj){
if(this==obj)
return true;
if(!(obj instanceof Dog))
return false;
Dog dog =(Dog) obj;
return dog.getName().equals(super.getName());
}//re-define same object has same name //equal() method original belongs to top class Object has been overriden and encapsulated to another meaning

public static void main(String[] args) {
  Dog d1 = new Dog("Steven");
  System.out.println(d1.toString()); // Dog@27716f4
  Dog d2 = new Dog("Lucas");
  System.out.println(d1.equals(d2)); // false
  
}
}
