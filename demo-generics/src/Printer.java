//!Generics
//!During compile time , you can write less code  ( no need to write indvidual Class for StringPrinter.java and IntegerPrinter.java)

public class Printer<T> {//T is a random value -> not yet define, not sure about the return type
  private T value;

public Printer(T value){
  this.value=value;
}

public T getValue(){
  return this.value;
}

//Runtime
  public static void main(String[] args) {

    Printer<String> stringPrinter = new Printer<String>("Hello");
    Printer<Integer> integerPrinter = new Printer<Integer>(10);
    Printer<Object> objectPrinter = new Printer<Object>("hello");
    //objectPrinter.getValue().charAt();//! Not OK becoz Object is not String
    System.out.println(((String) objectPrinter.getValue()).charAt(1));//e

    //HashMap is generic <k,v>->see underlying source code


  }
}
