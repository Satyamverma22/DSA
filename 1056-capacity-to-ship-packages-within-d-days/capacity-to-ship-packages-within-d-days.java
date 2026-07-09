class Solution {
     public int low_range(int[] weights){
        int max = weights[0];
        for(int i = 0;i < weights.length;i++){
            max = Math.max(weights[i],max);
        }
        return max;
     }
     public int high_range(int[] weights){
        int sum = 0;
        for(int i = 0;i < weights.length;i++){
           sum += weights[i];
        }
        return sum;
     }

    public int daysReq(int[] weights, int cap) {
        int load = 0;
        int days = 1;
        for(int i = 0;i < weights.length;i++){
            if(load + weights[i] > cap){
                days++;
                load = weights[i];
            }
            else load += weights[i];
        }
        return days;
    }



    public int shipWithinDays(int[] weights, int d) {
        int low = low_range(weights);
        int high = high_range(weights);

        while(low <= high){
            int mid = (low + high)/2;

            int days = daysReq(weights, mid);
            if(days <= d){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return low;
    }
    
}