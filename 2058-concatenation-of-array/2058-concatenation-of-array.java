class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n*2];
        int j=0;
        for(int i=0;i<n;i++){
            ans[i]=nums[j];
            ans[i+n]=nums[j];
            j++;
        }
        return ans;
    }
}