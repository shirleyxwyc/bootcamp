import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DataStructureExercise { //!Outer Class
 private static int number = 10; //!can be accessed by static nested class Student below

  



  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);
    System.out.println(arr);
    arr.remove(Integer.valueOf(30));
    System.out.println(arr);


    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Banana", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Banana");
    fruits.add("Orange");

    System.out.println(fruits.contains("Grape")); // false

    // for (String y : fruits){
    // if (!y.equals("Grape")){
    // fruits.add("Grape");
    // }
    // System.out.println(fruits);
    // }

    fruits.add("Mango");
    System.out.println(fruits);// [Apple, Banana, Banana, Orange, Mango]


    for (int i = 0; i < fruits.size(); i++) {
      if (fruits.get(i).equals("Mango")) {
        fruits.set(i, "Peach");
      }
    }
    System.out.println(fruits);



    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

    ArrayList<Number> orders = new ArrayList<>();
    orders.add(10);
    orders.add(20);
    orders.add(10);
    orders.add(30);
    orders.add(40);
    orders.add(20);
    orders.add(50);
    System.out.println(orders);// [10, 20, 10, 30, 40, 20, 50]

    ArrayList<Number> orderNoDuplicates = new ArrayList<>();
    HashSet<Number> uniNumbers = new HashSet<>();
    for (Number x : orders) {
      if (uniNumbers.add(x)) {
        orderNoDuplicates.add(x);
      }
    }
    System.out.println(orderNoDuplicates);



    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    HashSet<String> countries = new HashSet<>();
    countries.add("USA");
    countries.add("India");
    countries.add("China");
    countries.add("Japan");
    countries.add("Japan");
    countries.add("India");
    System.out.println(countries);// [USA, China, Japan, India]


    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    HashSet<Double> doubles = new HashSet<>();
    doubles.add(Double.valueOf(1.1));
    doubles.add(Double.valueOf(2.2));
    doubles.add(Double.valueOf(3.3));
    doubles.add(Double.valueOf(4.4));
    doubles.add(Double.valueOf(5.5));
    System.out.println(doubles.contains(Double.valueOf(3.3)));// true
    doubles.remove(Double.valueOf(2.2));
    System.out.println(doubles);
    System.out.println("Ex 5- size of the set: " + doubles.size());// Ex 5- size of the set: 4

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet<Integer> integerSets1 = new HashSet<>();
    integerSets1.add(Integer.valueOf(10));
    integerSets1.add(Integer.valueOf(20));
    integerSets1.add(Integer.valueOf(30));
    integerSets1.add(Integer.valueOf(40));

    HashSet<Integer> integerSets2 = new HashSet<>();
    integerSets2.add(Integer.valueOf(30));
    integerSets2.add(Integer.valueOf(40));
    integerSets2.add(Integer.valueOf(50));
    integerSets2.add(Integer.valueOf(60));

    HashSet<Integer> commonSet = new HashSet<>();
    for (Integer x : integerSets1) {
      if (!integerSets2.add(x)) {
        commonSet.add(x);
      }
    }
    System.out.println("Ex 6-commonSet: " + commonSet);// Ex 6-commonSet: [40, 30]


    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    HashSet<String> names =
        new HashSet<>(Set.of("Cherry", "Steve", "Chole", "Jenny", "Vicky"));
    ArrayList<String> convertedArrayList = new ArrayList<>();
    for (String x : names) {
      convertedArrayList.add(x);
    }
    System.out.println("Ex 7-convertedArrayList: " + names);// Ex 7-convertedArrayList: [Chole, Vicky, Cherry, Steve, Jenny]

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));
    for (Student x : students) {
      System.out.println(x);
    }
    // Student(ID = 1, Name= Alice)
    // Student(ID = 2, Name= Bob)
    // Student(ID = 3, Name= Charlie)
    for (Student x : students) {
      if (x.getName().equals("Bob")) {
        students.remove(x);
      }
    }
    System.out.println("8c. Remove the student Bob " + students);
    // 8c. Remove the student Bob [Student(ID = 1, Name= Alice), Student(ID = 3, Name= Charlie)]

    // 8d. Write a static method to search for a student by ID and return their name. If the student is not found,
    // static method should be outside of main method

    String name = searchStudentId(3, students);
    System.out.println("8d. Name of the student ID is " + name);//8d. Name of the student ID is Charlie

    // 8e. Create another ArrayList to store student with name starts with 'A'
    ArrayList<Student> namesA = new ArrayList<>();
    for (Student x : students) {
      if (x.getName().charAt(0) == ('A')) {
        namesA.add(x);
      }
    }
    System.out.println("Ex 8e-student with name starts with 'A': " + namesA); // [Student(ID = 1, Name= Alice)]

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    HashSet<Student> studentSet1 = new HashSet<>();
    studentSet1.add(new Student(1, "Alice"));
    studentSet1.add(new Student(2, "Bob"));
    studentSet1.add(new Student(3, "Charlie"));

    HashSet<Student> studentSet2 = new HashSet<>();
    studentSet2.add(new Student(2, "Bob"));
    studentSet2.add(new Student(3, "Charlie"));
    studentSet2.add(new Student(4, "David"));

    HashSet<Student> commonStudents = new HashSet<>();

    for (Student student : studentSet1) {
      if (studentSet2.contains(student)) {
        commonStudents.add(student);
      }
    }
    System.out.println("Ex9- Common Student :" + commonStudents);

}
//!static method defined within Class Level,must be outside main
  // 8d. Write a static method to search for a student by ID and return their name. If the student is not found,
  // static method should be outside of main method
  // ArrayList<Student> students = new ArrayList<>();
  public static String searchStudentId(int id, ArrayList<Student> students) {
    if (students == null || students.isEmpty()) {
      return "the ArrayList is null.";
    }
    for (Student x : students) {
      if (x.getId() == id) {
        return x.getName();
      }
    }
    return "Student not found.";
  }



  // Static Nested Class Example: static Student Class
  //static Student Class does not have access to instance variables or methods of DataStructureExercise Class(outter class)
  //but can accessible to static variables of Outter Class
  //class Student declared as static, it does not have access to instance variables or methods of Outer Class. It can only access static members of Outer Class.
  public static class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    @Override
    public String toString() {
      return "Student(ID = " + this.id + ", Name= " + this.name + ")";
    }

    public String getName() {
      return this.name;
    }

    public int getId() {
      return this.id;
    }



    public void setName(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (!(obj instanceof Student)) {
        return false;
      }
      Student student = (Student) obj;
      return this.id == student.getId() && this.name.equals(student.getName());
    }

    public int hashCode() {
      return Objects.hash(this.id, this.name);
    }



  }
}


