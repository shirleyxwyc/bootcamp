import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Comparable<Animal> {
  private LocalDate dob;

  public Animal() {} // write explicitly, otherwise child's constructor will have compile error

  public Animal(LocalDate dob) {
    this.dob = dob;
  }

  public LocalDate getDob() {
    return this.dob;
  }

  @Override
    public int compareTo(Animal animal) 
  return this.dob.isAfter(animal.getDob()) ? -1:1;
}

  public static void main(String[] args) {
    Cat c1 = new Cat("John", LocalDate.of(2024, 6, 5));
    Cat c2 = new Cat("Peter", LocalDate.of(2024, 7, 5));
    Cat c3 = new Cat("Lucas", LocalDate.of(2024, 6, 30));
    List<Cat> cats = new ArrayList<>();


    // .sort-> call compareTo (underlying)compile time need to guaranteer "implements Comparable<Animal>" has been input

  }
}
