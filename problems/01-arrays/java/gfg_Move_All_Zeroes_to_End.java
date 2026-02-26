import java.util.*;

class Solution {
    void pushZerosToEnd(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int zeroCount = 0;

       
        for(int num : arr) {
            if(num == 0)
                zeroCount++;
            else
                list.add(num);
        }

        
        for(int i = 0; i < zeroCount; i++) {
            list.add(0);
        }

        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}
