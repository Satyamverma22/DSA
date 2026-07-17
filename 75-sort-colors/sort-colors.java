class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int zero = 0;
        int one = 0;
        int two = 0;

        int i = 0;

        for(int j = 0;j < n;j++){
            if(nums[j] == 0) zero++;
            else if(nums[j] == 1) one++;
            else two++;
        }

        while(zero > 0){
            nums[i] = 0;
            i++;
            zero--;
        }
        while(one > 0){
            nums[i] = 1;
            i++;
            one--;
        }
        while(two > 0){
            nums[i] = 2;
            i++;
            two--;
        }
    }
}