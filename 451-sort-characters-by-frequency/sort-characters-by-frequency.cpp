class Solution {
public:
    string frequencySort(string s) {

        // Stores frequency of every character
        unordered_map<char, int> freq;

        for(char ch : s){
            freq[ch]++;
        }

        // Store (character, frequency) pairs
        vector<pair<char,int>> arr;

        for(auto it : freq){
            arr.push_back(it);
        }

        // Sort in descending order of frequency
        sort(arr.begin(), arr.end(),
            [](pair<char,int> a, pair<char,int> b){
                return a.second > b.second;
            });

        string ans = "";

        // Add every character frequency number of times
        for(auto it : arr){
            ans.append(it.second, it.first);
        }

        return ans;
    }
};