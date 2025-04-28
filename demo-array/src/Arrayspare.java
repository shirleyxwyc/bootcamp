public class Arrayspare {
  public static void main(String[] args) {
      //double array for loop + print out values
    double [] amounts = new double [6];
    amounts [0]= 10.9;
    amounts [3]= 14.1;
    amounts [5]= 99.9;
    
    //add 1.5 to all array values
  
//int array 
//Find even number, and then print out "Age=x"

int[] ages = new int [4];
ages [0] = 19;
ages [1] = 14; 
ages [2] = 10;
ages [3] = 65;

for(int i=0; i<ages.length; i++) {
if(ages[i]%2==0){
  System.out.println("Age = " + ages[i]);
}
}

//array +for +if
//find the max value in the array
int[] numbers = new int[6];
numbers[0]=2;
numbers[1]=10;
numbers[2]=104;
numbers[3]=1000;
numbers[4]=1004;
numbers[5]=105;

int max = 0;
for(int i =0; i<numbers.length;i++) {
  if(numbers[i]>max){
    max=numbers[i];
  } 
}
System.out.println(max);

int[] nos = new int[6];
nos[0]=-1;
nos[1]=-100;
nos[2]=-1999;
nos[3]=-3;
nos[4]=-1004;
nos[5]=-105;

int maxNos = Integer.MAX_VALUE;
for(int i =0; i<numbers.length;i++) {
  if(numbers[i]>maxNos){
    maxNos=numbers[i];
  } 
}
System.out.println(maxNos);

//find min.salary

int[] salaries = new int[4];
salaries[0]=14000;
salaries[1]=20000;
salaries[2]=30000;
salaries[3]=40000;

int min = Integer.MAX_VALUE;
for(int i = 0; i<salaries.length; i++) {
  if(salaries[i]<min) {
    min=salaries[i];
  }
}
System.out.println(min);

//John, Steven, Eric
String[] names = new String[3];
names[0] = "John";
names[1] = "Steven";
names[2] = "Eric";

//find the longest name in the array
//"John".length(); // string length 
//names[0].length(); // string length 
//int str = str.legth()


String longestNames = ""; //empty string

//int longestNames = longestNames.length() ; //find the longest name in the array
for(int i=0; i<names.length;i++) {
  if(names[i].length()>longestNames.length()) { //comparing the longest srting str.length
    longestNames = names[i];
}
System.out.println("Longest name is " +longestNames);
System.out.println("John".length());//4
System.out.println(names[0].length());//4
System.out.println(names.length); //3
}
int[] nums = new int[4];
nums[0]=9;
nums[1]=8;
nums[2]=7;
nums[3]=10;
//Print out the first even numbers
int firstEven = 0;
for(int i=0; i<nums.length; i++) {
  if(nums[i]%2==0) {
    firstEven = nums[i]; 
    break; // exit when the first even number num[i]=8 is found, otherwise num[i] will be 10.
  }
}
System.out.println("First Even Number =" +firstEven);

char[] directions = new char[5];
directions[0] = 'l';//score +3;
directions[1] = 'l';//score +3;
directions[2] = 'r';//score -2;
directions[3] = 'l';//score +3;
directions[4] = 'r';//score -2;
//l--> score +3;
//r--> score -2;

int score = 0;

for(int i = 0; i<directions.length;i++) {
  if(directions[i] =='l' ){
    score +=3;
  } else {
    score -=2;
  }
}
System.out.println("total =" +score);

//Swapping
int w1 = 2;
int w2 =3;
int tempBox = w1; //assign w1 to tempBox 
w1=w2;
w2=tempBox;
System.out.println("w1=" + w1); //3
System.out.println("w2=" + w2);//2

int[] markSix = new int[6];
markSix[0]= 5;
markSix[1]= 20;
markSix[2]= 47;
markSix[3]= 43;
markSix[4]= 39;
markSix[5]= 2;
//5,20,47,43,39,2
for (int i=0;i<markSix.length;i++ ) {
  System.out.println(markSix[i]);
}
//! finding min and max-->revisit again!

//! Swapping-->revisit again!
//! sorting(bubble sort-see notes) below numbers e.g.(roughlyt 5x5), how about when there are 10000numbers to be sorted??
//!bubble sort, when you compare 2 numbers next to each other, move the larger nummber behind each time. 
//5,20,47,43,39,2 ==> 2,5,20,39,43,47
int temp = -1;
for (int i = 0; i<markSix.length-1;i++) {//i=0-how many numbers I need t swap
  for (int j = 0; j<markSix.length-i-1;j++) {//j=0,1,2,3,4 | j=0,1,2,3
    if (markSix[j+1] < markSix[j]){ 
      temp = markSix[j+1];
      markSix[j+1]=markSix[j];
      markSix[j]=temp; //2numbers are swapped
    }
  }
}
for(int i =0; i<markSix.length;i++) {
  System.out.println("the current i is "+markSix[i]);
}
//Sorting example using 2 for loops +if
//后面的数要比前数小才swap


//counting
char[] chs = new char[]{'o','p','a','p'}; //when listing in {}, we have automatically define the new char [] has a length of 4
//count the no. of 'p'
int count =0;
for (int i=0; i<chs.length;i++) { //chs is array so no need ()
  if(chs[i]=='p') {
    count++;
  } 
}
System.out.println("count the no. of 'p' "+ count);

char[] chs2 = new char[] {'o','p','a','p','o'};
// 有多少个 character 的出现次数多过1次 o and p 出现>1
//answer = 2 times
//array 内放index, index ++ for counting.
//create a new array with 26 values  and each box starts at index 0--> counts[index] loop array
//when o appear--> 0--> 1, 1-->2 counts[index] -->counts[0] -->counts[1] -->counts[2] 
//when p appear--> 0--> 1, 1-->2
//when a appear--> 0--> 1
// a is box 1, a -->box +1
//array 内做counting
//'o'-'a'
//'z'-'a'=25

//!please complete exercise
int arrCountsAlphabet[] = new int [26]; //index = 0,1,...25
for(int = 0; )

int index = 

//0 9 1 9 2 0 9 9
//is there any number appear 3 times or more?
//answer =true

//









  }
}
