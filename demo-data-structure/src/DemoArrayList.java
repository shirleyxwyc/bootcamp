import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class DemoArrayList {


  public static void main(String[] args) {
    // Store a set of interger
    int[] arr = new int[] {-4, -10, 100, 55};
    // !int[] can not store non-int values

    // auto-box
    // long -> Long (Number)
    // byte -> Byte (Number)

    Number[] numbers = new Number[] {3L, (byte) 5};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    } // 3 5

    Object[] objects = new Object[] {new Cat("Peter"), 4L, (byte) 10};



    // !Disadvantage of int[]
    // 1) fixed length

    // Array is the most underlying最底层 data structure
    // ArrayList is a higher level data structure for storing a set of values
    // For users, you don't know it is made by array

    // ArrayList
    // 1. variable length
    // <not ok for primitives>
    ArrayList<Integer> integers = new ArrayList<Integer>();
    integers.add(10); // adding element1,auto-box from int to Integer
    integers.add(100);// adding element2
    integers.add(-3); // adding element3
    System.out.println(integers.size());// 3 -> asking for the array length

    // add() vs size()
    // add() -> new array process, copy array
    // size() -> array length

    // ArrayList of LocalDate
    LocalDate[] dates = new LocalDate[3];

    ArrayList<LocalDate> dates2 = new ArrayList<LocalDate>();
    dates2.add(LocalDate.of(2014, 1, 1));
    dates2.add(LocalDate.of(2025, 10, 1)); // object 1
    System.out.println(dates2.size());// 2

    // how to remove element?
    // !remove()
    // 1.for loop
    // 2.Use LocalDate's equals() ->same year&&month&& day->that's what the Author of LocalDate decided
    dates2.remove(LocalDate.of(2025, 10, 1));// object 2
    // The LocalDate class overrides the equals() method.
    // Two LocalDate objects are considered equal if they represent the same date (same year, month, and day).
    // The remove() method finds a match and removes the FIRST matching element from the list.
    // It doesn't matter that they are different objects in memory; their content is the same.

    // calling String's equals()->same String
    ArrayList<String> names = new ArrayList<String>();
    names.add("John");
    names.add("Peter");
    System.out.println(names.remove("Jenny"));// false
    System.out.println(names.remove("John"));// true
    // The String class overrides the equals() method of Top Class Object,i.e. to compare the content of the strings rather than their memory addresses (identity).
    // Two String objects are considered equal if they have the same sequence of characters.
    // The overriden remove() method successfully removes the first matching element from the list.
    names.add(new String("Sally"));

    // ! so, at this moment, you should understand why equals() is important

    ArrayList<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat("John"));
    cats.add(new Cat("John"));
    cats.add(new Cat("Jacky"));
    System.out.println(cats.size());// 3

    cats.remove(new Cat("John"));// remove the FIRST "John" ONLY
    // The remove() method finds a match and removes the FIRST matching element from the list and break the loop of the ArrayList.
    System.out.println(cats.size());// 2

    // !although the equals() method of Top Class Object was overriden, the Object

    // !Able to remove, because BigDecimal Class equals() is working
    ArrayList<BigDecimal> decimals = new ArrayList<BigDecimal>();
    decimals.add(BigDecimal.valueOf(3.5));
    decimals.add(BigDecimal.valueOf(4.7));
    decimals.remove(new BigDecimal("3.5"));
    System.out.println(decimals.size());// 1

    // !Able to remove, because Double Class equals() is working
    ArrayList<Double> doubles = new ArrayList<Double>(); // doubles is a reference stores point to new ArrayList Object address
    doubles.add(3.5);
    doubles.add(4.7);
    doubles.remove(Double.valueOf(4.7));
    System.out.println(doubles.size());// 1

    Double d1 = 3.9;
    Double d2 = 3.9;
    System.out.println(d1.equals(d2)); // true
    System.out.println(d1.compareTo(d2)); // 0

    ArrayList<Double> newDoubles = new ArrayList<Double>();
    newDoubles.add(10.9);
    newDoubles.add(4.1);
    newDoubles.add(8.8);
    doubles.addAll(newDoubles);
    System.out.println("doubles's size= "+ doubles.size());// doubles's size= 4

    // ArrayList Method: contains(),
    System.out.println(doubles.contains(10.9)); // true
    System.out.println(doubles.isEmpty());// false
    System.out.println(doubles.get(0));// 10.9 -> get index 0 in the array
    doubles.set(0, 9.9);
    System.out.println(doubles.get(0));// 9.9
    doubles.clear(); // !clear all elements //assign 0 size array -> new Double[0] ,doubles is pointing a 0 size array
    System.out.println(doubles.size());// 0

    // ! clear() vs null
    // doubles is pointing nothing
    //doubles = null;


    // for each loop
    // loop all element of x
    for (Double x : doubles) {
      System.out.println(x);
    } // 4.2 10.9 4.1 8.8

    for (int i = 0; i < doubles.size(); i++) {
      System.out.println(doubles.get(i));
    } // 4.2 10.9 4.1 8.8

    int[] arr2 = new int[] {3, -1, 100};
    // for each loop
    // loop all element of x
    for (int x : arr2) {
      System.out.println(x);
    } // 3,-1,100

    // !for each loop (Array or ArrayList)

    // basic for loop(advantage)->Access 2 elements in one iteration
    for (int i = 0; i < arr2.length - 1; i++) {
      System.out.println(arr2[i]);// ->element 1:-1
      System.out.println(arr2[i + 1]); // ->element 2:100
    }

    // ArrayList methods
    // read-> get(index)-> no for loop, arr[0]=ox123 arr[1]=ox123+1 contains()->is a for loop underlying, isEmpty()
    // write/modify->clear(), [set(), add(), remove() ] ->add array？



  }
}
