class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int digits=0;
            int x=nums[i];

            while(x>0){
                x=x/10;
                digits++;
            }

            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}