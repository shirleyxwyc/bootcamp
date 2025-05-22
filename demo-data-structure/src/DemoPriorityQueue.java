import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static class SortedByNameDesc implements Comparator<String> {
    @Override // from acending order(Lucas Sally Vincent) -> override to descending order(Vincent Sally Lucas)
    public int compare(String s1, String s2) {
      return s1.compareTo(s2) > 0 ? -1 : 1;
    }
    // formular Person age -> elderly goes first

    public static class SortedByAgeDesc implements Comparator<Person> {

      @Override
      public int compare(Person p1, Person p2) {
        if (p1.getAge() > (p2.getAge())) {
          return -1;
        } else if ((p1.getAge() < (p2.getAge()))) {
          return 1;
        }else{
          return 0;
        }
      }

    }

  public static void main(String[] args) {

    // Queue won't use for loop ,use pool ->while loop(consume and remove element)
    Queue<String> q1 = new PriorityQueue<>(new SortedByNameDesc()); // underlying _ArrrayList->Array
    q1.add("Vincent");
    q1.add("Lucas");
    q1.add("Sally");
    System.out.println(q1);// [Lucas, Vincent, Sally]

    // add won't order element in Queue
    // if need to order use poll ->while loop

    while (!q1.isEmpty()) {
      System.out.println(q1.poll()); //!ordering-> pick up (slow)
    } // Lucas Sally Vincent

    //Vincent Sally Lucas

    // method:poll()
    // -ordering-> String compareTo()

//3 persons-PQ
Queue<Person> q2 =new PriorityQueue<>(new SortedByAgeDesc());
q2.add(new Person("David", 30));
q2.add(new Person("Paul", 65));
System.out.println(q2.poll());//Person(Name Paul, Age 65)
q2.add(new Person("John", 80));
System.out.println(q2);//[Person(Name John, Age 80), Person(Name David, Age 30)]






  }
  }
}
