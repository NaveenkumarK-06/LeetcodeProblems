class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<n;r++){
            if(r-l==k){
                l++;
            }
            int dif=0;
            if(r-l+1==k){
                dif=nums[r]-nums[l];
                min=Math.min(min,dif);
            }
        }
        return min;
    }
}