class Solution {
    public int findLucky(int[] arr) {
        int count=1;
        int lucky=-1;
        Arrays.sort(arr);

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                if(count==arr[i+1]){
                    lucky=Math.max(lucky,arr[i+1]);
                }
                count=1;
            }
        }
        if(count==arr[0]) lucky=Math.max(lucky,arr[0]);
        return lucky;
    }
}