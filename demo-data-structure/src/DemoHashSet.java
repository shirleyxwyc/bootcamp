import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {

  public static void main(String[] args) {
    
    // A set of String
    // ! Difference between ArrayList and HashSet
    // 1. ArrayList has ordering, while HashSet has not
    // 2. HashSet avoid duplciate elements, while ArrayList is able to store duplicated elements

    HashSet<String> strings = new HashSet<>();
    // add() return boolean but Java allows "bypass" the return value
    strings.add("abc");
    strings.add("def");

    System.out.println(strings.size());// 2

    System.out.println(strings.add("ijk"));// true
    System.out.println(strings.size());// 3

    // !because "def" already exists in strings Hashset,
    // !we CANNOT add a duplicate object into Hastset.

    System.out.println(strings.add("def")); // false
    System.out.println(strings.add("def")); // false
    System.out.println(strings.size()); // 3

    // ! HashSet has most of the methods of ArrayList
    strings.remove("ijk");
    strings.isEmpty();
    strings.contains("abc");
    // strings.clear();

    ArrayList<String> names = new ArrayList<String>();
    names.add("John");
    names.add("Peter");
    names.add("John");
    System.out.println(names.size()); // 3

    // !ways to remove duplicate objects-for each loop ArrayList names and then add to new HashSet uniqueNames
    HashSet<String> uniqueNames = new HashSet<>();
    for (String name : names) {
      uniqueNames.add(name);
    }
    // HashSet's author handles toString()
    System.out.println(uniqueNames); // [John, Peter]


    ArrayList<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat("Jennie"));
    cats.add(new Cat("Vincent"));
    cats.add(new Cat("Lucas"));
    cats.add(new Cat("Jennie"));
    System.out.println(cats);//[Cat(name= Jennie), Cat(name= Vincent), Cat(name= Lucas), Cat(name= Jennie)]

    // System.out.println(cats.size()); //4
    // for(Cat cat : cats){
    // System.out.println(cats); //why not printing String names? but 4 hashCode? 
    //!becoz i haven't Override toString() in Class Cat

    // HashSet
    // add()-> equals()->duplicate
    // true/false

     // HashSet
     HashSet<Cat> uniqueCats = new HashSet<>();
     // add() -> equals() -> duplicate
     for (Cat cat : cats) {
       uniqueCats.add(cat); // add() -> equals() and hashCode()
     }
     System.out.println(uniqueCats); // [Cat(name=Vincent), Cat(name=Lucas), Cat(name=Jennie)]

     // 1. true / false (Check if any duplicated cat in ArrayList<Cat>)
     boolean foundDuplicated = false;
     for (Cat cat : cats) {
       if (!uniqueCats.add(cat)) {
         foundDuplicated = true;
         break;
       }
     }
     System.out.println("found duplicated ? "+foundDuplicated); // true


   // 2. Has Ordering, remove Duplicated
   HashSet<Cat> catset = new HashSet<>();
   ArrayList<Cat> orderedCats = new ArrayList<>();
   for (Cat cat : cats) { // ordering
     if (catset.add(cat)) { // checking
       orderedCats.add(cat); // ordering
     }
   }
   System.out.println(orderedCats); // [Cat(name=Jennie), Cat(name=Vincent), Cat(name=Lucas)]




// HashSet<Integer> hs = new HashSet<Integer>();
// before Java 1.5 if no<> implys HashSet<Object>
// HashSet hs = new HashSet<>();

// Leecode #217
// HashSet<Integer> hs = new HashSet<Integer>();
// int[] nums = new int[] {1, 2, 3, 1, 5};
// for (int x : nums) {
// if (!hs.add(x)) // return true if find a duplicate
// return true;

// return false;
// }

  }
}

