public class Demo2DArray {
public static void main(String[] args) {
  //int[] arr = new int [3];
  int[] arr = new int []{2,3,4};
  arr[0]=2;
  arr[1]=3;
  arr[2]=4;
  int [][] warriors =new int[3][9]; 
  //3-level arrays , each level arrays has 9 elements

  //new int [row] [column]
  //new int [level] [points]
  //
  
  int[][][] hero_values=new int[3][10][6]; //3D Array.3 roles, 10 levels and 6 points
  int[][] warrior_values=new int[10][6]; //2D Array. 10 levels(10 arrays) and 6 points (6 arrays)
  int[][] mage_values=new int[10][6];
  int[][] archer_values=new int[10][6];

  //read
  //write

  warrior_values[0]=new int []{200,80,10,8,5,3}; //row array->level array
 //int[][] arr2d = new int [2][3]; 
  int[][] arr2d = new int [][]{{10,20,30},{100,90,-100}};

  System.out.println(arr2d[0][0]);//10, first bracket and 1st digit 
  System.out.println(arr2d[1][2]);//-100 second bracket and 3rd digit
  System.out.println(arr2d.length); //2 no.of rows
  System.out.println(arr2d[0].length); //3 number of column for each row

 for (int row =0; row<arr2d.length;row++) {
  for (int col =0; col<arr2d[row].length;col++) {
    System.out.println(
      "row" + row + ",col= " +col+" value="+arr2d[row][col]);
  }
 }
//row0,col= 0 value=10
//row0,col= 1 value=20
//row0,col= 2 value=30
//row1,col= 0 value=100
//row1,col= 1 value=90
//row1,col= 2 value=-100

  

}

  
}
