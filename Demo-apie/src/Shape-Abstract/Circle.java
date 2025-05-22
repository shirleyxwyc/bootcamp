import java.math.BigDecimal;

public class Circle extends Shape { //Shape is now abstract, concrete class extend abstract class->
  private double radius;

  public Circle (String color, double radius) {
    super(color);//calling parent constructor
    this.radius=radius;
    }

    public double getRadius(){
      return this.radius;
    }

    public void setRadius(double radius) {
      this.radius=radius;
    }

    //Since the parent Class shape has abstract method->need to override its abstract method in order to inherit parent class
    @Override //need to override area() abstract method in parent class Shape
    public double area() {
      return BigDecimal.valueOf(this.radius)
      .multiply(BigDecimal.valueOf(this.radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
    }




public static void main(String[] args) {

  //!Polymorphism
  Shape c3 =new Circle("Green", 5);
       System.out.println(c3.getColor()); //Green
       System.out.println(c3.area()); //78.53981633974483

       Shape c4 =new Triangle("Purple", 5.0, 6.0);
       System.out.println(c4.getColor()); //Purple
       System.out.println(c4.area()); //15.0 can .area() because Parent has abstract area() and each child must have its own area() override method in order to inherit Parent Class

       int x=100; //input by user
       Shape shape;
       if(x>50){
        shape =new Circle("White", 3.5); //adding else if {}another type of shape added
        // else if{}
       }else{
        shape = new Triangle("BLUE", 5.0, 6.0);
        }
        System.out.println(shape.area()); //output circle area 38.48451000647496

        double area =shape.area(); //this code won't be change eventhou there will be another type of shape added
        if(area>10){
          System.out.println("Area "+ area);
        }else{
          System.out.println("it is a small shape");
        }

        //!shape.getBase(); //unsafe type becoz not not is circle or triangle in compile time
        //geting specific field-? base -> instanceof and downcasting
        //if  see github update





}
 }

