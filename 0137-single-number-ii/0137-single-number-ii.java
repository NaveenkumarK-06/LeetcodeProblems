
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int num : hm.keySet()) {
            if (hm.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}
