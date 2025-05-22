import java.util.function.Consumer;

public class MathTest {
  
  public static void main(String[] args) {
    //.operate is the abstrat interface of .add() .substration() .multiply() .divide()
    //addtion substraction are the noun..
    //one time use at runtime 
    MathOperation addition =(x,y)-> x+y;
    System.out.println(addition.operate(7, 10));//17

    MathOperation substration =(x,y)-> x-y;
    System.out.println(substration.operate(7, 10));//-3

    MathOperation multipy =(x,y)-> x*y;
    System.out.println(multipy.operate(7, 10)); //70

    MathOperation division =(x,y)-> x/y;
    System.out.println(division.operate(7, 10)); //0

    MathOperation rectangularArea = (length, width) -> length * width;
    System.out.println(rectangularArea.operate(7, 10)); //70

    MathOperation pythagorean = (a,b) -> (int)Math.sqrt(Math.pow(a, 2.0)+Math.pow(b, 2.0));
    System.out.println(pythagorean.operate(3, 4)); //5

//!for-each loop lambda
Consumer <Child> printName() = child -> System.out.println("Child:" +child.getName()
childs.forEach(child->{
  System.out.println("Child:" +child.getName());
});

    
  }
}
