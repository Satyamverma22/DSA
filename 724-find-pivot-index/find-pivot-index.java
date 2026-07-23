class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += nums[i];
        }

        int cs = 0;
        for(int i = 0; i < n;i++){
            int leftsum = cs;
            int rightsum = sum - cs - nums[i];

            if(leftsum == rightsum) return i;

            cs += nums[i]; 
        }
        return -1;
    }
}