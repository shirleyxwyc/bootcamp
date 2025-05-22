import java.util.Comparator;

// Comparator =formular
public class SortedByNum implements Comparator<Ball> { // int compare(T o1, T o2);

  @Override
  public int compare(Ball b1, Ball b2) {
    // -1->b1 goes first
    // 1->b2 goes first
    // Acending order
    return b1.getNum() < b2.getNum() ? 1 : -1;

  }





}
