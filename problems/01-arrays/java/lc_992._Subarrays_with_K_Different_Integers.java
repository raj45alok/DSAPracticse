class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
     //Idea  find no of subarrays with at most k different integers - at most k-1 integers Hashmap frequency rkh rha h integers ki //
     return DifferentIntegers(nums,k)-DifferentIntegers(nums,k-1);
    }
    public static int  DifferentIntegers(int[]arr,int goal){
        int right=0,left=0;
        int i_count =0;
        int len = arr.length;
        if(goal<=0)
        {
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        while(right<len)
        {
           map.put(arr[right],map.getOrDefault(arr[right],0)+1);
           while(map.size()>goal)
           {
            if(map.containsKey(arr[left]))
            map.put(arr[left],map.get(arr[left])-1);
            if(map.get(arr[left])==0)
            map.remove(arr[left]);
            left++;
           }
           i_count+=right-left+1;
           right++;
        }
        return i_count;
           
    }
}
