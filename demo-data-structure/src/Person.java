import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
  private int age;
  private String name;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public String toString() {
    return "Person(Name " + this.name + ", Age " + this.age + ")";
  }

  //public static class SortedByAge implements Comparator<Person> { // Static in own class->自私用
    //@Override
    //public int compare(Person p1, Person p2) {
      // -1->p2 goes first
      // 1->p1 goes first
      // Decending order
      // if same age -> sort by name
     // if (p1.getAge() < p2.getAge()) {
      //  return 1; // p2 goes first (descending order)
     // } else if (p1.getAge() > p2.getAge()) {
    //    return -1; // p1 goes first
    //  } else {
        // Ages are equal, sort by name
     //   return p1.name.compareTo(p2.name); // Ascending order by name
    //  }
   // }


 // }



  public static void main(String[] args) {
    // sort by age, descending order

    List<Person> persons = new ArrayList<>(Arrays.asList(new Person("Peter", 2),
        new Person("Alex", 5), new Person("John", 5), new Person("Steven", 7)));

    Collections.sort(persons, new Person.SortedByAge());
    System.out.println(persons); // decending order
    // [Person(Name Steven, Age 7), Person(Name John, Age 5), Person(Name Peter, Age 2)]

    // age decending order
    // same age -> by name

  }
}
