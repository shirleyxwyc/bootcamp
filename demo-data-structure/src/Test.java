import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

  public static void main(String[] args) {

    HashMap<String, String> nameMap = new HashMap<>();
    nameMap.put("Vincent", "organge");
    nameMap.put("lucas", "apple");
    System.out.println(nameMap.get("Jennie"));// null
    System.out.println(nameMap.get("Vincent"));//organge
    nameMap.put("lucas", "lemon");
    System.out.println(nameMap.get("lucas"));//lemon
    nameMap.put("Vincent", "orange!!!");
    System.out.println(nameMap.get("Vincent")); // organge!!!


    String Newvalue = nameMap.get("Vincent") + "!!";
    nameMap.put("vincent", Newvalue);
    System.out.println(nameMap.get("vincent"));// orange!!!!!

    for (Map.Entry<String, String> entry : nameMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
    // lucas lemon
    // vincent orange!!!!!


    // Problem Solving
    // counting
    int[] arr = new int[] {-1, 3, -1, 3, 3, 8};

    // HashMap
    // Output:
    // there are 2 of -1.
    // there are 3 of 3.
    // there are 1 of 8.

    HashMap<Integer, Integer> intMap = new HashMap<>();
    
    for(int x : arr ){
      if(intMap.get(x) == null){
        intMap.put(x, 1);
      }else{
        intMap.put(x,intMap.get(x)+1);
      }
    }

  for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
System.out.println("there are "+ entry.getValue()+" of "+entry.getKey());
    }

        // key -> value
    // value (a set of something)
    Student s1 = new Student("John");
    Student s2 = new Student("Peter");
    Student s3 = new Student("Jennie");
    

    ArrayList<Student> class3a = new ArrayList<>();
    class3a.add(s1);
    class3a.add(s2);
    class3a.add(s3);
   


    Student s4 = new Student("Annie");
    Student s5 = new Student("Joe");
    Student s6 = new Student("Ken");

    ArrayList<Student> class3b = new ArrayList<>();
    class3b.add(s4);
    class3b.add(s5);
    class3b.add(s6);

    // HashMap<Key, Value>
    HashMap<String, ArrayList<Student>> serachEngine = new HashMap<>();
    serachEngine.put("3A", class3a);
    serachEngine.put("3B", class3b);

  //Add a new Student "Steven" into class 3A by HashMap
  //No Loop
  serachEngine.get("3A").add(new Student("Steven"));

  System.out.println(serachEngine.put("3A", class3a));

ArrayList<Animal> animals=new ArrayList<>();
animals=new ArrayList<Animal>();//OK
//can not change
//animals=new ArrayList<Cat>();//Not OK
//animals=new ArrayList<Dog>();//Not OK
Animal a1 = new Cat("peter");
Animal a2 = new Dog(3);
animals.add(a1);
animals.add(a2);
System.out.println(animals);//[Cat(name= peter), Dog@22]
  //BUT you are sacrifying child class's unique method-> Cat's getName()
  //->compile error found when animals,getName() unless we check with instanceog and confirm it is a cat and
  // cast (Cat)animals-> in oreder to animal.getName()--> OK

Map<String, ArrayList<Animal>> catMap = new HashMap<>();
//scenario 1

ArrayList <? extends Animal> animals3 =new ArrayList<Cat>();
ArrayList <? extends Animal> animals4 =new ArrayList<Dog>();
ArrayList <? extends Animal> animals5 =new ArrayList<Animal>();

animals3.add(new Cat("Peter"));


ArrayList <Animal> animals3 =new ArrayList<Animal>();
  }
}

