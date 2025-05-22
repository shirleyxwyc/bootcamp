public class StringPrinter {
  private String value;
  private Integer value2;

  public StringPrinter(String value){
    this.value=value;
  }

  public StringPrinter(Integer value2){
    this.value2=value2;
  }

public void print(){
  System.out.println("The String value is  " + this.value);
 }

 

  public static void main(String[] args) {
  StringPrinter p1 =new StringPrinter("Hello") ;
  p1.print();


  
  }
}
