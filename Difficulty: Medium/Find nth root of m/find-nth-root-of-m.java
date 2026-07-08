class Solution {

    public int checkPower(int mid, int n, int m) {
        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= mid;

            if (ans > m) return 2; // greater
        }

        if (ans == m) return 1; // equal
        return 0; // smaller
    }

    public int nthRoot(int n, int m) {
        if (m == 0) return 0;
        if (m == 1) return 1;

        int low = 1;
        int high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = checkPower(mid, n, m);

            if (result == 1) {
                return mid;
            } 
            else if (result == 0) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}