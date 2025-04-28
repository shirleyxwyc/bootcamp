// ! One to One: One Person has one height and one weight
// ! One to Many:One classroom to many students

import java.util.Arrays;

public class Classroom {
  // 1.Attributes
  // e.g. Arrays of student names

  private String[] names; // declaring a variable "names" stores a "reference" to a String array,(initially [ "null", "null", "null", "null", "null" ] (the array object)).
  private String[] tutors;

  // 2. Setter
  public void setNames(String[] names) {
    this.names = names; // !"this.names" is a reference to a String array object (not a single String object).
  }

  // 3.Getter
  public String[] getNames() { //!String[] is the type declared.so "getNames()" is a String array object and () need to be empty
    return this.names; // !returns a reference to the String array object.
  }



  public static void main(String[] args) {
    Classroom c1 = new Classroom(); // Declare a variable named c1 that can hold a reference to a Classroom object, create a new Classroom object and assign its reference to c1.
    // John Mary
    // create a new String array object with array of 2 empty boxes storing String [null,null]
    String[] students = new String[2];
    // assign "John" and "Mary" to the 2 boxes of new String array object called students ["John","Mary"]
    students[0] = "John";
    students[1] = "Mary";

    // !c1.setNames(students[0]); error,students[0]in the () is a String object

    c1.setNames(students); // students in the () is the String array
    System.out.println(c1.getNames()[0]); // John //c1.getNames() is the String array

    // for loop, print all student names in the classroom
    for (int i = 0; i < students.length; i++) {
      System.out.println(c1.getNames()[i]); // same as System.out.println(students[i]);
    } // John Mary

    // Find Mary, and replace by Steven.
    // Approach 1: using if
    for (int i = 0; i < c1.getNames().length; i++) { // same as i<students.length
      if (c1.getNames()[i].equals("Mary")) {
        c1.getNames()[i] = "Steven";
        break; //!place break inside the if block to ensure the loop continues until "Mary" is found and replaced.
      }
      //!if "break;" is placed here(outside if) ,the loop ran only once (i=0), checked "John" (not "Mary"), then break ended the loop.
    }
    System.out.println(Arrays.toString(c1.getNames()));//[John, Steven]
    System.out.println(Arrays.toString(students));// [John, Steven]



    // Approach 2: using the .replace method
    // for(int i=0; i<c1.getNames().length;i++) {
    // c1.getNames()[i] = c1.getNames()[i].replace("Mary", "Steven");
    // System.out.println(c1.getNames()[i]);
    // }// [John, Steven]



  }
}
