class Solution {
    public static void merge(int arr[],int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int k=0;
        int n=right-left+1;
        int new_arr[]=new int[n];
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                new_arr[k]=arr[i];
                i++;
            }
            else{
                new_arr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(j<=right){
            new_arr[k]=arr[j];
            j++;
            k++;
        }
        while(i<=mid){
            new_arr[k]=arr[i];
            i++;
            k++;
        }
        for(int c=0;c<n;c++){
            arr[left+c]=new_arr[c];
        }
    }
    public static void mergeSort(int nums[],int left,int right){
        if(left==right){
            return ;
        }
        int mid=(left+right)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
    public int[] sortArray(int[] nums) {
        int len=nums.length-1;
        mergeSort(nums,0,len);

        return nums;
        
    }
}