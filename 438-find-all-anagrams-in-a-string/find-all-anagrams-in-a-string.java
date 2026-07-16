class Solution {
    static boolean allzero(int[] counter){
        for(int i = 0;i < counter.length;i++){
            if(counter[i] != 0) return false;
        }
        return true;
    }


    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        
        int[] counter = new int[26];
        
        for(int i = 0;i < p.length();i++){      //to count frequency
            char ch = p.charAt(i);
            
            counter[ch - 'a']++;
        }
        
        //making sliding window
        
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(j < n){
            counter[s.charAt(j) - 'a']--;
            
            if(j - i + 1 == p.length()){
                if(allzero(counter)){
                    list.add(i);
                }
                counter[s.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return list;
    }
}