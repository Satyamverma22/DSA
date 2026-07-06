class Solution {
  public:
    int findKRotation(vector<int> &arr) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;

        int idx = 0;
        int ans = arr[0];

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[mid]) {
                // fixed: ans[low] ❌ -> arr[low] ✅
                if (arr[low] < ans) {
                    ans = arr[low];
                    idx = low;   // moved inside because idx updates only when ans updates
                }
                low = mid + 1;
            } 
            else {
                // fixed: ans[mid] ❌ -> arr[mid] ✅
                if (arr[mid] < ans) {
                    ans = arr[mid];
                    idx = mid;   // moved inside because idx updates only when ans updates
                }
                high = mid - 1;
            }
        }

        // fixed: return ans ❌ -> return idx ✅
        return idx;
    }
};