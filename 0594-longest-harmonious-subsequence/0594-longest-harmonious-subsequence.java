
class Solution {
    public int findLHS(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        int longest = 0;
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            int val = e.getKey();
            int count = e.getValue();
            Integer nextCount = freq.get(val + 1); 
            if (nextCount != null) {
                longest = Math.max(longest, count + nextCount);
            }
        }

        return longest;
    }
}
