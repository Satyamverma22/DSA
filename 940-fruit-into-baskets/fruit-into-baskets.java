import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();
        
        int n = fruits.length;
        int i = 0;
        int j = 0;

        int count = 0;

        while(j < n){

            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            while(map.size() > 2){

                map.put(fruits[i], map.get(fruits[i]) - 1);

                if(map.get(fruits[i]) == 0){
                    map.remove(fruits[i]);
                }

                i++;
            }

            count = Math.max(count, j - i + 1);

            j++;
        }

        return count;
    }
}