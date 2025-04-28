public class Newjava {
  public static void main(String[] args) {
    
    
    int[] arr1 = new int [3]; 
    arr1[0] = 22;
    arr1[1] = 33;
    arr1[2] = 44;
    int x = 0;
    x = arr1.length; //number of boxes in the array names arr1.
    System.out.println(x); //3

    String[] arr2 = new String [4];
    arr2[0] = "John";
    arr2[1] = "Peter";
    arr2[2] = "Andy";
    arr2[3] = "Ken";

    int box2 = arr2[1].length(); //Peter 's length =5
    System.out.println("box2-Peter has "+box2 +" letters");
    int arr2Length = arr2.length;// arr2 's length=4
    System.out.println("arr2Length="+arr2Length);
    //array length --> arrayname.length;
    //length of string in an array--> 
    int y = 0;
    y = arr2.length;
    System.out.println(y); //4, number of boxes in the array names arr2.

    String s = "Peter";
    int str = s.length();
    System.out.println(str); //length of "Peter =5"















  }

}
