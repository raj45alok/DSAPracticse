class Solution {
    public char nonRepeatingChar(String s) {
        int len =s.length();
        int []arr = new int[26];
        char ans='$';
        int index=0;
        for(int i =0;i<len;i++)
        {
            char ch =s.charAt(i);
            index = ch-97;
            arr[index]++;
            
        }
        for(int i=0;i<len;i++)
        {
            char  ans1  = s.charAt(i);
           {
               index=ans1-97;
               if(arr[index]==1) 
               {
                   ans=ans1;
               break;
               }
               
              
           }
            
    }
   return ans; 
}
}
