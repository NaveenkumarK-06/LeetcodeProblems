class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        int[] freq = new int[1001];

        for(int x : target)
            freq[x]++;

        for(int y : arr)
            freq[y]--;

        for(int count : freq)
            if(count != 0)
                return false;

        return true;
    }
}
