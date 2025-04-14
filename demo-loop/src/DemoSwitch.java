public class DemoSwitch {
  public static void main(String[] args) {
    // if --> control the range of value
    int x = 2;
    if (x>1 && x<5) {
      System.out.println(x);
    }
    if(x==2) {
      System.out.println(x);
    }

    //switch 
    //!1. can only check 1 variable only
    //!2. can only check equals to (no range checking)
    //!3. you have to "break" the switch yourself
    

    switch(x) {
      case 1:
      System.out.println("Hello");
      break;
      case 2:
      System.out.println("goodbye"); //printed as int x=2
      break;
      case 3:
      System.out.println("bootcamp"); //printed as int x=2
      default:
      System.out.println("other cases");//printed as after 2 , so need to break
    }

    int value = 3;


















  }
  
}
