class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int x : target){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int y : arr){
            if(!hm.containsKey(y)) return false;
            hm.put(y,hm.get(y)-1);
        }
        for(int val : hm.values()){
            if(val!=0){
                return false;
            }
        }

        return true;
    }
}