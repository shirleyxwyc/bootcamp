import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {


  public static void main(String[] args) {
    // Fuction f(x)=y
    // y=x+1

    // ! １入１出 formular
    // Funtion<In type, out type> input x
    // Function source code:public interface Function<T, R>, R apply(T t);
    Function<Integer, Integer> y = x -> x + 1; // formular
    System.out.println(y.apply(10));// 11

    Function<Integer, Integer> discount10percentoff = x -> (int) (x * 0.9); // formular
    System.out.println(discount10percentoff.apply(10));// 9

    Function<Integer, Double> circleArea =
        radius -> Math.pow(radius, 2.0) * Math.PI; // formular
    System.out.println(circleArea.apply(3));// 28.274333882308138

    // !"cleanName" is the Object created by lambda expression has no attributes
    // !lambda expression focus on the method implementation only
    // ! different from static method as static method need to be held by any Class
    // !while lambda expression only needs to be placed in any main

    Function<String, String> cleanName = name -> name.trim().toUpperCase();
    System.out.println(cleanName.apply(" vincent Lau   "));// VINCENT LAU


    // !２入１出 formular
    // BiFunction<input, intput, output>
    BiFunction<String, String, String> concatOperation =
        (s1, s2) -> s1.concat(s2);
    System.out.println(concatOperation.apply("hello", " world"));// hello world


    BiFunction<LocalDate, LocalDate, Integer> year =
        (d1, d2) -> d2.getYear() - d1.getYear();
    System.out.println(
        year.apply(LocalDate.of(2020, 1, 1), LocalDate.of(2025, 5, 1))); // 5


    // ! Predicate-
    Predicate<Integer> elderlyFormula = age -> age > 65;// Formular, no variable @FunctionalInterface public interface Predicate<T> { boolean test(T t);
    System.out.println(elderlyFormula.test(70));// true
    System.out.println(elderlyFormula.test(60));// false

    //!BiPredicate return boolean
    BiPredicate<String,ArrayList<String>> containString = (targetName, nameList) ->{
      return nameList.contains(targetName); 
    };
    ArrayList<String> name = new ArrayList<>();
    name.add("Peter");
    //System.out.println(containString);

    // !Consumer 有入無出(void method)->no return
    Consumer<Cat> catConsumer = (cat) -> {
      cat.eat();
      cat.sleep();
      System.out.println("hello");
    }; // see below static method

    //! Bi Consumer ２入無出(void method)->no return , stout is footprint only. it is not necessary
    BiConsumer <Integer, Integer> addition = (a,b) -> System.out.println(a+b);
    BiConsumer <Integer, Integer> addition2 = (a,b) -> {
      System.out.println(a);
      System.out.println(b);
      System.out.println(a+b);
    };
    addition.accept(3, 7);
     addition2.accept(3, 7);


     //UnaryOperator(1入１出，相同出入ｔｙｐｅ)
UnaryOperator<String> stringFunction2=s->s+"hello";
System.out.println(stringFunction2.apply("lucas"));//lucashello

BinaryOperator<String> stringFunction3=(s1,s2)->s1+s2; //same as BiFunction<String, String, String>
System.out.println(stringFunction3.apply("abc", "def"));//abcdef

// @FunctionalInterface  public interface BiFunction<T, U, R> R apply(T t, U u);



    // ！無入有出
    Supplier<Integer> markSixNumber = () -> {
      return new Random().nextInt(49) + 1;// 1-49
    };
    System.out.println(markSixNumber.get());
    System.out.println(markSixNumber.get());
    System.out.println(markSixNumber.get());
  }



  // Static methods Outside Main:

  // !shares to other class
  // DemoLamda.generateMarkSix()
  public static Integer generateMarkSix() {
    return new Random().nextInt(49) + 1;
  }

  // same as below:
  public static void eat(Cat cat) {
    cat.eat();
    cat.sleep();
  }

}
