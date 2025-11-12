class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        String cleaned = "";
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if ((c >= 'a' && c <= 'z') || c == ' ') {
                cleaned += c;
            } else {
                cleaned += " ";
            }
        }

        String[] words = cleaned.split("\\s+");
        boolean[] visited = new boolean[words.length];
        int maxCount = 0;
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (visited[i] || words[i].equals("")) continue;

            boolean isBanned = false;
            for (int b = 0; b < banned.length; b++) {
                if (words[i].equals(banned[b])) {
                    isBanned = true;
                    break;
                }
            }
            if (isBanned) continue;

            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                result = words[i];
            }
        }

        return result;
    }
}
