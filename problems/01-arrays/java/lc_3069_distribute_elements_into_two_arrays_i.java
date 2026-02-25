import java.util.ArrayList;
class Solution {
    public int[] resultArray(int[] nums) {
        int len =nums.length;
         int arr1[] = new int[len];
         int arr2[] = new int[len];
         
         int i=0,k=0;
         arr1[i]=nums[0];
         arr2[k]= nums[1];
          int max=0;
          

         for(int j=2;j<len;j++)
         {
            max= Math.max(arr1[i],arr2[k]);
            if(max==arr1[i])
            {
            arr1[i+1]=nums[j];
            i++;
            }
            else {
                arr2[k+1]=nums[j];
                k++;
            }
         }
          int len1=arr1.length+arr2.length;
        int nums1[]= new int[len1];
       for( i=0;i<arr1.length;i++)
       {
       
        nums1[i]=arr1[i];
       }
    
       int l = arr1.length;
       for(int  j =0;j<arr2.length;j++)
       {
        
        nums1[l]=arr2[j];
        l++;
       }
ArrayList <Integer> arrr = new ArrayList<>();

for(int j=0;j<len1;j++)
{
    if(nums1[j]!=0)
    {
        arrr.add(nums1[j]);
    }
}
int len2=arrr.size();
int arr3 []=new int [len2] ;
for(int j=0;j<len2;j++)
{
arr3[j]=arrr.get(j);
}



        return arr3;
    }
} hey whats wrong in this code ?
