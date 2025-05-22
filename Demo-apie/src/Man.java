public class Man {
  //East, South ,West, North
  //Man Class-> add method getDirection()
  //m1.getDirection(); return String
  private int degree;

  // Constants for degree
  private static final int FIXED_TURN_DEGREE = 10;


  public Man(int angle) {
    this.degree = 0;
  }


  // 0-10=-10->350
  // public void turnLeft(){
  // int result = this.degree -FIXED_TURN_DEGREE;
  // if(result<0){
  // this.degree-=Math.abs(result);
  // return;
  // }
  // this.degree-=FIXED_TURN_DEGREE;
  // }

  public void turnLeft() {//0-10+360=350%360=350???
    this.degree = (this.degree - FIXED_TURN_DEGREE + 360) % 360;
  }



  //
  public void turnRight() { // 60+10+360=430%360=70  360+10+360%360=10
    this.degree = (this.degree + FIXED_TURN_DEGREE + 360) % 360;//0+10+360%360=370%360=10
  }

  // 1=East
  // 2=South
  // 3=West
  // 0=North
  // x=280/90->3
  // 280%90->10(remainder)
  // x<45->0
  // x>45->+1
  // switch case

  public String getDirection() {
    int extra = this.degree % 90 < 45 ? 0 : 1;
    System.out.println(extra);
    int result = this.degree / 90 + extra;
    System.out.println(result);
    switch (result) {
      case 0:
        return "North";
      case 1:
        return "East";
      case 2:
        return "South";
      case 3:
        return "West";
      case 4:
        return "North";
      default:
        return null;
    }



    // if (degree == 0) {
    // return "NORTH";
    // } else if (degree == 90) {
    // return "EAST";
    // } else if (degree== 180) {
    // return "SOUTH";
    // } else if (degree == 270) {
    // return "WEST";
    // } else {
    // return "unknown direction";
    // }

  }

  public static void main(String[] args) {
    Man m1 = new Man(0);
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    System.out.println(m1.getDirection()); //west



  }
}

