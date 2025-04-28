import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    System.out.println(0.1+0.2);//double + double =0.30000000000000004

    //creating a BigDecimal object:
    BigDecimal bd1 = new BigDecimal("0.1");//!死记Approach 1-String Constructor,要有new 及""
    BigDecimal bd2 = BigDecimal.valueOf(0.2); //!死记 Approach 2(preferred)-use. valueOf(), no need to hard code
    //!creates a BigDecimal object with the double value 0.2 and assigns it to the variable bd2

    System.out.println("bd1= "+bd1);
    System.out.println("bd2= "+bd2);

    //bd1+bd2-->2.2 bd1 and bd2 are not primitives
    //!.add()
    BigDecimal bd3=bd1.add(bd2);
    System.out.println("bd3= "+bd3); //0.3

    //!.subtract

    BigDecimal bdSutract = bd3.subtract(bd1); //bd3-bd1=0.3-0.1
    System.out.println("bdSutract= "+bdSutract); //0.2

    //!multiply
    BigDecimal bdMultiply = bd1.multiply(bd2);
    System.out.println("bdMultiply =" +bdMultiply); //bd1 * bd2 =0.1*0.2=0.02

    //!divided
    BigDecimal bdDivided = bd3.divide(bd1);
    System.out.println("bdDivided= "+bdDivided); //3 bd3/bd1=0.3/0.1=3

    //10/3?? //! error???
    BigDecimal no10 =BigDecimal.valueOf(10.0);
    BigDecimal no3 =BigDecimal.valueOf(3.0);
    //BigDecimal noDivided = no10.divide(no3);//! Non-terminating decimal expansion
    //System.out.println("noDivided "+ noDivided);//! Non-terminating decimal expansion

    BigDecimal number10Over3 =BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3),2,RoundingMode.HALF_UP);
    System.out.println("number10Over3 is " + number10Over3); //3.33
    
    BigDecimal number10Over3Trial =BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3),1,RoundingMode.HALF_UP);
    System.out.println("number10Over3Trial is " + number10Over3Trial); //3.3
    //!HALF_UP:5down6up

    BigDecimal bd9 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0),2,RoundingMode.HALF_DOWN);
    System.out.println("bd9= " +bd9); //4.25 (sameHALF_UP or HALF_DOWN both gets 4.25 same answer)
    BigDecimal bd10 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0),1,RoundingMode.HALF_DOWN);
    System.out.println("bd10= " +bd10); //1decimalplace+HALF_UP-->4.3 //1decimalplace+HALF_DOWN-->4.2
    //pow() can only store int.

    BigDecimal source = BigDecimal.valueOf(2);
    double result = source.doubleValue();//2.0
    long result2 = source.longValue();//2L
    float result3 = source.floatValue();//2.0f
    int result4 = source.intValue();//2
    String result5 = source.toString(); //"2"
    System.out.println("result = "+result);
    System.out.println("result2 = "+result2);
    System.out.println("result3 = "+result3);
    System.out.println("result4 = "+result4);
    System.out.println("result5 = "+result5);

    BigDecimal x1 = BigDecimal.valueOf(2.7);
    double result6 = x1.doubleValue(); //2.7
    long result7 = x1.longValue();//2L
    float result8 = x1.floatValue();//2.7f
    int result9 =x1.intValue();//2
    String result10 = x1.toString();//"2.7"
    System.out.println("result6 = "+result6);
    System.out.println("result7 = "+result7);
    System.out.println("result8 = "+result8);
    System.out.println("result9 = "+result9);
    System.out.println("result10 = "+result10);



//e.g bigDecimals[i].floatValue(); refer to DemoForLoop.java




    //rounding? 3.45-->3.4(HALF_DOWN)? 3.45-->3.5(HALF_UP)












  }
}
