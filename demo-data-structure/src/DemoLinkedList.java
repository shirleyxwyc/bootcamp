import java.util.ArrayList;
import java.util.LinkedList;

public class DemoLinkedList {



  public static void main(String[] args) {
     // ! Underlying Data strucutre -> array
    // ArrayList handles all required operations of array
    ArrayList<String> names = new ArrayList<>();
    names.add("John");

    // ! Underlying Data strucutre -> object links object
    // Cat -> attribute name
    // Cat Object -> able to find name (string object)

    

    // Unique Methods in LinkedList
    // 1) addFirst(E e):Inserts the specified element at the beginning of the list.
    // 2) addLast(E e):Appends the specified element to the end of the list.
    // 3) getFirst():Retrieves the first element of the list without removing it.,
    // the first element of the list is null, getFirst() would return null
    // Throws a NoSuchElementException if the entire list is empty.
    // 4) getLast():Retrieves the last element of the list without removing it.
    // if the last element of a LinkedList is null, the getLast() method will return null.
    // Throws a NoSuchElementException if entire list is empty.
    // 5) removeFirst():Removes and returns the first element of the list.
    // 6) removeLast():Removes and returns the last element of the list.
    // 7) peekFirst():Retrieves, but does not remove, the first element of the list, or returns null if the list is empty.
    // 8) peekLast():Retrieves, but does not remove, returns null if the last element of the list is null, or returns null if the entire list is empty.
    // !peekFirst() & peekLast() create confusion as you can't determine if the list is empty or if the first/last element is null based solely on the return value
    // Best Practice:check the list's size before using them


    // Unique Methods in LinkedList-from the part of the Deque interface, which LinkedList implements.
    //poll():It retrieves and removes the head (first element) of the list, or returns null if the list is empty.





  }
}
