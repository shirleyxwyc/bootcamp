import java.util.Arrays;

/**
 * Case 1: [2,7,11,15] Target: 9 Ans: [0, 1] or [1, 0]
 * 
 * Case 2: [3,2,4] Target: 6 Ans: [1, 2] or [2, 1]
 *
 * Case 3: [3, 3] Target: 7 Ans: [-1, -1]
 */
public class JavaQuest12 {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] dataset = new int[] {2, 7, 11, 15};
     int[] answers = twoSum(dataset, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
     int[] answers2 = twoSum(new int[] {3, 2, 4}, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
     int[] answers3 = twoSum(new int[] {3, 3}, 7); // {3, 3} is the dataset, 7 is the target to sum
     System.out.println(Arrays.toString(answers));
     System.out.println(Arrays.toString(answers2));
     System.out.println(Arrays.toString(answers3));
    // !Case 1:
    int[] target9 = new int[2];
    for (int i = 0; i < dataset.length; i++) {
      for (int j = i + 1; j < dataset.length; j++) {
        if (dataset[i] + dataset[j] == 9) {
          target9[0] = i;
          target9[1] = j;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(target9));// [0, 1]
    // !Case 2:
    int[] dataset2 = new int[] {3, 2, 4};
    int[] target6 = new int[2];
    int targetsum6 = 6;
    for (int i = 0; i < dataset2.length; i++) {
      for (int j = i + 1; j < dataset2.length; j++) {
        if (dataset2[i] + dataset2[j] == targetsum6) {
          target6[0] = i;
          target6[1] = j;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(target6));// [1, 2]

    // !Case 3:
    int[] dataset3 = new int[] {3, 3};
    int[] target7 = new int[2];
    int targetsum7 = 7;
    boolean found7 = true;
    for (int i = 0; i < dataset3.length; i++) {
      for (int j = i + 1; j < dataset3.length; j++) {
        if (dataset3[i] + dataset3[j] != targetsum7) {
          target7[0] =-1;
          target7[1] = -1;
          found7 = false;
          break;
        }
      }
    }
 System.out.println(Arrays.toString(target7));
    


  }

  // Code a method here to return an array of two numbers that sum up to the
  // [2, 7]
  // public static int[] twoSum(int[] dataset, int target) {


}


