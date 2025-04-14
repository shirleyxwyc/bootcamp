public class DemoArray {
  public static void main(String[] args) {
    int x1 = 3;
    int x2 = 4;
    int x3 = -7;
    //....

    //array[]
    //right hand side
    //left assign 
    int[] arr = new int[3]; //now we have 3 boxes to store 3 values

    //write
    // First box(index)
    arr[0]=3;
    arr[1]=4;
    arr[2]=-7;
    


    //question:
    int[] box2 =new int[5];
    box2[0]=10;
    box2[1]=7;
    box2[2]=4;
    box2[3]=-100;
    box2[4]=6;

    //Question: double array with size 4
    //assign 4 double values into the array

    double [] boxD = new double [4];
    boxD [0]= -4.2;
    boxD [1]= 1.1;
    boxD [2]= 2.2;
    boxD [3]= 3.3;

    //read
    System.out.println(boxD[0]);//-4.2
    System.out.println(box2[3]);

    double amount =99.9;
    boxD[3] = amount;
    System.out.println(boxD[3]); // 99.9. assign 99.9 to boxD[3], box[D] change from 3.3 to 99.9
    
    //String array
    //size 3, with 3 string values
    String s1[] = new String[3];
    s1[0]="Shirley";
    s1[1]="Peter";
    s1[2]="Alice";
    System.out.println(s1[2]);

    















  }
}
