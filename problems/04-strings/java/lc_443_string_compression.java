class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int i = 0, j = 0;
        int m = 0;

        while (j < n) {

            while (j < n && chars[i] == chars[j]) {
                j++;
            }

            int count = j - i;

            chars[m++] = chars[i];

            if (count > 1) {
                String cnt = String.valueOf(count);
                for (int k = 0; k < cnt.length(); k++) {
                    chars[m++] = cnt.charAt(k);
                }
            }

            i = j;
        }

        return m;
    }
}
