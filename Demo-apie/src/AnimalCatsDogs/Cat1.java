public class Cat1 {
  private String name;
private int age;

  //Constructor

public Cat1 (String name, int age) {
this.name=name;
this.age=age;
}

//Setter
public void setName (String name) {
  this.name = name;
}
public void setAge (int age) {
  this.age = age;
}
  //Getter

  public String getName () {
    return this.name;
  }

  public int getAge () {
    return this.age;
  }

public boolean equals(Cat cat) {
  return this.name.equals(cat.getName()) && this.age==cat.getAge();
} //!String name should use "equals" not "==", int age(prmitive) can use "=="

  public String toString () {
    return "this cat's name= " + this.name + ", age = " + this.age;
  }
  
  //scanner -->game -->max input 5 cat names in an empty array and check if those name input is same as the cat array created,the game will end once 5 differenct cat names are input
//while(true) loop means 






  public static void main(String[] args) {
    Cat c1 =new Cat("Kitty", 13);
    Cat c2 =new Cat("Peter", 13);

    System.out.println(c1.getAge()); //13
    System.out.println(c1.getName()); //Kitty
    c1.setName("Peter");
    System.out.println(c1.getName());//Peter
    System.out.println(c1.toString()); //this cat's name= Peter, age = 13
    System.out.println(c2.toString()); //this cat's name= Peter, age = 13
    System.out.println(c2==c1);//false->not same reference
    System.out.println(c1.equals(c2));//true
  }
}

}
