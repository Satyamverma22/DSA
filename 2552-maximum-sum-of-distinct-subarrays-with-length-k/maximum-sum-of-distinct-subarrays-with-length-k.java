class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;

        long result = 0;
        long currentwindowsum = 0;

        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;

        while(j < n){

            while(set.contains(nums[j])){
                currentwindowsum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            currentwindowsum += nums[j];
            set.add(nums[j]);

            if(j - i + 1 == k){
                result = Math.max(result, currentwindowsum);

                currentwindowsum -= nums[i];
                set.remove(nums[i]);
                i++;

            }
            j++;
        }
        return result;
    }
}