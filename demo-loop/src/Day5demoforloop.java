public class Day5demoforloop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    System.out.println(x); // 16

    int base = 2;
    int value = 2;
    for (int i = 0; i < 3; i++) {
      value = value * base;
    }
    System.out.println(value);

    // base = ?, + 8 (10 times)

    int num1 = 9;
    int num2 = 17;
    int max = -1;
    if (num1 > num2) {
      max = num1;
    } else {
      max = num2;
    }
    System.out.println(max);

    // 0 - 100, Find the largest odd number, which is < 90
    // for
    int maxOdd = -1;
    for (int i = 0; i < 101; i++) {
      if (i % 2 == 1 && i < 90 && i > maxOdd) {
        maxOdd = i;
      }
    }
    System.out.println(maxOdd); // 89

    // 0 - 20, sum up all even numbers
    // 0 + 2 + 4...+ 20
    int sum = 0;
    for (int i = 0; i < 21; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);

    // 0 - 30, if < 20, sum up odd numbers, if >= 20, sum up even numbers
    // result
    int box = 0;
    for (int i = 0; i < 31; i++) {
      if (i < 20) {
        if (i % 2 == 1) {
          box += i;
        }
      } else {
        if (i % 2 == 0) {
          box += i;
        }
      }
    }
    System.out.println(box); // 250

    // Searching
    String s1 = "welcome to bootcamp.";
    // 1. Find the number of 'o'
    // for + charAt()
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == 'o') {
        count++;
      }
    }
    System.out.println(count);

    // ! for + continue
    // Approach 1: simple if
    for (int i = 0; i < 3; i++) {
      if (i % 2 == 0) {
        System.out.println(i); // 0,2
      }
    }
    // Approach 2: continue
    for (int i = 0; i < 3; i++) {
      if (i % 2 == 1) {
        continue; // skip the rest of code, goes to i++
      }
      System.out.println(i); // 0,2
    }

    // ! for + break
    // Approach 1: simple if
    for (int i = 0; i < 3; i++) {
      if (i < 2) {
        System.out.println(i); // 0,1
      }
    }
    // Approach 2: break
    for (int i = 0; i < 3; i++) {
      if (i >= 2) {
        break; // skip the rest of code, goes to i++
      }
      System.out.println(i); // 0,1
    }

//Question: 
//1.sum up 5-15 ->result
//2.product of 16-20 ->result2 P=16×17×18×19×20
//use single for loop

int total = 0;
int product = 1;

for (int i = 0; i<21;i++){
  if(i>=5 && i<21) {
    total = total + i;
    continue;
  }
  if(i >=16 && i <=20) {
    product *= product;
  }
}


System.out.println("sum up 5-15 is " + total);
System.out.println("product of 16-20 is " + product);

    //!Nested loop
    //i=0,j=0,1 print hello 2 times
    //i=0,j=0,1 print hello 2 times
    //i=0,j=0,1 print hello 2 times
    // total print hello for 6 times
    // can think as i = x row and j is y column

    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 2; j++) {
        System.out.println("i=" + i+ ", j="+j);
      }
    }

  //i=0, j=0
  //i=0, j=1 
  //i=1, j=0
  //i=1, j=1
  //i=2, j=0
  //i=2, j=1

  for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
      for(int k = 0; k < 2; k++){
      System.out.println("i=" + i+ ", j="+j+", k="+k);

      }
    }
  }


















  }
}

