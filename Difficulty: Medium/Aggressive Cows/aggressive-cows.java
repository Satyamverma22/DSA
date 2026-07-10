class Solution {
    
    public boolean midPossible(int[] arr, int k, int minAllow){
        int cows = 1;
        int lastPoss = arr[0];
        
        for(int i = 1;i < arr.length;i++){
            if(arr[i] - lastPoss >= minAllow){
                cows++;
                lastPoss = arr[i];
            }
            if(cows == k) return true;
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        
        int st = 1;
        int end = arr[arr.length-1] - arr[0];
        int ans = 0;
        
        while(st <= end){
            int mid = (st + end)/2;
            
            if(midPossible(arr,k,mid)){
                ans = mid;
                st = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }
}