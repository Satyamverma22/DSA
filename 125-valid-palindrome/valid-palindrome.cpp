class Solution {
public:
    bool isPalindrome(string s) {

        string clean = "";

        // Keep only letters and numbers
        for (char ch : s) {
            if (isalnum(ch)) {
                clean += tolower(ch);
            }
        }

        string check = clean;

        reverse(clean.begin(), clean.end());

        return check == clean;
    }
};