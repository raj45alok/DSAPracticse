class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        if(len<3) return -1;
        int sum=0,ans=Integer.MAX_VALUE,value=0;
        for(int i=0;i<len;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        // val is for iterating teh hashmap and value is for frequcy of the number//
        for(int val:map.keySet()) 
        {
            if(map.get(val)>=3)
            {
                value=map.get(val);
                sum = FindMinimumDistance(nums,val,value);
                ans = Math.min(ans,sum);
            }
        }
        return ans==Integer.MAX_VALUE ?-1 :ans;

    }
    public int FindMinimumDistance(int[]nums,int val,int value)
    {
        int len = nums.length;
        int[] arr= new int[value];
        int j=0;
        int min =Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==val)
            {
                arr[j]=i;
                j++;
            }
        }
        for(int i=0;i<=value-3;i++)
        {
            // sum= findsum( arr,i);
            sum = 2*(arr[i+2]-arr[i]);
             min = Math.min(min,sum);

        }
        
       
       return min;
    }
   // optimized version
   /* public int findsum(int[]arr, int i)
    {
        int sum=0;
     sum+=Math.abs(arr[i]-arr[i+1])
            +Math.abs(arr[i+1]-arr[i+2])
            +Math.abs(arr[i+2]-arr[i]);

            return sum;
            }*/
}
