class Solution {
    public boolean isPalindrome(String s) {

        String newStr="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
            newStr+=ch;
            }
        } 

       newStr=newStr.toLowerCase();
       int len=newStr.length()-1;
       String ans="";

       for(int i=len;i>=0;i--){
        ans+=newStr.charAt(i);
       }

       return ans.equals(newStr);
    }
}