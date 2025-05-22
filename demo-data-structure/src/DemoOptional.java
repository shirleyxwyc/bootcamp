import java.lang.foreign.Linker.Option;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Class -> object (row), Attribute(column of a row, eg.name, email, age, null)
//

public class DemoOptional {
  // !Should not use Optional for attribute and getter
  // private Optional<String> names; //!For attribute, always use null to present
  // isPresent() Checks for the presence of a value in an Optional.,Returns a boolean
  // contains(): Checks for the presence of an element in a collection.


  public static void main(String[] args) {
    // Main is the caller of below static methos(A)
    List<String> names =
        new ArrayList<>(Arrays.asList("John", "Mary", "Lucas"));
    String target = "Mary";
    Optional<String> result = findTargetString(names, target);
    if (result.isPresent()) {
      System.out.println("Target is found: " + target);
    } else {
      System.out.println("Target is not found"); // avoid return null
    }

    // findTarget(null,'c');//NPE

    // ! Ways to create Optional Object
    Optional<Ball> ball1 = Optional.of(new Ball(Ball.Color.RED, 13));
    Optional<Ball> ball2 = Optional.empty();
    Ball b1 = null;
    Optional<Ball> ball3 = Optional.ofNullable(b1);
    Optional.of(null); // !You must put non-null value ....?
    // Optional object can not be new like LocalDate
    LocalDate.of(2025, 5, 1); // like LocalDate cannot new explicitly new object implicitly

  }

  // ! Optional.class is ONLY for return type
  public static Optional<String> findTargetString(List<String> strings,
      String target) {
    if (string != null && strings.contains(target))
      return Optional.of(target);
    return Optional.empty();// or return Optional.ofNullable(null);
  }


  // ! SHOULD NOT use Optional as type of parameter
  public static boolean findTarget(Optional<String> str, char target) {
    if (!str.isPresent()) {
      return false;
      return str.get().contains(String.valueOf(target));
    }
  }

}
