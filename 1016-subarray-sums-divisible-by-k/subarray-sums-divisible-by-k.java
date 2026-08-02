class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Empty prefix has remainder 0
        map.put(0, 1);

        int sum = 0;
        int result = 0;

        for (int num : nums) {

            sum += num;

            // Normalize remainder to handle negative sums
            int remainder = ((sum % k) + k) % k;

            // If we've seen this remainder before,
            // each occurrence forms a valid subarray
            if (map.containsKey(remainder)) {
                result += map.get(remainder);
            }

            // Record this remainder
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return result;
    }
}