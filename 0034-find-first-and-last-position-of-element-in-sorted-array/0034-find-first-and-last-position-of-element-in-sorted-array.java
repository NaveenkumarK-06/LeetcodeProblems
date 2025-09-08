class Solution {

    public int LeftMost(int [] nums,int target){
      int l=0;
      int r=nums.length-1;
      while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]>=target){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
      }
      if(l>=nums.length){
        return -1;
      } 
      if(nums[l]!=target){
        return -1;
      }
      return l;
    }

    public int RightMost(int [] nums,int target){
      int l=0;
      int r=nums.length-1;
      while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]>target){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
      }
      if(r<0){
        return -1;
      } 
      if(nums[r]!=target){
        return -1;
      }
      return r;
    }

    public int[] searchRange(int[] nums, int target) {
     int lm=LeftMost(nums,target);
     int rm=RightMost(nums,target);
     //int [] ans ={lm,rm};
     //return ans;
     return new int [] {lm,rm};
    }
}