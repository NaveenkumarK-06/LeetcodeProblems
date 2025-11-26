class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean isvisited[]=new boolean[arr.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(isvisited[i]) continue;
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    isvisited[j]=true;
                    
                }
            }
            list.add(count);
        }
         Set<Integer> set = new HashSet<>(list);
         return list.size()==set.size();
    }
}