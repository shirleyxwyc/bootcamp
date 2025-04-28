import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {

  // Attribute
  //Attributes -instance Variable
  //Instance means object
  private String name;
  private double height;
  private double weight;

  // Constructor
  public Person() {//this is a implicit empty constructor by default
                  //create Person object with NULL name, 0.0 height and 0.0 weight
  }
  
  //!but once you define a new constructor(below) , the empty constructor will disappear
  
  // all arugment constructor->all fields are properly initialized when the object is created.
  public Person(String name, double height, double weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  // ! Instance Method (Object Method)-->Instance means Object
  // Setter
  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Getter
  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public String getName() {
    return this.name;
  }

  // Method
  public String toString() {
    return "Name: " + name + " Height : " + height + " Weight: " + weight;
  }

  // getBMI Method->BMI = weight/height * height; (BMI = kg/m2;)
  public double getBMI() {
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
  }

  //! static getBMI method->need parameter as not related to object
  public static double getBMI2 (double height, double weight) {
    return BigDecimal.valueOf(weight)
    .divide(BigDecimal.valueOf(Math.pow(height,2)),2
    ,RoundingMode.HALF_UP)
    .doubleValue();
  }

  // getBMIStatus Method (Underweight:<18.5, Normal: >=18.5 && <24.9, Overweight >=25 && <30, Obese >=30)

  public String getBMIStatus() {
    if (this.getBMI() < 18.5) {
      return "Underweight"; // "return" -> exit method
    }else if (this.getBMI()>=18.5 && this.getBMI() < 25.0){
      return "Normal";
    }else if (this.getBMI()>=25.0 && this.getBMI()<30.0) {
      return "Overweight";
    }else {
     return "Obese";
    }
  }

  //! static getBMIStatus method->need parameter as not related to object
  public static String getBMIStatus2(double height, double weight) {
    
      double bmi2 = BigDecimal.valueOf(weight)
      .divide(BigDecimal.valueOf(Math.pow(height,2)),2
      ,RoundingMode.HALF_UP)
      .doubleValue();
    

    if (bmi2 < 18.5) {
      return "Underweight"; // "return" -> exit method
    }else if (bmi2>=18.5 && bmi2 < 25.0){
      return "Normal";
    }else if (bmi2>=25.0 && bmi2<30.0) {
      return "Overweight";
    }else {
     return "Obese";
    }
  }



  public static void main(String[] args) {
    Person person = new Person();
    System.out.println(person);

    Person p1 = new Person("John", 1.76, 74.0);
    Person p2 = new Person("Mary", 1.64, 70.0);
    Person p3 = new Person("Peter", 1.8, 77.0);

    System.out.println("p2 's Name = " + p2.getName());// p2 's Name = Mary
    System.out.println("p2 's height = " + p2.getHeight());// p2 's height = 1.64
    System.out.println("p2 's weight = " + p2.getWeight());// p2 's weight = 70.0

    System.out.println(p1); // Name: John Height : 1.76 Weight: 74.0

    System.out.println(p1.getBMI()); //23.89
    System.out.println(p1.getBMIStatus());//Normal

    System.out.println(p2.getBMI()); //26.03
    System.out.println(p2.getBMIStatus());//Overweight

    System.out.println(p3.getBMI());//23.77
    System.out.println(p3.getBMIStatus());//Normal

 
    //!Static getBMI(), getBMIStatus2()
    System.out.println(getBMI2(1.76, 80.0));//25.83
    System.out.println(getBMIStatus2(1.76, 80.0));//Overweight



  }
}
