
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExercise {
  public static void main(String[] args) {

    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]
    List<Integer> squareList = numbers.stream().filter(even -> (even % 2 == 0))
        .map(even -> even * even).collect(Collectors.toList());
    System.out.println(squareList);// [4, 16, 36, 64, 100]

    Comparator<Integer> descending = (i1, i2) -> i1.compareTo(i2) > 0 ? -1 : 1;
    squareList.stream().sorted(descending).forEach(n -> System.out.println(n));


    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    //// Output: [Alice, Annie, Alex]
    List<String> newNames = names.stream().filter(name -> name.startsWith("A"))
        .collect(Collectors.toList());

    System.out.println(newNames);// [Alice, Annie, Alex]

    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5



    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)

    List<Integer> lengths =
        words.stream().map(word -> Integer.valueOf(word.length()))
            .collect(Collectors.toList());
    System.out.println(lengths); // [5, 6, 4]

    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words1 =
        Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
    List<String> lengths3 = words1.stream().filter(word -> word.length() > 3)
        .collect(Collectors.toList());
    System.out.println("Q5 size = " + lengths3.size()); // Q5 size = 4

    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // // Output: [15, 20]
    List<Integer> newSet =
        numbers3.stream().filter(n -> n > 10).collect(Collectors.toList());
    System.out.println("Q6 " + newSet); // Q6 [15, 20]

    // 7. Mapping to a Map (Key-Value Pairs)-use groupby
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.
    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)

    // Output: {Alice=85, Bob=75}
    Map<String, Integer> studentsMap = new HashMap<>();
    studentsMap.put("Alice", 85);
    studentsMap.put("Bob", 75);

    System.out.println(studentsMap);// {Bob=75, Alice=85}

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)

    // Output: [John, Jane]

    List<Employee> employees =
        new ArrayList<>(List.of(new Employee("John", 65000),
            new Employee("Jane", 55000), new Employee("Doe", 40000)));

    List<Employee> salaryFilter = employees.stream()
        .filter(e -> e.getSalary() > 50000).collect(Collectors.toList());
    System.out.println("Q8a " + salaryFilter);// Q8a [Employee(Name= John, Salary= 65000), Employee(Name= Jane, Salary= 55000)]

    List<String> employeeNames = salaryFilter.stream()
        .map(name -> name.getName()).collect(Collectors.toList());
    System.out.println("Q8b " + employeeNames);// Q8b [John, Jane]

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)

    // // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    List<Person> persons = new ArrayList<>(List.of(new Person(30, "Alice"),
        new Person(25, "Bob"), new Person(30, "Charlie")));

    Map<Integer, List<String>> ageMap =
        persons.stream().collect(Collectors.groupingBy(p -> p.getAge(),
            Collectors.mapping(p -> p.getName(), Collectors.toList())));
    System.out.println("Q9 " + ageMap);
    // Q9 {25=[Bob], 30=[Alice, Charlie]}

    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)

    // // Output: {false=[Alice], true=[Bob, Charlie]} (Map)


    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.
    // Output: [30, 40, 60]
    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    List<Integer> resultsList = numbers4.stream().filter(num -> num > 10)
        .map(num -> num * 2).collect(Collectors.toList());
    System.out.println("Q11 " + resultsList);// Q11 [30, 40, 60]

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.
    List<String> names5 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]
    List<Person> persons2 =
        names5.stream().map(person -> new Person(defaultAge, person))
            .collect(Collectors.toList());

    System.out.println("Q12" + persons2);
    // Q12[Person(Name=Alice, Age= 30), Person(Name=Bob, Age= 30), Person(Name=Charlie, Age= 30)]

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    // List<String> words = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)


    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]

    List<Integer> numbers7 =
        numbers6.stream().map(n -> n * n).collect(Collectors.toList());
    System.out.println(numbers7);// [1, 4, 9, 16]

    int[] intArray = numbers7.stream().mapToInt(n -> n).toArray();
    System.out.println(intArray.toString());

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)

    // Output: 22

    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    List<String> workers = new ArrayList<>(List.of(
      new Worker("Alice", "HR"), 
      new Worker("Bob", "IT"),
      new Worker("Charlie", "HR"), 
      new Worker("David", "IT")
      ));



  }

  public static class Worker {
    private String name;
    private String department;

    public Worker(String name, String department) {
      this.name = name;
      this.department = department;
    }

    public String getName() {
      return this.name;
    }

    public String getDepartment() {
      return this.department;
    }

    @Override
    public String toString() {
      return "Worker(Name= " + this.name + ", Department= " + this.department
          + ")";
    }

  }


  public static class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
      this.name = name;
      this.score = score;
    }
  }

  public static class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
      this.name = name;
      this.salary = salary;
    }

    public int getSalary() {
      return this.salary;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Employee(Name= " + this.name + ", Salary= " + this.salary + ")";
    }
  }

  public static class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
      this.age = age;
      this.name = name;
    }


    public int getAge() {
      return this.age;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Person(Name=" + this.name + ", Age= " + this.age + ")";
    }
  }

}


