import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEachLoop {



  public static void main(String[] args) {

    // Exercise 1 :For each loop
    String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
    for (String x : fruits) {
      System.out.println(x);
    }

    // Exercise 2 :find the longest string
    String[] names = {"Alice", "Jonathan", "Elizabeth", "Max", "Christopher"};
    String longestName = "";
    for (String x : names) {
      if (x.length() >= longestName.length())
        longestName = x;
    }
    System.out.println(longestName);
  


  // Exercise 3 :Sum of Elements in an array.
  int[] numbers = new int[] {1, 2, 3, 4, 5};
  int sum = 0;

  for (int x : numbers) {
    sum += x; 
}

System.out.println("for each loop sum: " + sum);


//Exercise 4: Reverse Array
int[] reverseNumbers = new int[numbers.length];
for(int i=0; i<numbers.length;i++){
  reverseNumbers[numbers.length-1-i]= numbers[i];
}
for(int rn :reverseNumbers){
System.out.println("for each loop rn: " + rn +" ");
}

//Exercise 5:  print all element in a 2D array using for each loop

  int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  //1st Iteration of Outer Loop is {1, 2, 3} --> Inner loop prints 1, 2, 3.
  //2nd Iteration of Outer Loop: row is {4, 5, 6}-->Inner loop prints 4, 5, 6.
  //3rd Iteration of Outer Loop:row is {7, 8, 9} -->Inner loop prints 7, 8, 9.

  for (int[] row : matrix){
    for(int element : row){
      System.out.print(element +" ");  //1 2 3 4 5 6 7 8 9
    }
  }
  System.out.println();

//Exercise 6: // Problem Solving: counting
    int[] arr = new int[] {-1, 3, -1, 3, 3, 8};

    // HashMap
    // Output:
    // there are 2 of -1.
    // there are 3 of 3.
    // there are 1 of 8.

    HashMap<Integer, Integer> intMap =new HashMap<>();
    for(int x : arr){
      if(intMap.get(x)==null){
        intMap.put(x,1);
      }else{
        intMap.put(x,intMap.get(x)+1);
      }
    }
for(Map.Entry<Integer,Integer> entry : intMap.entrySet()){
  System.out.println("there are "+ entry.getValue() + " of " +entry.getKey() );
}
//there are 2 of -1 
//there are 3 of 3 
//there are 1 of 8

}
}

