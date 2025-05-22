public class DemoSwitchExpression {
  // Java 14

  public static void main(String[] args) {
    // ! switch need to break in each case and CANNOT do :
    // 1. range checking
    // 2. AND OR

    int score = 95;

    // but for enum-> switch is useful as the number of enum value is finite
    // but still can not use OR for dulpicate conditions
    // ! normal swich cannot support missing value -> Java 14 improved switch
    WEEKDAY weekday = WEEKDAY.WED;
    switch (weekday) {
      case MON, TUE:
        System.out.println("I'm learning Java");
        // missing case WED (could not be checked)
      case THU:
        System.out.println("I'm learning Phython");
        break;
      case FRI:
        System.out.println("I'm learning Java");
        break;

      default:
        System.out.println("I don't know what happen");
        break;
    }// I don't know what happen

    WEEKDAY weekday2 = WEEKDAY.TUE;
    // Java 14 Switch Expression- no need to default as previous version, can block duplicate case, can combine case
    switch (weekday2) { // missing FRI just got warning but no compile error
      case MON, TUE -> {
        System.out.println("I am learning Java");
        System.out.println("I am learning Maths");
      }
      case WED -> System.out.println("I am learning Python");
      case THU -> System.out.println("Sleep...");
      // case FRI->System.out.println("Take a rest..."); //!After Java 21, cannot check missing value
      // I am learning Python
      
    }



  }

  public static enum WEEKDAY {
    MON, TUE, WED, THU, FRI;
  }

}
