class Solution {
    public int atMostK(int[] nums, int k) {
        int l=0;
        int temp=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2==1){
                temp++;
            }
            while(temp>k){
                if(nums[l]%2==1){
                    temp=temp-1;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int Finalans=atMostK(nums,k)-atMostK(nums,k-1);
        return Finalans;
    }
}