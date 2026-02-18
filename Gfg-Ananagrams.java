class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1!=len2) return false;
        char[]ch1 = s1.toCharArray();
        char[]ch2= s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<len1;i++)
        {
            if(ch1[i]!=ch2[i])
            {
                return false;
            }
        }
        return true;
    }
}
