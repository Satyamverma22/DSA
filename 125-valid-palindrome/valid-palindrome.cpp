class Solution {
public:
    bool isPalindrome(string s) {
        string clean = "";

        for(char ch: s){
            if(isalnum(ch)){
                clean += tolower(ch);
            };
        };

        string check = clean;
        reverse(check.begin(),check.end());

        if(check == clean) return true;
        return false;
    }
};