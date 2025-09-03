class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0;
        int cntt=0;
        int cntf=0;
        int ans=0;
        for(int r=0;r<answerKey.length();r++){
            if(answerKey.charAt(r)=='F'){
                cntf++;
            }
            else cntt++;

            while(Math.min(cntt,cntf)>k){
                if(answerKey.charAt(l)=='T'){
                    cntt-=1;
                }
                else cntf-=1;
                
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}