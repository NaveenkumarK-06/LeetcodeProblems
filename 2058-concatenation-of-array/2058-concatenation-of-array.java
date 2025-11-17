class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n*2];
        int j=0;
        for(int i=0;i<n*2;i++){
            ans[i]=nums[j];
            j++;
            if(j==n){
                j=0;
            }
        }
        return ans;
    }
}