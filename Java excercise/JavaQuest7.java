public class JavaQuest7 {
  public static void main(String[] args) {
    
 // Declare a int array, with value 1 to 10
    int arr [] =new int[10];
    int sum = 0;

    // Write a loop to sum up all value in the int array
    // code here ...

    for(int i= 1; i<arr.length+1;i++) {
      sum = sum +i;
    }

    System.out.println("The sum is " + sum);//The sum is 55

  }
}
