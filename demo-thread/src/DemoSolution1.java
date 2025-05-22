import java.util.concurrent.atomic.AtomicInteger;
//Solution 1-Use AtomicXXX -locking x

public class DemoSolution1 {
private AtomicInteger x; //原子性 -不能被同時修改

public DemoSolution1(){
  this.x = new AtomicInteger(0); //read and write need to be completed first
}

public void add(){
  this.x.addAndGet(1);  //=x++
}

public int getX() {
    return this.x.get();
  }


  public static void main(String[] args) {
    DemoSolution1 object = new DemoSolution1();

    // define the task content
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        object.add();
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

    System.out.println(object.getX()); //200000
  }
}
