class Solution {
    public int canMake_bouqe(int[] bloomDay, int mid, int k){
        int bouque_count = 0;
        int conse_count = 0;

        for(int i = 0; i < bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                conse_count++;
            }
            else{
                conse_count = 0;
            }
            if(conse_count == k){
                conse_count = 0;
                bouque_count++;
            }
        }
        return bouque_count;
    }

    public int findMax(int[] bloomDay) {
        int max = bloomDay[0];

        for (int day : bloomDay) {
            max = Math.max(max, day);
        }
        return max;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long)m * k > n) return -1;

        int start_day = 1;
        int end_day = findMax(bloomDay);

        int min_day = -1;

        while(start_day <= end_day){
            int mid_day = (start_day + end_day)/2;

            if(canMake_bouqe(bloomDay, mid_day , k) >= m){
                min_day = mid_day;
                end_day = mid_day - 1;
            }
            else{
                start_day = mid_day + 1;
            }
        }
        return min_day;

    }
}