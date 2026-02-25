import java.util.Arrays;
import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
       
       int[] arr1=new int[len];
       
       int[] ans=new int[len];
       for(int i=0;i<len;i++)
       {
        arr1[i]= arr[i];
       }
       Arrays.sort(arr);
       ArrayList<Integer> nums = new ArrayList<>();
       for(int i=0;i<arr.length-1;i++)
       {
        if(arr[i]!=arr[i+1])
        nums.add(arr[i]);
       } 
       if(len>0)
       {

        nums.add(arr[len-1]);
       }
       for(int i=0;i<len;i++)
       {
      // tle issue  ans[i]=(nums.indexOf(arr1[i]))+1;
      ans[i] = Collections.binarySearch(nums, arr1[i]) + 1;
       }
       return ans;
      
      
    }
}
