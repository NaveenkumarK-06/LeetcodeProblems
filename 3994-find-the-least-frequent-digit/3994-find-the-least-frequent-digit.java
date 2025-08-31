class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap <Integer,Integer> hs=new HashMap<>();
        while (n != 0) {
            int ld = n % 10;
            hs.put(ld, hs.getOrDefault(ld, 0) + 1);
            n = n / 10;
        }
        int minFreq = Integer.MAX_VALUE;
        int digitWithMinFreq = -1;
        for (int key : hs.keySet()) {
            int freq = hs.get(key);
            if (freq < minFreq || (freq == minFreq && key < digitWithMinFreq)) {
                minFreq = freq;
                digitWithMinFreq = key;
            }
        }
        
        return digitWithMinFreq;
    }
}