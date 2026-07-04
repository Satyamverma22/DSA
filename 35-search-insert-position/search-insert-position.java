class Solution {
    public int searchInsert(int[] nums, int target) {

      int n = nums.length;
      int low = 0;
      int high = n-1;
      int idx = n;

      while(low <= high){
        int mid = (low + high)/2;
        if(nums[mid] >= target){
            idx = mid;
            high = mid - 1;
        }
        else low = mid + 1;
      } 
      return idx; 
    }
}