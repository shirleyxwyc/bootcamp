import java.math.BigDecimal;

public abstract class Shape { // Parent Class-concrete class-abstract class
  //1. Concrete Class-can be new and need abstract method
//2. Abstract class -cannot be new , can't new Shape in this case

//Abstract

//Concrete Class:
// child inherit parent attribute and parent methods
  //
  private String color;


  // constructor
  // super ("RED")
  public Shape() {

  }

  public Shape(String color) {
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public abstract double area(); //not sure how


    
  

  public static void main(String[] args) {
    //Shape shape = new Shape();--ignore this if there is 'abstract'
    //Shape shape1 = new Shape("RED");--ignore this if there is 'abstract'
    // Circle circle = new Circle(3.0,"RED");
    // System.out.println(circle.getColor());
    // System.out.println(circle.getRadius());
    Shape[] shapes =new Shape[2];
    shapes[0]=new Circle("YELLO",4.0);
    shapes[1]=new Triangle("BLUE",4.0,5.0);

    //calculate the total area of all shapes
    double totalArea=0;
    for (int i=0; i<shapes.length;i++){
      totalArea=BigDecimal.valueOf(totalArea)
      .add(BigDecimal.valueOf(shapes[i].area())).doubleValue();
       }
       System.out.println(totalArea);

       Shape c3 =new Circle("Green", 5);
       System.out.println(c3.getColor()); //Green
       System.out.println(c3.area()); //78.53981633974483



       



  }
}
