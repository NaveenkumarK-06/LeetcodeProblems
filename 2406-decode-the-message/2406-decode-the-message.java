class Solution {
    public String decodeMessage(String key, String message) {
        HashMap <Character,Character> hm=new HashMap<>();
        int alp=97;
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!=' ' && !hm.containsKey(ch)){
                hm.put(ch,(char)alp);
                alp++;
            }
        }
        String ans="";
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch==' '){
                ans+=' ';
            }
            else{
                char val=hm.get(ch);
                ans+=val;
            }
        }
        return ans;
    }
}