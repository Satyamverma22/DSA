class Solution {
    public int power(int mid, int n,int m){
        long ans = 1;
        for(int i = 0;i < n;i++){
            ans *= mid;
            
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }
    public int nthRoot(int n, int m) {
        if(m == 0) return 0;
        if(m == 1) return 1;
        
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = (low + high)/2;
            
            int result = power(mid,n,m);
            
            if(result == 1) return mid;
            else if(result == 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}