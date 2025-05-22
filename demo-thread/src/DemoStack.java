import java.util.Stack;
//! stack is thread safe in nature
//Thread-safe for all method in Stack.class
public class DemoStack {

  private static final Stack<Integer> INTEGERS=new Stack<>();



  public static void main(String[] args) {
    //! stack
    //!Always use push() and pop()-both methods are synchronized, not recommend to use add()

    Stack<String> stack1 = new Stack<>();
    stack1.push("John");
    stack1.push("Peter");
    stack1.push("Jennie");
    System.out.println(stack1.pop()); // Jennie pop() remove and pick up the last element
    stack1.push("Lucas");
    System.out.println(stack1.pop()); // Lucas

    stack1.add("Vincent");
    System.out.println(stack1.pop()); // Vincent
    stack1.addFirst("Sally");
    System.out.println(stack1.pop());//Peter

    //Test whether stack's push() is synchronized
    
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        INTEGERS.push(i); //lock
      }
    };
    Thread worker1 = new Thread(task);
    worker1.start();

    Thread worker2 = new Thread(task);// (3rd worker)
    worker2.start();

    try {
      worker1.join();// !main thread is wating for worker 1 come back, then proceed
      worker2.join();// !main thread is wating for worker 1 come back, then proceed
    } catch (InterruptedException e) {// checked exception

    }

    System.out.println(INTEGERS.size());//200_000->proven thread-safe

  }
}
