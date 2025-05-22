import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoStream {



  public static void main(String[] args) {
    List<String> names =
        new ArrayList<>(Arrays.asList("John", "Peter", "Jenny"));
    names.forEach(name -> {
      System.out.println(name);
    });// John Peter Jenny


    names.forEach(name -> {
      if (name.charAt(0) == 'J') { // same as if (name.startsWith("J")){
        System.out.println(name);
      }
    });// John Jenny

    // or get the same result using Stream function
    // ! ***important***
    // !java 8 Stream -1) filter (can write && || condition)
    // filter(): a method that processes a stream and returns a new stream
    // containing ONLY the elements that satisfy the specified boolean condition.

    // Case1
    names.stream().filter(name -> name.startsWith("J"))
        .forEach(name -> System.out.println(name)); // John Jenny

    // Case 2
    names.stream().filter(name -> name.startsWith("J") && name.endsWith("y")
        || name.length() == 5).forEach(name -> System.out.println(name)); // Peter Jenny

    // !java 8 Stream -2) map()
    // map() transforms element in the stream into a new format and produces a new stream containing the transformed elements.
    names.stream()
        .filter(name -> name.startsWith("J") && name.endsWith("y")
            || name.length() == 5) // filter out Peter Jenny
        .map(name -> new Child(name)) // turn String Peter Jenny to child
        .forEach(child -> {
          System.out.println("map" + child.getName()); // Peter Jenny test: if Peter Jenny were printed -> turn to Child obj successfuly
        });

    // !collect()
    // ! a terminal operation that transforms the elements of the stream into a desired form.
    List<Child> childs = names.stream()
        .filter(name -> name.startsWith("J") && name.endsWith("y")
            || name.length() == 5) // Peter Jenny
        .map(name -> new Child(name)) // turn String Peter Jenny to child
        .collect(Collectors.toList());// turn List<Child> ie, List<String> to List<Child>

    // .collect(Collectors.toList());: Collects elements into a List.
    // .collect(Collectors.toSet());: Collects elements into a Set.
    // .collect(Collectors.toMap());: Collects elements into a Map.
    // .collect(Collectors.joining());: Concatenates elements into a single String.

    List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 7, -1, 100));
    List<Integer> newNumbers = numbers.stream() // turn List<Integer> to stream of <Integer> ie, Stream<Integer> integers = numbers.stream();
        .filter(number -> (number % 2 == 0) && number > 6)
        .map(number -> number * number).collect(Collectors.toList());
    System.out.println(newNumbers);// [10000]

    List<Integer> newNumbers2 = numbers.stream().map(n -> {
      if (n % 2 == 0) {
        return n * n;
      }
      return n;
    }).collect(Collectors.toList());
    System.out.println(newNumbers2);// [4, 16, 7, -1, 10000]


    // ! loop + if + break
    // ! findAny() :a method returns an Optional that may contain a value from the stream.
    // ! Optional is a class, name is Optional object which may store null or non null valuie
    // isPresent(): Checks for the presence of a value in an Optional.,Returns a boolean
    // contains(): Checks for the presence of an element in a collection.can not use with Optional

    Optional<String> name =
        names.stream().filter(n -> n.startsWith("J")).findAny();
    if (name.isPresent()) {// true if non-null
      System.out.println("there is a name starts with J: " + name.get());
    } else {
      System.out.println("there is no name starts with J"); // there is a name starts with J: John
    }
    System.out.println(name);// Optional[John]

    // Ascending ordering by default for .sorted()
    names.stream().sorted().forEach(n -> System.out.println(n));// Jenny John Peter

    // Decending order
    // Comparator source code: @FunctionalInterface public interface Comparator<T> int compare(T o1, T o2);
    Comparator<String> sortedByDecending =
        (s1, s2) -> s1.compareTo(s2) > 0 ? -1 : 1;
    names.stream()//
        .sorted(sortedByDecending)//
        .forEach(n -> System.out.println(n));// Peter John Jenny

    // 8,9,2,-5,100,10000,-300,11
    // filter odd number-> square-> value>80-> sorted ->print out
    List<Integer> numbers10 =
        new ArrayList<>(Arrays.asList(8, 9, 2, -5, 100, 10000, -300, 11));
    numbers10.stream()//
        .filter(odd -> (odd % 2 == 1)).map(odd -> odd * odd)
        .filter(squared -> (squared > 80)).sorted()
        .forEach(value -> System.out.println(value)); // 81 121

    // List<Double> radius = 3.5, 4.5, 1.5
    // BigDecimal
    // List<Ball>

    List<Double> radiusList = new ArrayList<>(Arrays.asList(3.5, 4.5, 1.5));
    List<Double> areaList = radiusList.stream()
        .map(radius -> BigDecimal.valueOf(radius)
            .multiply(BigDecimal.valueOf(radius))
            .multiply(BigDecimal.valueOf(Math.PI)).doubleValue())
        .collect(Collectors.toList());
    System.out.println("areaList " + areaList); // [38.48451000647496, 63.61725123519331, 7.0685834705770345]



    // default RED color
    // List<Integer>->8,9,4,1
    // Decending order
    // List<Ball>

    List<Integer> integers3 = new ArrayList<>(Arrays.asList(8, 9, 4, 1));

    Comparator<Integer> descending = (i1, i2) -> i1.compareTo(i2) > 0 ? -1 : 1;
    List<Ball> balls = integers3.stream().sorted(descending)
        .map(num -> new Ball(Ball.Color.RED, num)).collect(Collectors.toList());
    System.out.println("List<Ball>" + balls);
    // [Ball(Color: RED Number: 9, Ball(Color: RED Number: 8, Ball(Color: RED Number: 4, Ball(Color: RED Number: 1]


    // !Counting
    List<String> nameList = new ArrayList<>();
    nameList.add("Peter");
    nameList.add("John");
    nameList.add("John");
    long countJohn = nameList.stream().filter(e -> e.equals("John")).count(); // 3

    // !distinct-> return a new list contains unique elements
    nameList.add("Mary");
    nameList.add("Peter");
    System.out.println(nameList.stream().distinct().count());// 3
    System.out
        .println(nameList.stream().distinct().collect(Collectors.toList()));// [Peter, John, Mary]

    // ! stream() and map() can not add elements-> filter() just decrease number of element


    // !flatMap (.stream() inside .flatMap())
    // flatMap() combines multiple streams into a single stream
    List<Ball> ballList1 = new ArrayList<>(Arrays
        .asList(new Ball(Ball.Color.RED, 1), new Ball(Ball.Color.BLUE, 2)));
    Box box1 = new Box(ballList1);
    System.out.println("ballList1: " + ballList1);

    List<Ball> ballList2 = new ArrayList<>(Arrays
        .asList(new Ball(Ball.Color.RED, 3), new Ball(Ball.Color.BLUE, 4)));
    Box box2 = new Box(ballList2);
    System.out.println("ballList2: " + ballList2);

    List<Box> boxList = new ArrayList<>();
    boxList.add(box1);
    boxList.add(box2);
    System.out.println("boxList: " + boxList);
    // boxList: [List<Ball> ([Ball(Color: RED Number: 1, Ball(Color: BLUE Number: 2]),
    // List<Ball> ([Ball(Color: RED Number: 3, Ball(Color: BLUE Number: 4])]

    // !Approach 1: using flatMap()
    List<Ball> combinedBallList = boxList.stream()
        .flatMap(box -> box.getBalls().stream()).collect(Collectors.toList());
    System.out.println("By flatMap() :" + combinedBallList);
    // By flatMap() :[Ball(Color: RED Number: 1, Ball(Color: BLUE Number: 2,
    // Ball(Color: RED Number: 3, Ball(Color: BLUE Number: 4]

    // ! or Approach 2: using for-each loop
    List<Ball> combinedBallList2 = new ArrayList<>();
    for (Box box : boxList) {
      combinedBallList2.addAll(box.getBalls());
    }
    System.out.println("By for each loop :" + combinedBallList2);
    // By for each loop :[Ball(Color: RED Number: 1, Ball(Color: BLUE Number: 2,
    // Ball(Color: RED Number: 3, Ball(Color: BLUE Number: 4]

    // from ArrayList to Map (group to count, max, min, sum, average)
    // ! groupingBy()唔知有幾多groups -> Map
    // ! summingInt()
    // collect(Collectors.groupingBy
    // collect(Collectors.summingInt
    // collect(Collectors.minBy
    // collect(Collectors.maxBy
    //Collectors.mapping
    // Map
    List<Staff> staffs =
        new ArrayList<>(List.of(new Staff("IT", 35000), new Staff("HR", 18000),
            new Staff("IT", 25000), new Staff("HR", 28000)));

    Map<String, List<Staff>> departmentMap =
        staffs.stream().collect(Collectors.groupingBy(s -> s.getDepartment())); // groupingBy department
    System.out.println(departmentMap);
    // {HR=[Staff(department= HR, salary= 18000), Staff(department= HR, salary= 28000)],
    // IT=[Staff(department= IT, salary= 35000), Staff(department= IT, salary= 25000)]}


    // !summingInt()
    Map<String, Integer> salaryMap =
        staffs.stream().collect(Collectors.groupingBy(s -> s.getDepartment(),
            Collectors.summingInt(s -> s.getSalary())));
    System.out.println(salaryMap);// {HR=46000, IT=60000}


    // !minby() maxby()-> need Comparator
    // minBy(Comparator) maxBy(Comparator)
    // return an Optional containing the minimum or maximum element
    Map<String, Optional<Staff>> salaryMap2 = staffs.stream()
        .collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors
            .maxBy((s1, s2) -> s1.getSalary() > s2.getSalary() ? 1 : -1)));
    Optional<Staff> highestSalaryIT = salaryMap2.get("IT");
    System.out.println(highestSalaryIT.get()); // Staff(department=IT,salary=35000)
    // .....


    Map<String, Optional<Staff>> salaryMap3 = staffs.stream()
        .collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors
            .minBy((s1, s2) -> s1.getSalary() < s2.getSalary() ? -1 : 1)));
            Optional<Staff> lowestSalaryIT=salaryMap3.get("IT");
            System.out.println(lowestSalaryIT.get());//Staff(department= IT, salary= 25000)



    // partitioningBy() : Map<Boolean, List<T>>divides into 2 categories
    Map<Boolean, List<Staff>> salarypartition = staffs.stream()
        .collect(Collectors.partitioningBy(s -> s.getSalary() > 20000));
    System.out.println(salarypartition.get(true)); // [Staff(department= IT, salary= 35000), Staff(department= IT, salary= 25000), Staff(department= HR, salary= 28000)]
    System.out.println(salarypartition.get(false));// [Staff(department= HR, salary= 18000)]

  
    // ! reduce()

  //!Array of String -> ArrayList (Use Arrays.asList)--> Stream
       String[]strings =new String[]{"abc","def"};
   Arrays.asList(strings).stream().filter(e->e.startsWith("a")).count();
   System.out.println(strings);

   //IntStream -> OptionalDouble / OptionalInt
   //...

   //!int array/primitive array to List<Integer> .boxed()->autobox



  }

  public static class Staff {
    private String department;
    private int salary;

    public Staff(String department, int salary) {
      this.department = department;
      this.salary = salary;
    }

    public String getDepartment() {
      return this.department;
    }

    public int getSalary() {
      return this.salary;
    }


    @Override
    public String toString() {
      return "Staff(" + "department= " + this.department + ", salary= "
          + this.salary + ")";
    }

  }

}
