class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
        }

        int cs = 0;
        for(int i = 0;i < nums.length;i++){
            int leftsum = cs;
            int rightsum = sum - cs - nums[i];

            if(leftsum == rightsum) return i;

            cs += nums[i];
        }
        return -1;
    }
}