class Solution {

    public static boolean isPossible(int[] bloomDay,int m,int k,int d){
        int took=0;
        for(int val: bloomDay){
            if(d>=val){
                took++;
            }
            else{
                took=0;
            }
            if(took==k){
                m-=1;
                took=0;
            }
            if(m==0){
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1;
        int r=(int)Math.pow(10,9);
        long total=(long)m*k;
        if(total>bloomDay.length){
            return -1;
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}