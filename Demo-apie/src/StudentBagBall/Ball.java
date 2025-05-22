package StudentBagBall;

public class Ball {
  // Attributes
  private String color;
  private int number;

  // Empty Constructor
  public Ball() {
    // Sets default values
    this.color = "RED";
    this.number = 1;
}

//Parameterized Constructor : create new Ball object and assign parameters to object fields
  public Ball(String color, int number) {
    this.color = color;
    this.number = number;
  }

  // Getter

  public String getColor() {
    return this.color;
  }

  public int getNumber(){
    return this.number;
  }

  //Setter
  public void setColor(String color){
    this.color=color;
  }

  public static void main(String[] args) {
    Ball b1 = new Ball();
    Ball b2 = new Ball("YELLOW", 3);
    System.out.println(b1.getColor());//RED
    System.out.println(b2.getColor());//YELLOW

    String storedColor = b2.getColor(); // With return type->can further stores "YELLOW" in variable 'storedColor'
    int storedNumber = b2.getNumber();  // With return type->can further stores 3 in variable  'storedNumber'

    System.out.println("color of b2= " +storedColor + "and number of b2 =" +storedNumber);//color of b2= YELLOWand number of b2 =3

    b2.setColor("RED"); //void -> no return type
   System.out.println(b2.getColor());
   

  }
}