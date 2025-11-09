import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxLen=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=(nums[i]==0)?-1:1;
            if(map.containsKey(sum)){
                maxLen=Math.max(maxLen,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;

    }
}
