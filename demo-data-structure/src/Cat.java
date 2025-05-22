import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Cat extends Animal {
  private String name;

  // use equals() to define Cat so that you can remove cat from the ArrayList successfully

  public Cat(String name) {
    this.name = name;
  }
  
   public Cat(String name,LocalDate dob) {
    super(dob);
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }

  //! method signature (polymorphism,static):method name + Arguements->
  //! method signature (Override): Return type + method name + Arguements-> "int compareTo(Cat cat)"different arguement
  //this is not override-> parent->"int compareTo(Animal animal)"
  public int compareTo(Cat cat) {
    if (this.name.length() == cat.getName().length()) {
      return 0;
    }
    return this.name.length() > cat.getName().length() ? 1 : -1;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat cat = (Cat) obj;
    return this.name.equals(cat.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }
  // equals() & hashCode()要1pair寫

  @Override
  public String toString() {
    return "Cat(" + "name= " + this.name
    +", dob=" +super.getDob() //since parent private DOB attribute so child cannot super.dob
    + ")";
  }



  public static void main(String[] args) {


    Cat cat3 = new Cat("Jenny");
    Cat cat4 = new Cat("Steven");


    ArrayList<Cat> catArr = new ArrayList<Cat>();
    catArr.add(new Cat("John"));// The add() method stores a copy of Cat"John" reference to the ArrayList,but it is just temporay reference
    catArr.add(new Cat("Jacky"));
    catArr.add(cat3);
    catArr.add(cat4);
    System.out.println(catArr.size());// 4
    catArr.remove(cat3); // can still remove eventhou there is no overriden of Top Class object's equals()
    // the default remove() for Top Class Object compares object identity (memory addresses).
    catArr.remove(new Cat("John")); // creates a new Cat object in memory. This new object has a different memory address with the one in the ArrayList,default equals() in the remove() return false for the comparison
    System.out.println(catArr.size());// before override of equals() in Cat Class ,John can not be removed->3
    // after override the equals() in Cat Class , John is succesfully removed -->2

    // for fun
    System.out.println(cat3.compareTo(cat4));// -1

    

  }
}
