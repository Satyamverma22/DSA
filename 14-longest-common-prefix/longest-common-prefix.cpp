class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        sort(strs.begin(),strs.end());
        string start= strs[0];
        string end= strs[strs.size() - 1];
        int n = min(start.length(),end.length());
        string ans= "";

        for(int i = 0;i < n;i++){
            if(start[i] == end[i]) ans += start[i];
            else break;
        }
        return ans;
    }
};