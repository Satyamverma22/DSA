class Solution {
    
    static boolean allzero(int[] counter){
        for(int i = 0;i < counter.length;i++){
            if(counter[i] != 0) return false;
        }
        return true;
    }

    int search(String pat, String txt) {
        int n = txt.length();
        
        int[] counter = new int[26];
        
        for(int i = 0;i < pat.length();i++){      //to count frequency
            char ch = pat.charAt(i);
            
            counter[ch - 'a']++;
        }
        
        //making sliding window
        
        int i = 0;
        int j = 0;
        int result = 0;
        
        while(j < n){
            counter[txt.charAt(j) - 'a']--;
            
            if(j - i + 1 == pat.length()){
                if(allzero(counter)){
                    result++;
                }
                counter[txt.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return result;
        
    }
}