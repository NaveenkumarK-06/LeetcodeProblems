class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int total=rows*cols;
        int result[][]=new int [total][2];

        int steps=1;
        int count=0;
        int r=rStart;
        int c=cStart;
        int dir=0;

        int directions[][]={{0,1}, {1,0}, {0,-1}, {-1,0}};

        result[count++]=new int []{r,c};

        while(count<total){
            for(int i=0;i<2;i++){
                int [] d=directions[dir];
                for(int j=0;j<steps;j++){
                    r+=d[0];
                    c+=d[1];
                    if(r>=0 && r<rows && c>=0 && c<cols){
                        result[count++]=new int []{r,c};
                        if(count==total) return result;
                    }
                }
                dir=(dir+1)%4;
            }
            steps++;
        }
        return result;
    }
}