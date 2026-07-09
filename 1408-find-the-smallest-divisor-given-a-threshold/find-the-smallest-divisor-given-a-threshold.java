class Solution {
    public int findmax(int[] nums) {
        int max = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = findmax(nums);
        int ans = 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(sumByDiv(nums, mid) <= threshold){
                high = mid - 1;
                ans = mid; 
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int sumByDiv(int[] nums, int div){
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (int) Math.ceil((double) nums[i] / div);
        }

        return sum;
    }

}