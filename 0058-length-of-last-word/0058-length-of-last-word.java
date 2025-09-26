class Solution {
    public int lengthOfLastWord(String s) {
        String [] words=s.split(" ");
        int len=words.length-1;
        int ans=0;
        for(String word : words){
            if(words[len]==word){
                ans=word.length();
            }
        }
        return ans;
    }
}