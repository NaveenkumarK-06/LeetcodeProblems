class Solution {
    public static int LeftMost(int []nums,int target){
         int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public int maximumCount(int[] nums) {
       int neg=LeftMost(nums,0);
       int leftOneIndex=LeftMost(nums,1);
       int pos=nums.length-leftOneIndex;
       return Math.max(neg,pos);

    }
}