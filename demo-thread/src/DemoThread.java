public class DemoThread {
  private int x;

  public DemoThread() {

  }

  public void add() {
    this.x++;
  }

  public int getX() {
    return this.x;
  }

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < 100000; i++) {
      sum += i;
    }
    System.out.println(sum);

    DemoReadWrite obj = new DemoReadWrite();
    for (int i = 0; i < 100_000; i++) {
      obj.add();
    }
    System.out.println(obj.getX());// 100000

Runnable task =() -> System.out.println("hello");


//! main thread(original worker)
Thread worker1 = new Thread(task); //(2nd worker)
worker1.start();

Thread worker2 = new Thread(task);//(3rd worker)
worker2.start();

System.out.println("Program end...");


  }
}


