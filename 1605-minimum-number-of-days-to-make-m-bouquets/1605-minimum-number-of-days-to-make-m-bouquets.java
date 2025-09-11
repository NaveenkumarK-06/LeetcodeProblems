class Solution {

    public static boolean isPossible(int[] bloomDay,int m,int k,int d){
        int took=0;
        for(int i=0;i<bloomDay.length;i++){
            int val=bloomDay[i];
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
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        int exced=(int)Math.pow(10,9);
        if(l==exced+1){
            return -1;
        }
        return l;
    }
}