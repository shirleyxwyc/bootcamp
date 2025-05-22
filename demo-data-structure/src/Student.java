import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Student {
  private String name;

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Student))
      return false;
    Student c1 = (Student) obj;
    return this.name == c1.getName();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  public String toString() {
    return "Student name(" + this.name + ")";
  }


  public static void main(String[] args) {
    // Class a
    ArrayList<Student> class3a = new ArrayList<Student>();
    Student s1 = new Student("John");
    Student s2 = new Student("Peter");
    Student s3 = new Student("Jennie");

    // adding students to the list
    class3a.add(s1);
    class3a.add(s2);
    class3a.add(s3);
    
    for(Student s : class3a){
      System.out.println(s);
    }//Student name(John)//Student name(Peter)//Student name(Jennie)

    // Class b
    ArrayList<Student> class3b = new ArrayList<>();
    Student s4 = new Student("Annie");
    Student s5 = new Student("Joe");
    Student s6 = new Student("Ken");

    // adding students to the list
    class3b.add(s4);
    class3b.add(s5);
    class3b.add(s6);



    // !After adding 3override -> equals(), hashCode(), toString()
    // can test if adding student successfully to the ArrayList<Student> class 3a and class 3b
    System.out.println("Students in Class3a : " + class3a);
    // Students in Class3a : [Student name(John), Student name(Peter), Student name(Jennie)]

    System.out.println("Students in Class3b : " + class3b);
    // Students in Class3b : [Student name(Annie), Student name(Joe), Student name(Ken)]


    // !Creating a HashMap for class3a and class3b named "searchEngine"
    // !HashMap<key,value>
    HashMap<String, ArrayList<Student>> searchEngine = new HashMap<>();
    searchEngine.put("3A", class3a);
    searchEngine.put("3B", class3b);
    System.out.println(searchEngine.put("3A", class3a));
    // [Student name(John), Student name(Peter), Student name(Jennie)]

    System.out.println("checking "+searchEngine.get("3A"));
    //checking [Student name(John), Student name(Peter), Student name(Jennie)]
    searchEngine.get("3A").add(new Student("Steven"));
    System.out.println("check if added "+searchEngine.get("3A"));
    //check if added [Student name(John), Student name(Peter), Student name(Jennie), Student name(Steven)]


    // Add a new Student "Steven" into class 3A by HashMap
    // No Loop
    
    // searchEngine.get("3A")->retrieve the values : ArrayList<Student>
    // Retrieve the List: searchEngine.get("3A") retrieves the ArrayList<Student> for class "3A".
    // Add the Student: .add(new Student("Steven")) adds the new student "Steven" to that list.

    searchEngine.get("3A").add(new Student("Steven"));
    System.out.println(searchEngine.put("3A", class3a));
    // [Student name(John), Student name(Peter), Student name(Jennie), Student name(Steven)]


//put Sally into Class 3C if it exists
//if 3C not exists-> create Class 3C
//searchEngine.get("3C").add(new Student("Sally"));// 3C not exists->searchEngine.get("3C")=null->cannot add
    //if (searchEngine.get("3C")==null){
      //searchEngine.get("3C").add(new Student("Sally")); 
    //}else{

    //}

    if (searchEngine.containsKey("3C")){
      searchEngine.get("3C").add(new Student("Sally"));
    }else{ //create new arrayList
      ArrayList<Student> class3c=new ArrayList<>();
      class3c.add(new Student("Sally"));
      searchEngine.put("3C", class3c);
    }
 System.out.println(searchEngine.get("3C"));
 //[Student name(John), Student name(Peter), Student name(Jennie), Student name(Steven), Student name(Steven)]
 //[Student name(Sally)]
 
    //Array<Student> class3c=searchEngine

    // ! search students by a String value
    ArrayList<Student> results = searchEngine.get("3B"); // ! ?
    for (Student s : results) { // ! ? assign ArrayList<Student> class3b to result and loop each student to getName()
      System.out.println(s.getName());
    } // Annie Joe Ken



  }
}
