import java.math.BigDecimal;
import java.util.Arrays;

public class ClassExerciseLoop {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for (int i = 0; i < 6; i++) {
      System.out.println("Q1 : hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for (int i = 0; i < 5; i++) {
      System.out.print(i);
      if (i < 4) {
        System.out.print(","); 
      }
    }
    System.out.println("");

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for (int i = 0; i < 21; i++) {
      if (i > 1 && i % 2 == 0) {
        System.out.println("Q3 Even numbers between 2 and 20 is " + i);
      }
    }

    // 4. Print the numbers between 1-100, which can be divided by 3 or 5
    for (int i = 0; i < 101; i++) {
      if (i > 0 && i <= 100) {
        if (i % 3 == 0 || i % 5 == 0) {
          System.out.println(
              "Q4 numbers between 1-100, which can be divided by 3 or 5 is "
                  + i);
        }
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sum = 0;
    for (int i = 0; i < 16; i++) {
      sum = sum + i;
    }
    System.out.println("Q5: sum of numbers between 0 and 15 is" + sum);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum

    int sumOdd = 0;
    int sumEven = 0;
    int productOfBoth = 0;
    for (int i = 0; i < 11; i++) {
      if (i >= 0 && i <= 10) {
        if (i % 2 == 0) {
          sumOdd = sumOdd + i;
        }
      }
    }
    System.out.println(sumOdd);
    for (int i = 0; i < 11; i++) {
      if (i >= 0 && i <= 10) {
        if (i % 2 != 0)
          sumEven = sumEven + i;
      }
    }
    System.out.println(sumEven);
    System.out.println("Q6. " + sumOdd * sumEven);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    int countD = 0;
    for (int i = 0; i < str7.length(); i++) {
      if (str7.charAt(i) == 'd') {
        countD++;
      }
    }
    if (countD >= 1) {
      System.out.println("Q7 . d is found.");
    } else {
      System.out.println("Q7 . d is not found.");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int countP = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == 'p') {
        countP++;
      }
    }
    System.out.println("Q9.count= " + countP);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};

    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('x', 'k');
    }
    System.out.println("Q10 " + Arrays.toString(arr10));


    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if

    char x = 'A';
    int convertA = x; // 65
    System.out.println("convertA is " + convertA);

    String s11 = "kLKloOOu";
    int countUpperCase = 0;
    for (int i = 0; i < s11.length(); i++) {
      if ('a' - s11.charAt(i) <= 32 && 'a' - s11.charAt(i) >= 7) {
        countUpperCase++;
      }
    }
    System.out.println("Q11. " + countUpperCase);


    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop //!use switch and break
    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score

    // Approach 1:
    int totalScore = 0;

    String s13 = "lrlaudbucp";
    // System.out.println(s13.length()); //10
    for (int i = 0; i < s13.length(); i++) {
      switch (s13.charAt(i)) {
        case 'l':
          totalScore += 1;
          break; // break switch
        case 'r':
          totalScore += 3;
          break;
        case 'd':
          totalScore += 2;
          break;
        case 'u':
          totalScore += 4;
          break;
        default:
          totalScore -= 1;
          break;
      }
      // Approach 2:
      // if (s13.charAt(i) == 'l') {
      // totalScore += 1;
      // } else if (s13.charAt(i) == 'r') {
      // totalScore += 3;
      // } else if (s13.charAt(i) == 'd') {
      // totalScore += 2;
      // } else if (s13.charAt(i) == 'u') {
      // totalScore += 4;
      // } else {
      // totalScore -= 1;
      // }
    }
    System.out.println("Q13. " + totalScore); // 11

    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1L;
    arr14[1] = 4L;
    arr14[2] = 9L;
    arr14[3] = -4L;

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long max = Integer.MIN_VALUE;
    long min = Integer.MAX_VALUE;

    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] > max) {
        max = arr14[i];
      } else if (arr14[i] < min) {
        min = arr14[i];
      }
    }
    System.out.println("max " + max);
    System.out.println("min " + min);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6

    float arr16[] = new float[] {0.2f, 0.3f, 0.6f};


    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal

    for (int i = 0; i < arr16.length; i++) {
      arr16[i] = BigDecimal.valueOf(arr16[i]).add(BigDecimal.valueOf(0.1f))
          .floatValue();
    }
    System.out.println(Arrays.toString(arr16));

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    int countTarget = 0;
    for (int i = 0; i < arr18.length; i++) {
      if (arr18[i].equals(target)) {
        countTarget++;
      }
    }
    System.out.println("Q18. count name = " + countTarget);

        // 19. swap the max digit and min digit 
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";


    // find min and max indices
    int minNum = Integer.MAX_VALUE; // 2147483647
    int maxNum = Integer.MIN_VALUE; // -2147483647
    System.out.println(minNum);
    int minIndex = 0;
    int maxIndex = 0;

    int[] arr19 = new int[5];
    arr19[0] = 4;
    arr19[1] = 0;
    arr19[2] = 2;
    arr19[3] = 8;
    arr19[4] = 9;

    System.out.println(Arrays.toString(arr19));//[4, 0, 2, 8, 9]

    for (int i = 0; i < arr19.length; i++) {
      if (arr19[i] > maxNum) {
        maxNum = arr19[i];
        maxIndex = i;
      }
    }
    System.out.println("max number =" + maxNum);// 9
    System.out.println("max idex = " + maxIndex);// 4

    for (int i = 0; i < arr19.length; i++) {
      if (arr19[i] < minNum) {
        minNum = arr19[i];
        minIndex = i;
      }
    }
    System.out.println("minNUm = " + minNum); //0
    System.out.println("minIndex = " + minIndex);//1

    int temp =0;
    System.out.println(arr19[maxIndex]);
    temp = arr19[maxIndex];
    arr19[maxIndex] = arr19[minIndex];
    arr19[minIndex]=temp;

    System.out.println(Arrays.toString(arr19));//[4, 9, 2, 8, 0]


    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 =
        new String[] {"python", "array", "programming", "java", "bootcamp"};

    String longestString = ""; // empty string
    // i=0; 0Vs1
    // i=1; 1Vs2
    // i=2; 2Vs3
    // i=3; 3Vs4
    for (int i = 0; i < arr20.length - 1; i++) {
      if (arr20[i].length() > arr20[i + 1].length()) {
        longestString = arr20[i];
      }
    }
    System.out.println("longest= " + longestString);//longest= programming

  }
}




