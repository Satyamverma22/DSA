class Solution {
    public int sumByDiv(int[] nums, int div){
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum += (int) Math.ceil((double) nums[i] / div);
        }
        return sum;
    }

    public int findmax(int[] nums) {
        int max = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
        }

        return max;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length > threshold) return -1;
        int low = 1;
        int high = findmax(nums);

        while(low <= high){
            int mid = (low + high)/2; 

            if(sumByDiv(nums, mid) <= threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}