
class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int i = 0; 
        int k = 0; 

        arr1[i] = nums[0];
        arr2[k] = nums[1];

        for (int j = 2; j < n; j++) {

            if (arr1[i] > arr2[k]) {
                arr1[++i] = nums[j];
            } else {
                arr2[++k] = nums[j];
            }
        }

      
        int[] result = new int[i + k + 2];

        int index = 0;

        
        for (int p = 0; p <= i; p++) {
            result[index++] = arr1[p];
        }

        
        for (int p = 0; p <= k; p++) {
            result[index++] = arr2[p];
        }

        return result;
    }
}
