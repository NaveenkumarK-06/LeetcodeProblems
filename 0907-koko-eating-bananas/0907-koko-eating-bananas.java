class Solution {

    public boolean isPossible(int[] piles, int h,int k) {
        for(int i=0;i<piles.length;i++){
            int val=piles[i];
            int temp=val/k;
            if(val%k!=0){
              temp++;
             }
             h-=temp;
            if(h<0){
              return false;
             }
         }
        return true;
     }

    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=(int)Math.pow(10,9);
         while(l<=r) {
             int m=l+(r-l)/2;
             if(isPossible(piles,h,m)){
                 r=m-1;
             }
            else{
                l=m+1;
            }
         }
     return l;
    }
}