class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int dupli = -1;
        int n = nums.length;
        for (int num : nums) {
            if (hs.contains(num)) {
                dupli = num;
            }
            hs.add(num);
        }
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (!hs.contains(i)) {
                missing = i;
                break;
            }
        }
        return new int[]{dupli, missing};
    }
}
