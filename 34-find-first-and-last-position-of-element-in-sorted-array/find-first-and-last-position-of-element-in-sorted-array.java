class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // Find first occurrence
        ans[0] = firstOccurrence(nums, target);

        // If target is not present, return {-1, -1}
        if (ans[0] == -1) {
            return ans;
        }

        // Find last occurrence
        ans[1] = lastOccurrence(nums, target);

        return ans;
    }

    // Function to find first occurrence
    public int firstOccurrence(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;          // Store answer
                high = mid - 1;     // Move left to find earlier occurrence
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Function to find last occurrence
    public int lastOccurrence(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;          // Store answer
                low = mid + 1;      // Move right to find later occurrence
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}