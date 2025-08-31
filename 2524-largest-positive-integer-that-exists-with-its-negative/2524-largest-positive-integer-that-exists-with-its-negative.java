class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
      int max=-1;
      int n=nums.length;
      for(int i=0;i<n;i++){
        int num=nums[i];
         if(hs.contains(-num)){
            max=Math.max(max,Math.abs(num));
         }
         hs.add(num);
      }
      return max;
    }
}