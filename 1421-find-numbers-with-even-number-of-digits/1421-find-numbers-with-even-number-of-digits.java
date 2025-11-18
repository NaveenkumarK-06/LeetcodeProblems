class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int len=String.valueOf(nums[i]).length();
            if(len%2==0){
                count++;
            }
        }
        return count;
    }
}