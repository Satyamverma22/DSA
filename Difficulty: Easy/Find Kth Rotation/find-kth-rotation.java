class Solution {
    public int findKRotation(int nums[]) {
       int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = nums[0];
        int idx = 0;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[low] <= nums[mid]){
                if(nums[low] < ans){
                    ans = nums[low];
                    idx = low;
                }
                low = mid + 1;
            }
            else{
                if(nums[mid] < ans){
                    ans = nums[mid];
                    idx = mid;
                }
                high = mid - 1;
            }
        }
        return idx; 
        
    }
}