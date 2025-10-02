class Solution {
    public int calculate(String s) {
        int result = 0;
        int lastNum = 0;  // stores last number for * or /
        int num = 0;
        char prevOperator = '+';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if (prevOperator == '+') {
                    result += lastNum;  // add previous number to result
                    lastNum = num;      // update lastNum
                } else if (prevOperator == '-') {
                    result += lastNum;
                    lastNum = -num;
                } else if (prevOperator == '*') {
                    lastNum = lastNum * num;
                } else if (prevOperator == '/') {
                    lastNum = lastNum / num;
                }

                prevOperator = ch;
                num = 0;
            }
        }

        result += lastNum; // add the last pending number
        return result;
    }
}
