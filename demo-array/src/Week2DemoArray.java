import java.util.Arrays;

public class Week2DemoArray {
  public static void main(String[] args) {
    

    // array []
    // right hand side -> creating an array with size 3.
    // left hand side -> assign int array object to int array type (variable)
    int arr [] = new int [3]; //creating an array of int with a length of 3.index of array is 0,1,2
    arr[0] = 3; 
    arr[1] = 4;
    arr[2] = -7;

    System.out.println("length of array arr is "+ arr.length); //finding length of array arr //3

    for(int i=0; i<arr.length;i++) { 
      System.out.println(arr[i]); //loop i from 0 to 3, index of array change from 0-3 at the same time, print the current value inside of box 
    }  //3,4,-7

    // Question: int array with size 5.
    // 10, 7, 4, -100, 6
    int[] arr2 =new int[5];
    arr2[0]=10;
    arr2[1]=7;
    arr2[2]=4;
    arr2[3]=-100;
    arr2[4]=6;
    

    //Question: double array with size 4
    //assign 4 double values into the array
    double [] arr3 = new double [4];
    arr3 [0]= -4.2;
    arr3 [1]= 1.1;
    arr3 [2]= 2.2;
    arr3 [3]= 3.3;

    //read
    System.out.println("arr3[0] is "+ arr3[0]);//-4.2
    System.out.println("arr3[3] is "+ arr3[3]);//3.3

    double amount =99.9;
    arr3[3] = amount;
    System.out.println("arr3[3] is "+ arr3[3]); // 99.9. assign 99.9 to boxD[3], box[D] change from 3.3 to 99.9
    
    //String array
    //size 3, with 3 string values
    String s1[] = new String[3];
    s1[0]="Shirley";
    s1[1]="Peter";
    s1[2]="Alice";
    System.out.println("s1[2] is " + s1[2]);

    // double array, for loop + sysout print out values
    //1. create an array of double with size of 6
    double amounts [] = new double [6];
    amounts [0]= 10.9;
    amounts [3]= 14.1;
    amounts [5]= 99.9;
    for(int i=0; i<amounts.length;i++){
      System.out.println("result: "+ amounts[i]); //print out array amount [] index from 0-5
      System.out.println(Arrays.toString(amounts));//[10.9, 0.0, 0.0, 14.1, 0.0, 99.9]
    } //!result: 10.9; result: 0.0; result: 0.0; result: 14.1, result: 0.0; result: 99.9;
      //!defalut 如果无放value, value inside box of the array is default to 0.0 
      //!therefore, amounts[1]=0.0,amounts[2]=0.0,amounts[4]=0.0
      

    // add 1.5 to all array values
    for(int i =0; i<amounts.length;i++) {
      amounts[i]+=1.5; // amounts[i]is double value
      System.out.println("new value inside each box after adding 1.5 is "+amounts[i]);
    } //new result: 12.4; new result: 1.5; new result: 1.5;new result: 15.6,new result:1.5;new result: 104.4;

    // !for + if
    // print out those values > 100
    for(int i=0; i<amounts.length; i++) {
      if(amounts[i]>100) {
        System.out.println("value>100 is "+amounts[i]); //101.4
      }
    }
    
    // !for + if + continue
    // print out those values <= 100
    for (int i =0; i<amounts.length; i++) {
      if(amounts[i]<=100) { 
        continue; //!if(amounts[i]<=100) is true, continue will be triggered. for loop will break and loop back to loop the for loop again.Values <=100 are ignored and excluded. until value >100 (false) -->go down to print
      }
      System.out.println(amounts[i]); //101.4 //!Values >100 are printed.
    }
    //!the purpose of contine:
    //! If the current element (e.g., amounts[i]) is less than or equal to 100, 
    //! "the continue;" statement is executed. 
    //!This means the rest of the loop body (the System.out.println statement) is skipped for this particular iteration.
    //!The System.out.println statement is outside the if block and will only execute for values greater than 100.
    //!This prints all values in the amounts array that are greater than 100. 
    //!Values less than or equal to 100 are ignored.


    // int array
    // Find even number, and then print out "Age=x"
    int[] ages = new int[4];
    ages[0] = 19;
    ages[1] = 14;
    ages[2] = 10;
    ages[3] = 65;
    for (int i=0; i<ages.length; i++) {
      if(ages[i]%2==0) {
        System.out.println("Age = "+ ages[i]);
      }
    }

    // array + for + if
    // find the max value in the array
    int [] numbers = new int[6]; 
    numbers [0] = -1;
    numbers [1] = -10;
    numbers [2] = -2;
    numbers [3] = -3;
    numbers [4] = -10;
    numbers [5] = -100;

    int max = Integer.MIN_VALUE; //!Integer.MIN_VALUE is equal to -2,147,483,648 (or -2^31).which is a predefined constant in the Integer class that represents the minimum value an int can hold in Java. 
    for (int i=0; i<numbers.length; i++) {
      if(numbers[i]>max) {
        max=numbers[i];
      }
    }
    System.out.println("the max value in the array is "+max);

    // find min. salary
    int salaries [] = new int [4];
    salaries [0] = 14000;
    salaries [1] = 19000;
    salaries [2] = 21000;
    salaries [3] = 34000;

    int min = Integer.MAX_VALUE; //!Integer.MAX_VALUE is equal to 2,147,483,648 (or 2^31).
    for(int i = 0; i<salaries.length; i++) {
      if(salaries[i] < min) {
        min = salaries[i] ;
      }
    }
    System.out.println("the minium salary is "+min); //the minium salary is 14000


// John, Steven, Eric
String s2 [] = new String[3];
s2[0] ="John";
s2[1] ="Steven";
s2[2] ="Eric";
//s2[i] is a string, need to convert to int
//calculate string length--> s2[i].length()
//find the longest String

String longestName= ""; //!"" represents empty String

for(int i=0; i<s2.length;i++) {
  if(s2[i].length()>longestName.length()){
    longestName = s2[i];
  }
}
System.out.println("the longest name is "+ longestName); //Steven

// nums is an array, a set of int values with size of 4
int nums [] = new int[4];
System.out.println("length of the array is " +nums.length); //4

    nums[0] = 9;
    nums[1] = 8;
    nums[2] = 7;
    nums[3] = 10;
    // Print out the first even number //! use break

    for(int i =0; i<nums.length; i++) {
      if(nums[i] % 2==0) {
        System.out.println("the first even number is " + nums[i]); //8
        break; //! exit for loop
      }
    }
    

    //! Please study from below : 
    // Create a char array with length of 5, char[i] will store many 'l' and 'r'
    // l -> left
    // r -> right
     // l -> score + 3
    // r -> score - 2
    //finding total scores
    char [] directions = new char [5];
    directions[0] = 'l'; //score + 3
    directions[1] = 'l'; //score + 3
    directions[2] = 'r'; //score - 2
    directions[3] = 'l'; //score + 3
    directions[4] = 'r'; //score - 2

    int score = 0;
    for (int i =0; i<directions.length; i++) {
      if(directions[i] =='l'){
        score +=3;
      }else{
        score-=2;
      }
    }
    System.out.println("The Total Score is "+score); //5

 // Swapping
 int w1 = 2;
 int w2 = 3;
 int backUp = w1;
 w1 =w2;
 w2=backUp;
 System.out.println("W1 = "+ w1);//3
 System.out.println("W2 = "+ w2);//2

//! study this again when you are free 
 int[] marksix = new int[6];
 marksix[0] = 5;
 marksix[1] = 20;
 marksix[2] = 47;
 marksix[3] = 43;
 marksix[4] = 39;
 marksix[5] = 2;
 for (int i = 0; i < marksix.length; i++) {
   System.out.println(marksix[i]);
 }
 // 5 20 47 43 39 2
 // ! i = 0, j = 0,1,2,3,4 (marksix[4+1] > marksize[4])
 // round 1: 5 vs 20 (20 > 5, no swap) -> 5 20 47 43 39 3
 // round 2: 20 vs 47 (47 > 20, no swap) -> 5 20 47 43 39 3
 // round 3: 47 vs 43 (43 < 47, swap) -> 5 20 43 47 39 3
 // round 4: 47 vs 39 (39 < 47, swap) -> 5 20 43 39 47 3
 // round 5: 47 vs 3 (3 < 47, swap) -> 5 20 43 39 3 47

 // ! i = 1
 // round 1: 5 vs 20 (20 > 5, no swap) -> 5 20 43 39 3 47
 // ....

 // Finally -> 2 5 20 39 43 47
 // ! Sorting (5 x 5)
 // Swapping
 int temp = -1;
 for (int i = 0; i < marksix.length - 1; i++) { // i = 0 (how many numbers I need to swap)
   for (int j = 0; j < marksix.length - i - 1; j++) { // j=0,1,2,3,4 | j=0,1,2,3
     if (marksix[j + 1] < marksix[j]) {
       temp = marksix[j + 1];
       marksix[j + 1] = marksix[j];
       marksix[j] = temp;
     }
   }
 }
 for (int i = 0; i < marksix.length; i++) {
   System.out.println(marksix[i]);
 }

     // counting
     // count the number of 'p'
     char [] chs = new char[] {'o', 'p', 'a', 'p'};
     int countNumber =0;
     for (int i =0; i < chs.length; i++) {
      if(chs[i] == 'p') {
        countNumber++;
      }
     }
     System.out.println("number of 'p' in array chr is " + countNumber);

    
    //! 有多少character, 出现次数 > 1 -> 'a' and 'b'
    // 2
    char[] chs2 = new char[] {'a', 'b', 'a', 'b', 'z'};
    int[] counts = new int[26]; // 0-25// but i havent declare the elements inside count[i], so count[i] default to be 0.
        for (int i = 0; i < chs2.length; i++) {
      int index = chs2[i] - 'a';
      counts[index]++;
    }
    System.out.println(counts[0]); //appeared 2 times.default to be 0 --> 1-->2
    System.out.println(counts[1]);//appeared 2 times.default to be 0 --> 1-->2
    System.out.println(counts[2]);//default to be 0 
    System.out.println(counts[25]);//appeared 1 time. default to be 0 --> 1












  }
  
}
