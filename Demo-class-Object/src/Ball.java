public class Ball {
  private String color;
  private String countryMade;
  private double size;


  //!new
  //!CONSTRUCTOR ,IMPLICT = BY DEFAULT implicitly empty 
  //name of constructor has no return value and must =class name "Ball", case sensitive
  //!but once you define a new constructor , the empty constructor will disappear

  public Ball(){ //this is empty constructor 
    //this.size =3; //this is initialization but size could be changed by setsize later on in main
  }
 

  //!can be more than one constructor
  //All arguement/parametor constructor
  public Ball(double size){ //(double size) this. size= size so this is not a empty constructor
    this.size=size;
  }


  //1. Setter
public void setColor (String color) {
  this.color=color;
}
public void setCountryMade (String countryMade) {
  this.countryMade=countryMade;
}
public void setSize(double size) {
  this.size = size;
}
  //2. Getter
public String getColor() {
  return this.color;
}
public String getCountryMade() {
  return this.countryMade;
}
public double getSize() {
  return this.size;
}

public String getSizeDesc() {
  if (this.size > 5) {
    return "BIG";
  } else {
    return "SMALL";
  }
}

public static void main(String[] args) {
    

  //3. main(create object, set, get)
Ball b1 =new Ball();  //!Ball() is empty constructor, !but once you define a new constructor , the empty constructor will disappear
Ball b2 =new Ball(10);
System.out.println(b2.getSizeDesc());
b1.setColor("Red");
b1.setCountryMade("USA");
b1.setSize(4);
System.out.println(b1.getSizeDesc());//SMALL



Ball b3 = new Ball();
b3.setColor("Yellow");
b3.setCountryMade("AUS");


String color = b1.getColor();
String countryMade = b1.getCountryMade();
System.out.println("b1 color "+color);
System.out.println("b1 countryMade "+countryMade);

System.out.println("b2 color "+b2.getColor());
System.out.println("b2 countryMade "+ b2.getCountryMade());





  }
}
