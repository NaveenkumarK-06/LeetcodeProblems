class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree=0;
        int minLength=nums.length;
        boolean visited[]=new boolean[nums.length];

        for(int i=0;i<nums.length;i++){
            int count =0;
            int start=i;
            int end=i;
            if(visited[i])continue;

            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    visited[j]=true;
                    end=j;
                }
            }
            if(count>degree){
                degree=count;
                minLength=end-start+1;
            }
            else if(count==degree){
                minLength=Math.min(minLength,end-start+1);
            }

        }
        return minLength;
    }
}