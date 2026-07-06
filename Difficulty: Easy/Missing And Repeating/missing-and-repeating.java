class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int repeating = -1;
        int missing = -1;
        
        int[] freq = new int[n +1];
        
        for(int i = 0;i < n;i++){
            freq[arr[i]]++;
        }
        for(int i = 1;i <= n;i++){
            if(freq[i] == 2){
                repeating = i;
            }
            if(freq[i] == 0){
                missing = i;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        
        return ans;
        
    }
}
