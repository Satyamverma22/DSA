class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;

        int maxlength = 0;
        int zerocount = 0;

        for(int j = 0;j < nums.length;j++){
            if(nums[j] == 0){
                zerocount++;
            }

            while(zerocount > k){
                if(nums[i] == 0){
                    zerocount--;
                }
                i++;
            }

            maxlength = Math.max(maxlength, j - i + 1);
        }
        return maxlength;
    }
}