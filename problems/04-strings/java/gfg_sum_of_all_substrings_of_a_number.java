class Solution {
    public static int sumSubstrings(String s) {
       int len =s.length();
       String str="";
      int n = 0;
      int sum =0;
       for (int i=0;i<len;i++)
       {
           for(int j=i;j<len;j++)
           {
            str = s.substring(i,j+1)  ;
             n= Integer.parseInt(str);
             sum+=n;
             
           }
       }
       return sum;
        
    }
}
