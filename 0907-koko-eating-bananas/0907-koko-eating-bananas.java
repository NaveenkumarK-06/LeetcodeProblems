class Solution {

    public boolean isPossible(int[] piles, int h, int k) {
        for (int val : piles) {
            int hours = (val + k - 1) / k; // same as ceil(val/k)
            h -= hours;
            if (h < 0) return false;
        }
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = (int) 1e9;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (isPossible(piles, h, m)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
