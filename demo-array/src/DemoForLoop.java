import java.math.BigDecimal;
import java.util.Arrays;

public class DemoForLoop {
  public static void main(String[] args) {
    //array + for loop
    //find max
    int[]arr = new int[] {100,-20,200,17}; //! don't use int max= 0 when there is negative values to compare. use Integer.MIN_VALUE 
    //Approach 1:
    int max = Integer.MIN_VALUE; //!(-2^31)
    for (int i=0; i<arr.length;i++) {
      if(arr[i]>max) {
        max=arr[i];
      }
    }
    System.out.println("the max number is " +max);

    //Approach 2:
    max = Integer.MIN_VALUE;
    for (int i=0; i<arr.length;i++) {
      max=Math.max(arr[i],max);
      }
    System.out.println("the max number is " +max);

    //equals ; .length(); charAT()
    //convert from String to char array
    char[] chs = "hello".toCharArray();
    System.out.println(Arrays.toString(chs)); //[h,e,l,l,o]

//convert l to x [h,e,l,l,o]-->[h,e,x,x,o] and a to b
      
    for (int i= 0; i<chs.length; i++) {
      if (chs[i] =='l') {
        chs[i]='x';
      }
    }
System.out.println(Arrays.toString(chs));//[h,e,x,x,o]

//!Arrays.toString()
//!convert from char[] to String
System.out.println(String.valueOf(chs)); //hexxo
int [] nums = new int[]{1,2,3};
System.out.println(String.valueOf(nums));//[I@31befd9f
System.out.println(Arrays.toString(nums));//[1, 2, 3]

int [] nums2 = new int[4];
System.out.println(String.valueOf(nums2));//[I@1c20c684
System.out.println(Arrays.toString(nums2));//[0, 0, 0, 0]

//!replace 
System.out.println("hello".replace('l', 'x'));//hexxo

//!"Hello".equalsIgnoreCase("hello")
//!"Hello".equals("Hello")
System.out.println("Hello".equals("hello")); //false
System.out.println("Hello".equalsIgnoreCase("hello")); //true

double[] arr1 = new double[] {0.2,0.5,1.9};
// add 0.1
//answer : {0.3,0.6,2.0}

for (int i=0; i<arr1.length; i++) {
  BigDecimal bg1 = BigDecimal.valueOf(arr1[i]).add(BigDecimal.valueOf(0.1));
  arr1[i] = bg1.doubleValue();
}
System.out.println(Arrays.toString(arr1));// [0.3, 0.6, 2.0] --> //!this is a String as a whole

//BigDecimal can store something so it can be an array
BigDecimal[] bd1 = new BigDecimal[3];
bd1[0] =BigDecimal.valueOf(0.2);
bd1[1] =BigDecimal.valueOf(0.4);
bd1[2] =BigDecimal.valueOf(0.6);
System.out.println(Arrays.toString(bd1)); //[0.2, 0.4, 0.6]



float [] fArr = new float[bd1.length];
for(int i=0; i<bd1.length; i++){
  fArr[i]=bd1[i].floatValue();
}
System.out.println(Arrays.toString(fArr));//[0.2, 0.4, 0.6]







  }
}
