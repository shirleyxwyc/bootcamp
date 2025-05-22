package StudentBagBall;

public class Bag {
  private Ball[] balls;

  // constructor:
  public Bag() {
    this.balls = new Ball[5]; // new Ball [] array with length of 5
  }

  // Method
  public int getSize() {
    return this.balls.length;
  }

  public boolean isEmpty() {
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] != null) {
        return false; 
      }
    }
    return true;
  }

  public boolean isFull() {
    for (int i = 0; i < balls.length; i++) {
      if (this.balls[i] == null) {
        return false;
      }
    }
    return true;
  }

  public boolean add(Ball newBall) {
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] == null) {
        this.balls[i] = newBall;
        return true;
      }
    }
    return false;
  }

  public Ball pick(int index) {
    if (index < 0 || index >= this.balls.length) {
      return null;
    } // Return null if the index is out of bounds
    Ball target = this.balls[index]; // Get the Ball at the specified index
    this.balls[index] = null;
    // Set that index to null to "remove" the Ball
    return target;// returns the target Ball object that was picked
  }



  public static void main(String[] args) {
   Bag myBag =new Bag();
   System.out.println("Size of my bag ? " +myBag.getSize()); //5
   System.out.println("is my bag empty ? " +myBag.isEmpty());//true
   System.out.println("is my bag full ? " + myBag.isFull());//false
   Ball ball1=new Ball();
   Ball ball2=new Ball();
   Ball ball3=new Ball();
   Ball ball4=new Ball();
   Ball ball5=new Ball();
   myBag.add(ball1);
   myBag.add(ball2);
   myBag.add(ball3);
   myBag.add(ball4);
   myBag.add(ball5);
   System.out.println("is my bag full ? " +myBag.isFull());//true
   
   System.out.println(myBag.pick(2));
   System.out.println("is my bag full ? " +myBag.isFull());//false
 


  }

}
