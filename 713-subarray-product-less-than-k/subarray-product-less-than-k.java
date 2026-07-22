class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1) return 0;
        
        int n = nums.length;
        int i = 0;
        int j = 0;

        int result = 0;
        int product = 1;

        while(j < n){
            product *= nums[j];

            while(product >= k){
                product /= nums[i];
                i++;
            }

            result += j - i + 1;
            j++;
        }
        return result;
    }
}