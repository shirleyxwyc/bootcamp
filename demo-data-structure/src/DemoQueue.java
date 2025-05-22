import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  
  public static void main(String[] args) {
//Memorise the below diagram about Class and Inteface(Week 5Queue&deque)    
//https://javahongkong.sg.larksuite.com/wiki/KdK1w9mzgi6Dk3k3W9zuThFxsBc
//revise the concept of add() during compile time and run time 
//Queue is interface not Class can not new
//LinkedList->Deque->Queue
//you can write LinkedList<>(Cat) queue1= new LinkedList<>();, but lower readbility.
//Writing Queue<Cat> will narrow down the methods to what belongs in Queue, higher readbility
Queue<Cat> queue1 = new LinkedList<>();
queue1.add(new Cat("John"));
queue1.add(new Cat("Jacky"));
queue1.add(new Cat("Vincent"));
System.out.println(queue1.poll());//John -poll()find the first person
System.out.println(queue1);


Deque<Cat> queue2 = new LinkedList<>();
queue2.addLast(new Cat("Mary"));
queue2.addFirst(new Cat("Peter"));
queue2.addLast(new Cat("Sally"));

System.out.println(queue2.pollFirst());//Cat(name= Peter)
System.out.println(queue2);//[Cat(name= Mary), Cat(name= Sally)]
System.out.println(queue2.pollLast());//remove and return the last element->Cat(name= Sally)

Deque<Cat> queue3 = new ArrayDeque<>();
queue3.addLast(new Cat("Jennie"));
queue3.addFirst(new Cat("Dennie"));//like插隊
queue3.addLast(new Cat("Andy"));
System.out.println(queue3.pollFirst());//Cat(name= Dennie)

 
List<Cat> cats = new LinkedList<>();
Animal a1 = new Cat("John");
Object o1 = new Cat("John");



  }
}
