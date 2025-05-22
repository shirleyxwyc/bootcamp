import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoSet {
  public static void main(String[] args) {
    Set<Cat> cats = new HashSet<>();
    cats.add(new Cat("John"));
    cats.add(new Cat("Jacky"));
    cats.add(new Cat("John"));
    System.out.println(cats);// [Cat(name= John), Cat(name= Jacky)]

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Orange");

    ArrayList<String> names = new ArrayList<>();
    names.add("John");
    names.add("Peter");


    ArrayList<ArrayList<String>> strings = new ArrayList<>();
    strings.add(fruits);
    strings.add(names);
    System.out.println(strings.get(0));
    System.out.println(strings.get(1));
    // ex: LinkedList<ArrayList<String>> strings = new LinkedList<>();

    // HashMap Map is interface,
    // HashMap is a class in Java that implements the Map interface
    // HashMap extends AbstractMap and implements the Map interface.
    // This means it inherits methods from both AbstractMap and the Map interface.
    Map<String, ArrayList<String>> stringMaps = new HashMap<>();
    // ArrayList<ArrayList<ArrayList<Warrior>>>strings=new ArrayList<>();

    stringMaps.put("Fruit", fruits);
    stringMaps.put("Name", names);

    System.out.println(stringMaps.get("Fruit"));// [Apple, Orange]
    System.out.println(stringMaps.get("Name"));// [John, Peter]

    // !HashMap <k,v> when v= HashMap-> Review again!
    // Floor

    HashMap<String, Map<String, ArrayList<String>>> building = new HashMap<>();

    ArrayList<String> p1a = new ArrayList<>(List.of("John", "Peter"));
    ArrayList<String> p1b = new ArrayList<>(List.of("Sally", "Tommy"));


    ArrayList<String> p2a = new ArrayList<>(List.of("ABC", "DEF"));

    ArrayList<String> p3a = new ArrayList<>(List.of("IJK", "XYZ"));
    ArrayList<String> p3b = new ArrayList<>(List.of("OPQ", "RST"));
    ArrayList<String> p3c = new ArrayList<>(List.of("KLJ", "OOO"));

    Map <String, ArrayList<String>> floor1 = new HashMap<>(); 
    floor1.put("PA", p1a);
    floor1.put("PB", p1b);

    Map <String, ArrayList<String>> floor2 = new HashMap<>(); 
    floor2.put("PA", p2a);
   

    Map <String, ArrayList<String>> floor3 = new HashMap<>(); 
    floor3.put("PA", p3a);
    floor3.put("PB", p3b);

    System.out.println(building.get("FLOOR3").get("PB")); // [OPQ, RST]

    ArrayList<ArrayList<String>> lines = new ArrayList<>();
    lines.add(p1a);
    lines.add(p1b);
    lines.add(p2a);
    lines.add(p3a);
    lines.add(p3b);
    lines.add(p3c);
    // Not good for retrieving data
    lines.get(4); // we do not know the target data location.
    // ArrayList is for ordering data.

    // Dog, Cat
    ArrayList<Animal> animals = new ArrayList<Animal>();
    // animals = new ArrayList<Cat>(); // NOT OK

    animals.add(new Cat("John"));
    animals.add(new Dog(13));
    for (Animal animal : animals) {
      if (animal instanceof Cat) {
        System.out.println(((Cat) animal).getName());
      } else if (animal instanceof Dog) {
        System.out.println(((Dog) animal).getAge());
      }
    }

    //! Generics --> Review!
    // The definition of arraylist can be ArrayList<Cat>, ArrayList<Dog> and ArrayList<Animal>
    // ! Difference between "ArrayList<? extends Animal>" and "ArrayList<Animal>"
    ArrayList<? extends Animal> animals3 = new ArrayList<Cat>();
    animals3 = new ArrayList<Dog>();
    animals3 = new ArrayList<Animal>();


    // Scenario 1:
    // 2 Cat List ("cat1", "cat2") and 1 Dog List ("dog1")
    Map<String, ArrayList<? extends Animal>> map1 = new HashMap<>();

    // Convenient for write data.
    ArrayList<Cat> catlist1 = new ArrayList<>();
    catlist1.add(new Cat("Ken"));
    catlist1.add(new Cat("Oscar"));

    map1.put("cat1", catlist1);

    ArrayList<Dog> doglist1 = new ArrayList<>();
    doglist1.add(new Dog(10));
    doglist1.add(new Dog(99));

    map1.put("dog1", doglist1);

    // Data Retrieval (read -> No obvious advantages)
    for (Animal animal : map1.get("cat1")) {

    }

    // Scenario 2:
    // many animal list -> every animal list contains cat and dog.
    Map<String, ArrayList<Animal>> catMap2 = new HashMap<>(); // ! This design indicates many lists of (cat and dog).

    ArrayList<Animal> animals1 = new ArrayList<>();
    animals1.add(new Cat("Peter"));
    animals1.add(new Dog(100));
    ArrayList<Animal> animals2 = new ArrayList<>();
    animals2.add(new Cat("Sally"));
    animals2.add(new Dog(99));
    catMap2.put("animallist1", animals1);
    catMap2.put("animallist2", animals1);

    // ! Animal is the parent of Cat (OK)
    // ! but ArrayList<Animal> IS NOT the parent of ArrayList<Cat>
    // catMap2.put("animallist3", catlist1); // error



  }

}
