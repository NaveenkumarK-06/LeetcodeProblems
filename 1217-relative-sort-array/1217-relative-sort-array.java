class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int num :arr1){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        int index=0;
        int result []=new int[arr1.length];
        
        for(int num :arr2){
            int freq=hm.getOrDefault(num,0);
            for(int i=0;i<freq;i++){
                result[index]=num;
                index++;
            }
            hm.remove(num);
        }

        List<Integer> remaining=new ArrayList<>(hm.keySet());
        Collections.sort(remaining);
        for(int num : remaining){
            int freq=hm.getOrDefault(num,0);
            for(int i=0;i<freq;i++){
                result[index]=num;
                index++;
            }
        }

        return result;

    }
}