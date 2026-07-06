class Solution {
  public:
    int largest(vector<int> &arr) {
        int n = arr.size();
        int largest = arr[n-1];
        for(int i = 0;i <n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
        
    }
};
