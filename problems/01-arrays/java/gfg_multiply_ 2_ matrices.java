class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        int len = mat1.length;
        int len1 = mat1[0].length;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            ArrayList<Integer> arr1 = new ArrayList<>();
            arr.add(arr1);
            for(int j=0;j<len1;j++)
            {
               int  val = matmultiply(mat1,mat2,i,j);
              arr.get(i).add(val) ;
            }
        }
        return arr;
    }
    public int matmultiply( int mat1[][],int mat2[][],int a ,int b )
    { 
    
    
        int sum =0,p=1;
         for(int k=0;k<mat1[0].length;k++)
        {   
            
                p = mat1[a][k]*mat2[k][b];
                sum+=p;
            }
        
    
    return sum;
}
}
