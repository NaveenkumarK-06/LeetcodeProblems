
class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);  
            } 
            else if (ch == ')') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            maxLen = Math.max(maxLen, st.size());
        }

        return maxLen;
    }
}
