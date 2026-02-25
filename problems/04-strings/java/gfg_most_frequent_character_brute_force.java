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
// Optimized code //
/*package Strings;
import java.util.Scanner;
import java.util.Arrays;
//Return the Character with maximum frequency in the string  by sliding window method
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int freq=0;
        char ans='*';
        char []ch = new char[len];
        ch=str.toCharArray();
        Arrays.sort(ch);
        int i=0,j=0,maxfreq=-1;
        while(j<len)
        {
            if (ch[i]==ch[j]) j++;
            else {
                freq=j-i;
                if(freq>maxfreq)
                {
                    maxfreq=freq;
                   ans =ch[i];}
                   i=j;
                }
            }

        freq = len-i;
        if(freq>maxfreq)
        {
            maxfreq=freq;
            ans =ch[i];}

        System.out.println(ans);



    }

}
*/
