import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//compareTo(T o) is an abstract method in Comparable<T> interface
//compareTo(T o) must be implemented by any class that claims to be comparable.

public class Ball implements Comparable<Ball> { // public int compareTo(T o)=T is Ball no
  private int num;
  private Color color;

  public static enum Color {
    RED, BLUE, YELLOW;
  }

  public Ball(int num, Color color) {
    this.num = num;
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public int getNum() {
    return this.num;
  }

  @Override
  public String toString() {
    return "Ball(Number " + this.num + ", Color " + this.color + ")";
  }

  // @Override
  // public int compareTo(Ball ball){
  // -1 ->return this (decending order)
  // 1 ->ball go first (acending order)
  // if(this.num>ball.getNum())
  // return 1;
  // return -1;
  // }

  // BLUE->YELLOW->RED
  @Override
  public int compareTo(Ball ball) {
    // -1 ->return this,this goes first (decending order)
    // 1 ->ball go first (acending order)
    if (this.color == Color.BLUE) 
      return -1;
    if (ball.getColor() == Color.BLUE) 
      return 1;
if (this.color == Color.YELLOW) 
      return -1;
    return 1;

  }// [Ball(Number 2, Color BLUE), Ball(Number 1, Color YELLOW), Ball(Number 3, Color RED)]



  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(3, Color.RED));
    balls.add(new Ball(2, Color.BLUE));
    balls.add(new Ball(1, Color.YELLOW));

    for (Ball x : balls) {
      System.out.println(x);
    }
    // Collection
    // Java default sorting
    Collections.sort(balls); // implements Comparable<Ball>
    System.out.println(balls); // by decending order[Ball(Number 3, Color RED), Ball(Number 2, Color BLUE), Ball(Number 1, Color YELLOW)]
  
    //public class SortedByNum implements Comparator<Ball> write formula in SortByNum

    Collections.sort(balls, new SortedByNum());
//[Ball(Number 2, Color BLUE), Ball(Number 1, Color YELLOW), Ball(Number 3, Color RED)]??something wrong

  }
}
