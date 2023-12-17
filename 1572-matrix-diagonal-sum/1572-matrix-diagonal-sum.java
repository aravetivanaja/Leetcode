class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,sum1=0,sum2=0;
         int n=mat.length;
        int mid=n/2;
       
        if(n==1)
        {
            return mat[0][0];
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i==j)
                {
                    sum1=sum1+mat[i][j];
                }
                if((i+j)==(n-1))
                {
                    sum2=sum2+mat[i][j];
                }
            }
        }
        sum=sum1+sum2;
        if(n%2==1)
        {
            sum=sum-mat[mid][mid];
        }
        return sum;
        
    }
}