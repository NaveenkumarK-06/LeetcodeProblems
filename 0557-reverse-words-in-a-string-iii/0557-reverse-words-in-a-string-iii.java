class Solution {
    public String reverseWords(String s) {
        String [] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word: words) {
            StringBuilder rev=new StringBuilder(word);
            result.append(rev.reverse().append(" "));
        }
        return result.toString().trim();
    }
}