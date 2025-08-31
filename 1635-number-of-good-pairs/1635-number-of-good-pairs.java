class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int num=nums[i];
            if(hm.containsKey(num)){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int n;
        for(int no:hm.keySet()){
            n=hm.get(no);
            ans=ans+(n*(n-1))/2;
        }
        return ans;
    }
}