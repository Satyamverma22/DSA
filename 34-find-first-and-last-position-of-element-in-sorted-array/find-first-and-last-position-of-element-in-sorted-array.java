class Solution {

    public int lowerBound(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int idx = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                idx = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return idx;
    }

    public int upperBound(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int idx = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                idx = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return idx;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int lb = lowerBound(nums, target);

        if (lb == n || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lb, upperBound(nums, target) - 1};
    }
}