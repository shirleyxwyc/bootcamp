import java.util.Arrays;

public class Queue {
  // Attribute
  private Person[] persons; // instance variable.

  // Constructor
  // Wrong ->public Person[] (){//!constructor name must match the class name, which is Queue.
  // wrong ->Person[] persons = new Person[0]; //! 'persons' is a local variable not instance variable. use "this.persons" instead
  // !This creates a NEW local variable "persons", NOT the instance variable!

  // Empty Constructor
  public Queue() {
    this.persons = new Person[0];// Initialize an empty array
  }


  // all-argument constructor
  // The Queue should manage an array of Person objects,
  // so the all-argument constructor should take a Person array as a parameter.
  public Queue(Person[] persons) {
    this.persons = persons; // Assign the provided array to the instance variable
  }

  // Setter
  public void setPersons(Person[] persons) {
    this.persons = persons;
  }


  // Getter
  public Person[] getPersons() {
    return this.persons;
  }

  public Person getPerson(int index) {
    return this.persons[index];
  }

  // Method
  public Person getHead() {
    return this.persons[0];
  }

 



  public static void main(String[] args) {
    Queue q1 = new Queue();
    System.out.println(q1.getPersons().length); // 0(empty array)

    // Create a Queue with the all-argument constructor
    // Step 1: create a Person array
    Person[] persons = new Person[] {new Person("John", 1.76, 80.0),
        new Person("Mary", 1.65, 52.5), new Person("Peter", 1.6, 100.0)};

    // Step 2: pass the person array to the constructor;
    Queue q2 = new Queue(persons);
    System.out.println(Arrays.toString(q2.getPersons()));
    // [Name: John Height : 1.76 Weight: 80.0, Name: Mary Height : 1.65 Weight: 52.5, Name: Peter Height : 1.6 Weight: 100.0]

    System.out.println(q2.getPersons().length); // array length =3

    // modify element in the persons array
    persons[0] = new Person("Jason", 1.88, 100.0);

    System.out.println(Arrays.toString(q2.getPersons()));
    // [Name: Jason Height : 1.88 Weight: 100.0, Name: Mary Height : 1.65 Weight: 52.5, Name: Peter Height : 1.6 Weight: 100.0]
    System.out.println(q2.getPersons().length); // array length =3
  
    Person p1 = new Person();
    p1.setName("Danny");
    p1.setHeight(1.76);
    p1.setWeight(74);
    Person p2 = new Person();
    p2.setName("Mari");
    p2.setHeight(1.64);
    p2.setWeight(70);
    Person p3 = new Person();
    p3.setName("Pete");
    p3.setHeight(1.8);
    p3.setWeight(77);

    q2.getPersons()[0] = p1;
    q2.getPersons()[1] = p2; 
    q2.getPersons()[2] = p3;

    System.out.println(Arrays.toString(q2.getPersons()));
    //[Name: Danny Height : 1.76 Weight: 74.0, Name: Mari Height : 1.64 Weight: 70.0, Name: Pete Height : 1.8 Weight: 77.0] 
    System.out.println(q2.getPersons().length); //3

    q2.setPersons(persons);
    System.out.println(q2.getPersons().length); //3

    System.out.println(q2.getHead().getBMI());//23.89
    
    for (int i = 0; i < q2.getPersons().length; i++) {
      System.out.println(q2.getPerson(i).getBMIStatus());
    } //Normal Overweight Normal

  }
}
