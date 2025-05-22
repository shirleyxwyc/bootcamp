import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Leecode {

  public static void main(String[] args) {
//#1920：
int[] nums = new int[] {0,2,1,5,3,4};
//output [0,1,2,4,5,3]
int[] nums2 = new int[nums.length];

for(int i= 0; i<nums.length;i++){
nums2[i]=nums[nums[i]];
}
System.out.println(Arrays.toString(nums2));//[0, 1, 2, 4, 5, 3]

//#3285：height = [1,2,3,4,5], threshold = 2  index -1> threshold ->output the index, Output：[3,4]
int[]height =new int[]{1,2,3,4,5};
int threshold =2;


List<Integer> result = new ArrayList<>();
        for (int i=1; i < height.length;i++){
            if(height[i-1]>threshold){
            result.add(i);
  }
}
System.out.println(result);//[3, 4]


//#1929
//Input: nums = [1,2,1]
    //Output: [1,2,1,1,2,1]
    int[] arr =new int[]{1,2,1};

    int[] arr2=new int[(arr.length)*2];

    for (int i=0; i<arr.length; i++){
      arr2[i]=arr[i];   

    }
    for (int j=arr.length; j<(arr.length)*2;j++){
        arr2[j]=arr[j-(arr.length)];
    }
    System.out.println(Arrays.toString(arr2));//[1, 2, 1, 1, 2, 1]
    }

    // HashSet<Integer> hs = new HashSet<Integer>();
// before Java 1.5 if no<> implys HashSet<Object>
// HashSet hs = new HashSet<>();

// Leecode #217
// HashSet<Integer> hs = new HashSet<Integer>();
// int[] nums = new int[] {1, 2, 3, 1, 5};
// for (int x : nums) {
// if (!hs.add(x)) // return true if find a duplicate
// return true;

// return false;
// }


}



