class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree = 0;
        int minLength = nums.length;
        boolean visited[] = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            int count = 0;
            int start = i;
            int end = i;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    end = j;         // track last occurrence
                    visited[j] = true;  // mark as visited
                }
            }

            if (count > degree) {
                degree = count;                // new highest frequency found
                minLength = end - start + 1;   // update subarray length
            } else if (count == degree) {
                minLength = Math.min(minLength, end - start + 1);
            }
        }

        return minLength;
    }
}
