public class Day3MathOperator {
  public static void main(String[] args) {
    //+1
    int x = 3;
    x = x + 1;
    x += 1;
    x++;
    ++x;
    System.out.println("x="+x); //x=7

    //-1
    int y = 5;
    y = y - 1;
    y-= 1;
    y--;
    --y;
    System.out.println("y="+y); //y=1

    // + or - non 1 number
    int z = 10;
    z = z + 2;
    z += 2;
    z = z - 3;
    z -= 3;
    System.out.println("z="+z); //z=8

    // * or /
    int a = 6;
    a = a * 2;
    a *= 2;
    a = a / 2;
    a /= 2;
    System.out.println("a="+a);//a=6

    //!Pre-increment ++u, and Post-increment u++
    
    int u =5;
    int preIncrement = ++u;
    System.out.println("u =" +u); //6
    System.out.println("preIncrement =" +preIncrement);//6

    int v =5;
    int postIncrement = v++;
    System.out.println("v =" +v); //v=6
    System.out.println("postIncrement =" +postIncrement);//postIncrement =5

    //!Challenge
    int e= 3;
    int f = (e++ + 3) * e++; 
    //Step 1: (e++ +3) ->(3+3)=6,（）執行後e自增， e變成3+1=4,e=4
    //Step 2:6*e=6*4=24, 6*4執行後e自增,e變成5+1=5,e=5
    System.out.println(f);//24
    System.out.println(e);//5

    int h = 10;
    int j = 20;
    int result2 = ++h + j++;
    System.out.println("result2 = "+ result2); //result2=11+20=31
    System.out.println("h = "+h); //h=11
    System.out.println("j = "+j);//j=21



    //!Logical Operator eavaluate from left to right:
    boolean result = true && false || true;
    System.out.println(result);//true



    // Count number of even number between 0 - 9, 0,2,4,6,8--> there are 5 Even Numbers between 0-9.
    int countEven = 0;
    for(int i = 0; i <= 9; i++){
      if(i % 2 == 0){countEven++;
      }
    }
    System.out.println("there are "+countEven +" Even Numbers between 0-9.");
    
    //count if 10 is an Even number
    int countOnce = 0;
    int s = 10; 
    if(s % 2 == 0){ //10%2=0, true-->countOnce+1-->0+1=1
      countOnce = countOnce + 1; //or countOnce++;
    }
    System.out.println("countOnce=" + countOnce); //countOnce=1

    // Count number of odd number between 0 - 9, 1,3,5,7,9 //! don't forget to include 9, i<=9
    int countOdd = 0;
    for(int i = 0; i <= 9; i++) {//counting from 0 to 9(when i reached the i<=9 condition then stop counting)
      if(i % 2 != 0) {// at the same time 1%2 != 0(when i is an odd no, countOdd variable will be counted and accumulated.until when i reached the i<=9 condition then stop counting as well)
        countOdd++;
              }
    }
    System.out.println("there are "+countOdd +" Odd Numbers between 0-9."); // print the final countOdd variable outside the for block code{}.


//! comparing largest or smallest in a range of numbers, the best way is to declare a int variable min or max, and then use the min or max to compare other numbers    
// Larger Number between 2 numbers
int Num1 = 10;
int Num2 = 12;
int max = Num1;
if(max>Num2){ //false as 10>12 is false
  max=Num1; //this will not proceed, go to else
}else { //max<Num2, so Num2 is larger. max = Num2 , max = 12
  max = Num2;
}
System.out.println("the Larger number is "+max);
//the Larger number is 12

// Largest Number between 3 numbers

int No1 = 10;
int No2 = 12;
int No3 = 13;
int maxNo = No1; //! initial assumption and use that maxNo1 to compare other numbers, pick the larger no and update that MaxNo1 each time.
if(maxNo < No2) {// since No1=10 is assigned to maxNo=10<No2 is not true
maxNo = No2;
}if(maxNo < No3){
  maxNo = No3;
}
System.out.println("the largest number is "+ maxNo); //13

    // Find Min. number
    // 40, 32, -19
    int Num4 = 40;
    int Num5 = 32;
    int Num6 = -19;
    int Min = Num4;//! initial assumption and use that Min to compare other numbers, pick the smaller no and update that Min each time.
    if(Min > Num5) {
      Min=Num5;
    }if(Min > Num6) {
      Min = Num6;
    }
System.out.println("the smallest number is "+ Min); //-19
  }
}


