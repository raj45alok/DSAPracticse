class Solution {
    public char getMaxOccuringChar(String s) {
        int len = s.length();
        char ans =s.charAt(0);
        int maxfreq=-1;
        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            int freq =1;
            for(int j=i+1;j<len;j++)
            {
                if(ch==s.charAt(j)) freq++;
            }
        
        if(freq> maxfreq)
        {
            maxfreq = freq;
            ans = ch;
        }
        else if(freq == maxfreq && ch<ans)
        {
            ans = ch;
        }
        }
        return ans;
        
    }
}
