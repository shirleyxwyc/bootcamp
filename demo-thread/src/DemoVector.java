import java.util.List;
import java.util.Vector;
//Vector 
public class DemoVector {
  private static final List<String> STRINGS = new Vector<>();

  public static void main(String[] args) {
    //Testing if add() and remove() are synchronized , Vector has no push() and pop()
    DemoStack object = new DemoStack();
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        STRINGS.add("hello"); //lock
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
     System.out.println(STRINGS.size());//200_000->proven thread-safe





  }
}
