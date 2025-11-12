import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        StringBuilder sb = new StringBuilder();
        paragraph = paragraph.toLowerCase();
        for (char c : paragraph.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            } else {
                sb.append(' ');
            }
        }

        String[] words = sb.toString().split("\\s+");

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            if (!bannedSet.contains(w)) {
                freq.put(w, freq.getOrDefault(w, 0) + 1);
            }
        }

        String result = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}
