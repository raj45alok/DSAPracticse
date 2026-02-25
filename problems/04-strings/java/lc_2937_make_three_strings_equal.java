class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int len1=0,len2=0,len3=0,c=0,value1=0;
      
        len1=s1.length();
        len2=s2.length();
        len3=s3.length();
       int minlength =Math.min(len1,Math.min(len2,len3));
       int i=0;
       while(i< minlength &&s1.charAt(i)==s2.charAt(i)&& 
       s2.charAt(i)==s3.charAt(i))
       {
        i++;
       }
      if(i==0)  return -1;
      else return ((len1-i)+(len2-i)+(len3-i));
    }
}

        

       

     
