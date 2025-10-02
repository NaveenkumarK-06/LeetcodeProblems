class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;

        while(i>=0 || j>=0 || carry>0){
            int x=(i>=0)?num1.charAt(i)-'0':0;
            int y=(j>=0)?num2.charAt(j)-'0':0;
            int sum=x+y+carry;
            ans.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}