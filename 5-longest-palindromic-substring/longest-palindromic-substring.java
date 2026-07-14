class Solution {
    static boolean iterate(String s, int i, int j){
        
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxlen = 0;
        int sp = 0;
        for(int i = 0; i < s.length();i++){
            for(int j = i;j < s.length();j++){
                if(iterate(s,i,j)){
                    if(j - i + 1 > maxlen){
                        maxlen = j - i + 1;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp,sp+maxlen);
    }
}