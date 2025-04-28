public class DayDemoSwitch {
  public static void main(String[] args) {
    // if --> control the range of value
    int x = 3;
    if (x > 1 && x < 5) {
      System.out.println("x is " + x);
    }
    if (x == 3) {
      System.out.println("x = " + x);
    } else if (x == 4) {
      System.out.println("do something");
    } else {
      System.out.println("do something else");
    }

    // switch
    // !1. can only check 1 variable only
    // !2. can only check equals to (no range checking)
    // !3. you have to "break" the switch yourself

    x = 2;
    switch (x) {
      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("goodbye"); // printed as int x=2
        break;
      case 3:
        System.out.println("bootcamp"); //! not printed as there is break to exit the switch block after case 2
      default:
        System.out.println("other cases");//! not printed as there is break to exit the switch block after case 2
    }

    int y = 2;
    switch (y) {
      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("goodbye"); //! printed as no break to exit the switch block
        //!delete break here
      case 3:
        System.out.println("bootcamp"); //!printed as no break to exit the switch block
      default:
        System.out.println("other cases");//!printed as no break , so need to break to exit the switch block
    }



  }

}
