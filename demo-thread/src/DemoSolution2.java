// !Solution 2=Use synchronized-locking add() method

public class DemoSolution2 {
  private int x;

  public DemoSolution2() {

  }

  // !synchronized -> Lower performance
  // use when there are more than 1 worker(multi-thread)
  public synchronized void add() { // ! this is the key to lock and unlock the door of add() method not just x
    x++; // read and write - slower
    //y--;
    //z++;
  }

  public int getX() {
    return this.x;
  }

  public static void main(String[] args) {
    DemoSolution2 object = new DemoSolution2();

    // define the task content
    Runnable task = () -> {
      System.out.println("Thread Name"+Thread.currentThread().getName()+"start to work.");
      for (int i = 0; i < 100_000; i++) {
        object.add();
      }
      System.out.println("Thread Name"+Thread.currentThread().getName()+"completed.");
    };


    Thread worker1 = new Thread(task);
    worker1.start();

    Thread worker2 = new Thread(task);// (3rd worker)
    worker2.start();

    try {
      worker1.join();// !main thread is wating for worker 1 come back, then proceed
      worker2.join();// !main thread is wating for worker 2 come back, then proceed
    } catch (InterruptedException e) {// checked exception

    }

    System.out.println(object.getX());// 200000


  }
}
