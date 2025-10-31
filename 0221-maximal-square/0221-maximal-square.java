class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSide=0;
        if(matrix==null ||
        matrix.length==0||
        matrix[0].length==0) return 0;

        int rows=matrix.length;
        int cols=matrix[0].length;
        int dp[][]=new int[rows+1][cols+1];

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                int top=dp[i-1][j];
                int left=dp[i][j-1];
                int topleft=dp[i-1][j-1];
                if(matrix[i-1][j-1]=='1'){
                dp[i][j]=1+Math.min(Math.min(top,left),topleft);
                maxSide=Math.max(maxSide,dp[i][j]);
                }
            }
        }
        return maxSide*maxSide;
    }
}
