class Solution {
    public int longestOnes(int[] nums, int k) {
        int temp=0;
        int l=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                temp++;
            }

            while(temp>k){
                if(nums[l]==0){
                   temp-=1;
                }
                l++;
             }
          ans=Math.max(ans,r-l+1);
        }
        return ans;
        
    }
}