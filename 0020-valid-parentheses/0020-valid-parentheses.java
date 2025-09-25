class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // For closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatch
                }
            }
        }
        
        // If stack is empty → all matched
        return stack.isEmpty();
    }
}
    
  /*  public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "((()))";
        String test4 = "(()";
        
        System.out.println(test1 + " → " + isBalanced(test1)); // true
        System.out.println(test2 + " → " + isBalanced(test2)); // false
        System.out.println(test3 + " → " + isBalanced(test3)); // true
        System.out.println(test4 + " → " + isBalanced(test4)); // false
    }
}*/
