class Solution {

    public String compressedString(String word) {
        int len = word.length();
       StringBuilder sb  = new StringBuilder();
       int c=0,i=0,j=0;
       char[]ch = new char[len];
       ch = word.toCharArray();
       while(j<len)
       {
        if(ch[i]==ch[j]) j++;
       
       else
       {
        c= j-i;
         if(c>9)
         {
        while(c>9)
        {
      
        sb.append('9');
        sb.append(ch[i]);
        c=c-9;
        }
        if (c > 0) {
        sb.append(c);
        sb.append(ch[i]);
    }
         }
        else 
        {
            sb.append(c);
            sb.append(ch[i]);
        }

        
         i=j;
       }
       }
       c= len-i;
        if(c>9)
         {
        while(c>9)
        {
      
        sb.append('9');
        sb.append(ch[i]);
        c=c-9;
        }}
        // Yeh wala c>0 is liye add kiya h kyuki if something like 13 14 h frequency to usme 9 ke baad jo remainder bachta say 4 5 woh miss na ho 
         if (c > 0) {
        sb.append(c);
        sb.append(ch[i]);
    }
        else if(c > 0)
        {
            sb.append(c);
            sb.append(ch[i]);
        }
        
        

        
        String comp = sb.toString();
        return comp;
}
}
    




     
      


       
