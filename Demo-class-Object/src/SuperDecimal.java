public class SuperDecimal {
//Attribute
  private double value;

  //constructor
public SuperDecimal(String value) {
  this.value = Double.valueOf(value);
}

//Getter
public double getValue() {
  return this.value;
}

//Setter
public void setValue(double value) {
  this.value =value;
}

  //Setter:
public SuperDecimal add(SuperDecimal sd) {
  //this.value(3.3) + sd.getValue()(3.5)
  double result = this.value + sd.getValue();
  return new SuperDecimal(String.valueOf(result));
}


public SuperDecimal add2() {
  double result = this.value + this.value;
  return new SuperDecimal(String.valueOf(result));
}

public int multiply (int a,int b ) {
  int result = a * b + (int)this.value;
  return result;
}



  public static void main(String[] args) {
    SuperDecimal sd = new SuperDecimal("3.3");//initialization to "3.3"
    System.out.println(sd.getValue());//3.3
    
   
    SuperDecimal vincent = new SuperDecimal("3.5"); //initialization to "3.5"
    System.out.println(vincent.getValue());//3.5
        
    SuperDecimal sd2 = sd.add(vincent);
    System.out.println(sd2.getValue());//6.8

    SuperDecimal sd3 =sd2.add(vincent);
    System.out.println(sd3.getValue());//10.3

    sd2.setValue(2.9);
    SuperDecimal sd4 =sd2.add(vincent);
    System.out.println(sd4.getValue());//6.4

    SuperDecimal lucas = new SuperDecimal("6.6");

   System.out.println(sd.add(sd).getValue());//6.6
   System.out.println(sd.add(lucas).getValue());//9.899999999999999
   System.out.println(vincent.add2().getValue());//3.5+3.5=7


   System.out.println(sd.multiply(10,10));//3.3 to int =3+100=103
   System.out.println(lucas.multiply(10,10));//6.6 to int =6+100=106





  }
}
