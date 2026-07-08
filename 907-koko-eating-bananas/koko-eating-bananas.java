class Solution {

    public int findMax(int[] piles) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            maxi = Math.max(maxi, piles[i]);
        }

        return maxi;
    }

    public long totalHours(int[] piles, int hourly) {
        long totalH = 0;

        for (int i = 0; i < piles.length; i++) {
            totalH += (piles[i] + hourly - 1) / hourly;
        }

        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalH = totalHours(piles, mid);

            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}