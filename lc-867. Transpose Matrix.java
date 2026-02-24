class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=0 , col=0 ;
        int rows = matrix.length ;
        int cols = matrix[0].length;
        int [][] transpose =new int[cols][rows] ;
        for(row = 0 ; row < matrix.length;row++)
        {
            for( col=0;col<matrix[row].length;col++)
            {
             transpose[col][row]= matrix[row][col];
                }
 }
return transpose ;
    }
}
