class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int r=0;r<fruits.length;r++){
            int val1=fruits[r];
            hm.put(val1,hm.getOrDefault(val1,0)+1);
            while(hm.size()>2){
                int val2=fruits[l];
                hm.put(val2,hm.get(val2)-1);
                if(hm.get(val2)==0){
                     hm.remove(val2);
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}