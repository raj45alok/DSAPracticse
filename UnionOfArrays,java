import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer>num = new ArrayList<>();
        ArrayList<Integer>num1 = new ArrayList<>();
        int len =nums1.length;
        int len1 = nums2.length;
        for(int i=0;i<len;i++)
        {
            num.add(nums1[i]);
        }
        for(int j=0;j<len1;j++)
        {
            num.add(nums2[j]);
        }
        Collections.sort(num);

        for(int i=0;i<num.size()-1;i++)
        {
            
            

            if(num.get(i).equals(num.get(i+1)))
            {
            num.remove(i+1);
                i--;
        }}

        int[]arr=new int[num.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=num.get(i);

        }
        //System.out.println(Arrays.toString(arr));
        return(arr);
       

                                                                                                                                               

        
    }
    
}
