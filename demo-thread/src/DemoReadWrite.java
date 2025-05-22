public class DemoReadWrite {
  private int x;

  public DemoReadWrite() {}

  public void add() {
    this.x++;
  }

  public int getX() {
    return this.x;
  }


  public static void main(String[] args) {
    DemoReadWrite object = new DemoReadWrite();

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

    System.out.println(object.getX()); // 0 -> after try and catch ->unstable value each time you run as 2 threads read and write on x
    // 2 threads error (1. + 2.)
    // 1. access same memory location (same task X++) and
    // 2. read & write (2 workers read and write x++ at the same time)



  }
}
