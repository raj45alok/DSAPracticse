class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int len = matrix.length;
        boolean a = false;
        int len1 = matrix[0].length;
        for(int i=0;i<len;i++)
        {
           if(target==matrix[i][0] ||target==matrix[i][len1-1])
           {
             a = true;
             break;
           }
            
              else  if(target>matrix[i][0]&& target<matrix[i][len1-1])
              {
                int start =0, end = len1-1;
                while(start<= end )
                {
                    int mid = start + (end-start)/2;
                    if(target == matrix[i][mid])
                    {
                        a= true;
                        break;
                    }
                    else if(target > matrix[i][mid])
                    {
                        start = mid+1;
                    }
                    else 
                    {
                        end = mid-1;
                    }
                }
              }

            }
            return a;
        }
    }

        
    
