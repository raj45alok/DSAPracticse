class Solution {
    public void rotate(int[][] matrix) {
        int rows  = matrix.length;
        int cols  = matrix[0].length;

    // step -1 Transpose karo matrix ko //
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;

            
            }
        }
    // Step 2  rows ko reverse kardo
    for (int i = 0; i < rows; i++) {
        int row_start=0,row_end=matrix[0].length-1;
            while(row_start <= row_end)
            {
              int temp =   matrix[i][row_start];
              matrix[i][row_start]= matrix[i][row_end];
               matrix[i][row_end]= temp;
                row_start++;
                row_end--;


            }
                
                }
           
            

    for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("  ");
    }
    }
}




    
 
