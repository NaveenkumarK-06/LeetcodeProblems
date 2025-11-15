class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int k=0;
        int oddpos=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[k]=nums[i];
                k+=2;
            }
            else{
                ans[oddpos]=nums[i];
                oddpos+=2;
            }
        }
        return ans;
    }
}