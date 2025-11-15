class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;

        while(i<n && j<n){
            if(nums[i]%2==1){
                while(nums[j]%2==1){
                    j+=2;
                }
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            i+=2;
        }
        return nums;
    }
}