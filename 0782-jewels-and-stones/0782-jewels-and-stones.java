class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        HashMap <Character,Integer> hm=new HashMap<>();
        for(int i=0;i<stones.length();i++){
              char ch=stones.charAt(i);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int j=0;j<jewels.length();j++){
            char c=jewels.charAt(j);
            if(hm.containsKey(c)){
                ans+=hm.get(c);
            }
        }
          return ans;
    }
}