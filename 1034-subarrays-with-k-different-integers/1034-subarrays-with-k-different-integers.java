class Solution {
    public int atMostK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            hm.put(val,hm.getOrDefault(val,0)+1);

            while(hm.size()>k){
               int Lval=nums[l];
               hm.put(Lval,hm.get(Lval)-1);
               if(hm.get(Lval)==0){
                hm.remove(Lval);
               }
               l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);
    }
}