class Solution {
    public int atMost(int[] nums, int k){
        int l=0;
        int temp=0;
        int ans=0;
        if(k<0){
            return 0;
        }
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                temp++;
            }
            while(temp>k){
                if(nums[l]==1){
                    temp--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        int Finalans=atMost(nums,goal)-atMost(nums,goal-1);
        return Finalans;
    }
}