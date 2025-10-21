class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet=new HashSet<>(wordDict);

        int minLen=Integer.MAX_VALUE;
        int maxLen=0;

        for(String w : wordDict){
            minLen=Math.min(minLen,w.length());
            maxLen=Math.max(maxLen,w.length());
        }

        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;

        for(int i=1;i<=s.length();i++){
            for(int len=minLen ; len<=maxLen && len<=i ; len++){
                if(!dp[i-len]) continue;
                String word=s.substring(i-len,i);
                if(wordSet.contains(word)){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}