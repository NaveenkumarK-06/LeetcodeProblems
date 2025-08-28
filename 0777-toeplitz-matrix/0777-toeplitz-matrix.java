class Solution {
    public static boolean Isvalid(int [][]matrix,int x,int y){
    int r=matrix.length;
    int c=matrix[0].length;
    int i=x;
    int j=y;
    int temp=matrix[i][j];
    while(i<r && j<c){
        if(matrix[i][j]!=temp){
            return false;
        }
        i++;
        j++;
    }
    return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int j=0;j<c;j++) {
           boolean temp=Isvalid(matrix,0,j);
           if(temp!=true){
            return false;
           }
        } 
        for(int i=1;i<r;i++) {
           boolean temp=Isvalid(matrix,i,0);
           if(temp!=true){
            return false;
           }
        } 
        return true;
    }
}