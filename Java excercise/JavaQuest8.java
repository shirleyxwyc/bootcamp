public class JavaQuest8 {
  public static void main(String[] args) {

    // Write a loop to find the second max number.
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.

    // code here ...
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        secondMax = max;
        max = nums[i];
      } else if (nums[i] > secondMax && nums[i] != max) {
        secondMax = nums[i];
      }
    }

    System.out.println("max of nums[] =" + max);
    System.out.println("second max of nums[] =" + secondMax);

    int max2 = Integer.MIN_VALUE;
    int secondMax2 = Integer.MIN_VALUE;
    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] > max2) {
        secondMax2 = max2;
        max2 = nums2[i];
      } else if (nums2[i] > secondMax2 && nums2[i] != max2) {
        secondMax2 = nums2[i];
      }
    }
    System.out.println("second max of nums2[] =" + secondMax2);

    int max3 = Integer.MIN_VALUE;
    int secondMax3 = Integer.MIN_VALUE;
    for (int i = 0; i < nums3.length; i++) {
      if (nums3[i] > max3) {
        secondMax3 = max3;
        max3 = nums3[i];
      } else if (nums3[i] > secondMax3 && nums3[i] != max3) {
        secondMax3 = nums3[i];
      }
    }
    System.out.println("second max of nums3[] =" + secondMax3);


    int max4 = Integer.MIN_VALUE;
    int secondMax4 = Integer.MIN_VALUE;
    for (int i = 0; i < nums4.length; i++) {
      if (nums4[i] > max4) {
        secondMax4 = max4;
        max4 = nums4[i];
      } else if (nums4[i] > secondMax4 && nums4[i] != max4) {
        secondMax4 = nums4[i];
      }
    }
    System.out.println("second max of nums4[] =" + secondMax4);



  }
}

