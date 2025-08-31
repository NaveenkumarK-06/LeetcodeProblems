class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0) return false;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int num :nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int count=n/k;
        for(int ans: hm.values()){
            if(ans>count){
                return false;
            }
        }
        return true;
    }
}