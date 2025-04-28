import java.math.BigDecimal;
import java.time.LocalDate;

public class Week2Recap {

//!1. Attributes
private double salary;
private String name;
private int age;

//!2. Setter
public void setSalary (double salary) {
  this.salary = salary;
}

public void setAge(int age) {
  this.age = age;
}

public void setName (String name) {
  this.name = name;
} 

//!3.Getter
public double getSalary (){
  return this.salary;
}
public String getName () {
  return this.name;
}

public int getAge() {
  return this.age;
}

//!compareTo
//compare two objects of the same class
//can not compare primitive types
//to determine their ordering (which comes before, after, or if they are equal).
//Returns -ve integer if "this object" is < the specified object
//Returns 0 if objects are equal.
//Returns  +ve integer if "this object" is > the specified object

//!Creating Presentation Method - compareTo:
public int compareTo(Week2Recap week2Recap) { //!comparing 2 Week2Recap
  if(this.age == week2Recap.getAge()) {
    return 0;
  }else if (this.age > week2Recap.getAge()){
    return 1;
  }else{
    return -1;
  }
}



  public static void main(String[] args) {

     // 8 Primitives, String
    // BigDecimal
    // LocalDate

    // Store a set of same type of values -> array
    LocalDate[] dates = new LocalDate[3];
    BigDecimal[] numbers = new BigDecimal[4];

    // Wrapper Class
    // Integer, Short, Long, Byte
    // Double, Float
    // Character
    // Boolean
    // autobox (from primitive to Wrapper), unbox (from Wrapper Class to Primitive)

    // Primitives - Upcast, Downcast
    // byte -> short -> int -> long -> float -> double
    // char -> int
    int k = 3;
    long x = k; // upcast

    // During compile time, "unsafe" on type conversion -> Explicit Conversion
    // During runtime, JVM find 4L is safe for this conversion
    int h = (int) 4L;

    // overflow
    byte b = (byte) 138L;
    System.out.println(b); // -118

    // Math (pow, round, sqrt, max, min)
    // BigDecimal (add, subtract, multiply, divide)

    // String
    String s1 = "hello"; // Assign the object address of "hello" object into s1.

    // When you use "new" to create object, Java always create a new one for you.
    String s2 = new String("hello");

    // When you use doule quote to create String object, Java checks if the "hello" object exits
    // So, in this case, Java assign the same object address of s1 into s3.
    String s3 = "hello";

    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.equals(s3)); // true

    System.out.println(s1 == s2); // false, s2 was newly created,so different object address"==" checks if they are with same object address
    System.out.println(s2 == s3); // false,s2 was newly created,so different object address
    System.out.println("check if s2 and s3 have same content: "+s2.equals(s3));
    System.out.println(s1 == s3); // true s1 and s3 have 2 same addresses due to same value stored in pool String
    System.out.println("check if s1 and s3 have same content: "+s1.equals(s3));

    // The above theory applies to all Objects
    BigDecimal bd1 = BigDecimal.valueOf(3);
    BigDecimal bd2 = BigDecimal.valueOf(3);
    System.out.println(bd1 == bd2); // true, 

    BigDecimal bd3 = new BigDecimal("3");
    System.out.println(bd1 == bd3); // false, created new object bd3 so the 2 references of bd1 and bd3 must be different

    BigDecimal johnSalary = BigDecimal.valueOf(21000);
    BigDecimal marySalary = BigDecimal.valueOf(21000);

    // ! Object methods always check the value itself
    // Primitives always use "==" to check if they are with same value
    if (johnSalary.compareTo(marySalary) == 0) { // if they are having same salary
      System.out.println("they are having same salary.");
    }

    // LocalDate (try yourself)
    // equals, compareTo
    System.out.println(LocalDate.of(2024, 1, 1).compareTo(LocalDate.of(2024, 1, 1))); // 0
    System.out.println(BigDecimal.valueOf(4.4).compareTo(BigDecimal.valueOf(4.4))); // 0
    System.out.println(Integer.valueOf(3).compareTo(Integer.valueOf(3))); // 0
    System.out.println(String.valueOf("abc").compareTo(String.valueOf("abc"))); // 0

    Week2Recap w1 = new Week2Recap();
    Week2Recap w2 = new Week2Recap();

    w1.setName("John");
    System.out.println(w1.getName());

    w1.setSalary(30000);
    System.out.println(w1.getSalary());
    w1.setAge(12);
    w2.setAge(14);
    
    System.out.println(w1==w2);//false ,2 objects and 2 address references
    System.out.println(w1.getAge()==(w2.getAge()));//false , 2 objects have different ages(12 and 14)
    
    System.out.println(w1.compareTo(w2));//-1 
    //!w1 and w2 can not compare directly. each of them has 3 attributes(salart, name and age)
    //!let say we want to compare if w1 and w2 have same age,we need to set presentation method first
    //!need to create "compareTo" Presentation Method first -> public int compareTo(Week2Recap week2Recap)

System.out.println(String.valueOf("abc"));//abc

System.out.println(String.valueOf(123));//123

System.out.println(Character.valueOf('a'));//Returns a Character object from char




}
  
}
