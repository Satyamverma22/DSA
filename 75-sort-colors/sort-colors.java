class Solution {
    public void sortColors(int[] nums) {
        int i = 0; //denotes 0
        int j = 0;  //denotes 1
        int k = nums.length - 1;  //denotes 2

        while(j  <= k){
            if(nums[j] == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++;
                i++;
            }
            else if(nums[j] == 1){
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;

                k--;
            }
        }
    }
}