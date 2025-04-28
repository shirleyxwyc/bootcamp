public class Day9DemoForloop {
    public static void main(String[] args) {
        int x = 2;
        x = x * 2;
        x = x * 2;
        x = x * 2;
        System.out.println("x = "+x); // x = 16
        
        //2^3=16
        int base =2;
        int value=2;
        for(int i = 0; i<3; i++) {
            value = value * base; //!same as value *=base;
        }
        System.out.println("value= "+value);//value= 16
        System.out.println("base = "+base); //base = 2

         // base = ?, + 8 (10 times)
         for(int i=0; i<10;i++) {
            base=base+8;
         }
         System.out.println("base = "+base);//base = 82


        int num1 = 9;
        int num2 =17;
        int max =num1;
        if(max<num2){
            max=num2;
        }else{
            max=num1;
        }
        System.out.println("maxium no is" +max);

        //0-100, find the largest odd number, which is < 90-->89
        int maxOdd = -1;
        for(int i=0; i<=100; i++) {
            if(i % 2 == 1 && i<90 && i>maxOdd) {
                maxOdd=i;                    
            }
               } 
               System.out.println("the max odd less than 90 is " +maxOdd);
    
    //0-20, sum up all even numbers
    //0+2+4..20
    int sum = 0;
        for(int i=0; i<=20; i++) {
        if(i%2== 0){
            sum = sum + i;
        }
    }
    System.out.println("sum = "+sum);

    //0-30, if<20, sum up odd numbers, if>=20, sum up even numbers

    int box = 0;
    for(int i=0 ; i <= 30; i++) {
        if(i<20){
            if(i%2==1){
            box = box + i;
            }
    }else{ //>=20
        if(i%2==0){
            box = box + i;
    }
}
    }
    System.out.println("box= "+box); //box= 250

    //searching
    String s1 = "welcome to Bootcamp.";
    //1.find the no. of o
    int count=0;
    for(int i=0; i<s1.length();i++){
        if(s1.charAt(i)=='o'){
            count++;
        }
    }
    System.out.println("the no. of o in welcome to Bootcamp is " + count);

    //!for + continue
    //Approach 1: simple if
    for(int i=0; i<3; i++){
        System.out.println("Approach 1: i= "+i);//0,1,2
    }

    //Approach 2: 
    //for + if + continue //!--> better approach to be used when you need to filtered out some special conditions
   
    for(int i=0; i<3; i++){
        if(i%2==1){ //!skip the rest of code outside code block{} and goes to i++, 0,2 (skip odd)
            continue;
        }
        System.out.println("Approach 2: i= "+i); //0,2
    }

    //Further example explaining why for + continue is a better approach:
    // print out numbers which are even number and less than 5
    for(int i=0; i<10; i++) {
        if(i % 2 == 1) continue; //! when i % 2 == 1 condition is true ，SKIP the rest of the loop, i++。SKIP odd numbers
        if(i > 5) continue;      //! when new condition i > 5 is true ，SKIP the rest of the loop, i++。SKIP odd numbers：跳过大于5的数
        System.out.println(i); //0,2,4
    }
    for(int i=0; i<10; i++) {
        if(i % 2 == 0 && i <= 5) { // 需合并条件，可能引入错误
            System.out.println(i);//0,2,4
        }
    }



    //! for + break eg., there are 100 cutomers, break out once you find 1 customer who wear glasses
    //Approach 1 : simple if
    for(int i=0; i<4; i++){
        if(i<2){
            System.out.println(i); //0,1
        }
    }

     // ! for + break
    // Approach 1: simple if
    for (int i = 0; i < 4; i++) {
        if (i < 2) {
          System.out.println("i= " +i); // 0,1
        }
      }
      // Approach 2: break
      for (int i = 0; i < 4; i++) {
        if (i >= 2) {
          break; //! when i=2 ,i >= 2 condition is true. Break the whole for loop including print inside the for loop, no more i++ , 2 is not printed
        }
        System.out.println("i= " +i); // 0,1
      }

//!Single for loop      
// Question: sum up 5 - 15 -> result
// the product of 16 - 20 -> result2
int result = 0;
int result2 =1;
for (int i=0; i<21;i++) {
    if(i>=5 && i<=15){
        result = result +i;
    }
    if(i>16 && i<21) {
        result2=result2*i;
    }
}
System.out.println("result = "+ result);
System.out.println("result2 = "+ result2);

for (int i = 10; i > 0; i--) {
    System.out.println(i);
  } //10,9,8,7,6,5,4,3,2,1

 // ! Nested Loop
 //i=0, j=0,j=1
 //i=1, j=0,j=1
 //i=2, j=0,j=1

 for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 2; j++) {
      System.out.println("i=" + i + ",j=" + j);
    }
  }


  //!Print the following pattern of # 
  //#####
  //#####
  //#####
  //#####
  //#####

  for(int i= 0; i<5;i++) {
    for(int j=0; j<5;j++) {
        System.out.print("#");
    }
    System.out.println();
  }

//!Print the following pattern of # value
//#           i=0,j=0
//##          i=1,j=0,j=1
//###         i=2,j=0,j=1,j=2
//####        i=3,j=0,j=1,j=2,j=3
//#####       i=4,j=0,j=1,j=2,j=3,j=4

for(int i=0; i<5; i++) {
    for(int j=0;j<i+1;j++) {
        System.out.print("#");
    }
    System.out.println();
    }
    
//!Print the following pattern of # value
//    #     i= 0, space=0,space=1,space=2,space=3,j=0
//   ##     i= 1, space=0,space=1,space=2,j=0,j=1
//  ###     i= 2, space=0,space=1,j=0,j=1,j=2
// ####     i= 3, space=0,j=0,j=1,j=2,j=3
//#####     i= 4, j=0,j=1,j=2,j=3,j=4

for(int i= 0; i<5;i++) {
    for(int space = 0; space < 5-i-1; space++) {
        System.out.print(" ");
    }
    for(int j =0; j<i+1;j++) {
        System.out.print("#");
    }
    System.out.println();
    
}

//Quiz 1 Q5 on 2025-4-17:
//! byte i =127 in the for loop, becare of the byte range (-128-127)
String str = "";

for(byte i=127; i<128;i++) {
    str += i;
    if(i<0) {
        break;
    }
    
}
System.out.println("str = "+str);//str = 127-128
//System.out.println("i = "+i); //! byte i can not be printed as it will not exist outside the for loop.


//Quiz 1 Q6 on 2025-4-17:
//String str2 = "";

//for(byte i=127; i<128;i++) {//! 由於byte overflow 的特性，i++， i<128 condition 會不停被滿足，因为i会不断在-128到127之间循环，永远无法达到或超过128
    //if(i<0) {
        //continue;//!i <0時str2 += i；語句會被skip並直接跳回for loop
    //}
    //str2 += i;  //! 仅在 i >= 0 时执行, i <0時 str2=1271234.....127(skip 0及所有-ve)1234....無限loop直至直到内存耗尽，最终导致 OutOfMemoryError
//}
//System.out.println("str2 = "+str2);

//Quiz 1 Q7 on 2025-4-17:

String[] strings2 = new String [3];
String sum2 ="";

for (int i=0; i<3; i++) {
    sum2 += strings2[i];

}
System.out.println(sum2); //nullnullnull



String[] strings3 = new String []{"0","1","2"};
String sum3 ="";

for (int i=0; i<3; i++) {
    sum3 += strings3[i];

}
System.out.println(sum3); //012

//!String[] strings4 = new String []{0,1,2}; //!cannot convert from int to String
//!String sum4 ="";

//!for (int i=0; i<3; i++) {
    //!sum4 += strings4[i];

//!}
//!System.out.println(sum4); 

String[] strings5 = new String [3];
String sum5 ="";

for (int i=0; i<3; i++) {
    strings5[i] = String.valueOf(i);
    sum5 += strings5[i];

}
System.out.println("String sum5 = "+sum5); //String sum5 = 012











    }
}
