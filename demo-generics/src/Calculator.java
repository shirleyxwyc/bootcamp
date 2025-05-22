public class Calculator {
  private int value1;
  private int value2;

  public Calculator(int value1, int value2){
    this.value1=value1;
    this.value2=value2;
  }

  public void setValue2(int value2){
this.value2=value2;
  }
  
public int sum2 (){
  return this.value1 + this.value2;
}

public static int sum(int x, int y){
  return x+y;
}

  public static void main(String[] args) {
    Calculator c1 = new Calculator(1, 2);
    System.out.println(c1.sum2());

    System.out.println(sum(1, 2));
    
    c1.setValue2(10);
    //Object c1 holds value 1=1
    System.out.println(c1.sum2());//11



  }


}
