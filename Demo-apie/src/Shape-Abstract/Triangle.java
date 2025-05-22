import java.math.BigDecimal;

public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle (String color, double base, double height) {
    super(color);//calling parent constructor first-> super() first
    this.base=base;
    this.height=height;
    }

    public double getBase(){
      return this.base;
    }

    public void setBase(double base) {
      this.base=base;
    }

    @Override
    public double area() {
      return BigDecimal.valueOf(this.base)
      .multiply(BigDecimal.valueOf(this.height))
      .divide(BigDecimal.valueOf(2))
      .doubleValue();
    }

public static void main(String[] args) {
  Triangle t1 = new Triangle("RED", 3, 4);
  System.out.println(t1.area());

}

}
