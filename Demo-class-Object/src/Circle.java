import java.math.BigDecimal;
//!array is finite length
public class Circle {

//Attribute:
//private modifier -> only accessible within the class
//public modifier --> the field being accessible from all other classes
//!using private is preferred because the fields should not be directly exposed to any objects
//setter通常是public void set属性名(类型 参数名)，内部用this.属性名 = 参数名。而getter是public 类型 get属性名()，返回this.属性名。属性名通常遵循驼峰命名法，首字母大写。
private double radius;
private String color;

//Creating Presenration Method--> //!setting the value of member variable and no return needed-> use void
//public void setXxx(String xxx) {//!method:use lower camel case,i.e setName
    //this.xxx = xxx;
//}

public void setRadius(double radius) { //(double radius) is parameter. lets the caller pass in a new value for the radius.
  this.radius=radius; 
}
public void setColor(String color) {
  this.color=color;
}

//no need --public void setColor(char color.charAt(0)){



//!1) "this.radius=radius;" is an assignment. this.radius(member variable:radius) = radius (parameter)
//!2)Before assignment: this.radius = 0.0 
//!3)需要外部輸入 (參數) →c1.setRadius(3.0)-->c1.getRadius() = 3.0-> Parameter radius = 3.0
//!4)After assignment: this.radius = 3.0
//!5) Assign the value of the parameter radius (3.0) to the member variable radius of this object c1."

//Creating Getter Method -->//!to get a double value of member variable, return needed-->no void
//public String getXxx() {//!method:use lower camel case, i.e. getName
    //return this.xxx;
//}

public double getRadius() {
  return this.radius; //return this.radius(member variable:radius)
}

public String getColor(){
  return this.color;
}

public char getColorChar(){
  return this.color.charAt(0);
}

//Creating Presentation Method :calculating area(presentation) radius * radius *pi
public double area() {
  return BigDecimal.valueOf(Math.pow(this.radius,2.0))
  .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
}

//Creating Method 2: return "BIG" (if area >=5.0) or "SMALL"

public String isBig() {
  if (this.radius >=5.0)
    return "BIG";
return "SMALL";  
}



  public static void main(String[] args) {

    //!Creating new object here

    System.out.println(Math.PI); //3.141592653589793
    Circle c1 =new Circle(); //new-->means creating new object
    c1.setRadius(3.0); //!->c1.getRadius()=3.0 (see below)
    c1.setColor("Red");
    System.out.println(c1.getRadius());//3.0
    System.out.println(c1.area()); //28.274333882308138
    System.out.println(c1.isBig());//SMALL

    Circle c2 =new Circle();
    c2.setRadius(5.0);
    c2.setColor("Yellow");
    
    System.out.println(c2.getRadius());//5.0
    System.out.println(c2.area()); //78.53981633974483
    System.out.println(c2.isBig());//BIG
    System.out.println(c2.getColorChar());

    Circle c3=new Circle();
    c3.setRadius(6.0);
    c3.setColor("Blue");
    
    System.out.println(c3.isBig());//BIG
    System.out.println(c3.getColor());//Blue
    






  }
}
