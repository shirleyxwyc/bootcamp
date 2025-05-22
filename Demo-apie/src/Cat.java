public class Cat extends Animal {
//must inherit attributes of parent "Animal", inherit Animal's String name here
//private String name; 
private int age; //

  //Constructor

public Cat(String name, int age) {
    // super (parent)
    super(name); // calling parent class's constructor
    this.age = age;
  }


public int getAge () {
  return this.age;
}

  //Getter-is inherited from Animal
  //public String getName () {
    //return this.name;
  //}

//Setter
//public void setName (String name) {
  //this.name = name;
//}

public void setAge (int age) {
  this.age = age;
}

// ! inherit all instance method: getName()
public String getName() {
  return super.getName();
}

@Override
public String toString(){
  return "Cat("
  +"name= " +super.getName() 
  +", age=" +this.age
  +")";
}

}

