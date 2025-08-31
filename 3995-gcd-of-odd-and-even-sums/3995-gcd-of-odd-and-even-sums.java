class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0;
        int evensum=0;
        int i=1;
        while(n!=0){
            if(i%2!=0){
                oddsum+=i;
            }
            else{
                evensum+=i;
            }
            n--;
        }
        while(oddsum!=0 && evensum!=0){
            if(oddsum>=evensum){
                oddsum=oddsum%evensum;
            }
            else{
                evensum=evensum%oddsum;
            }
        }
        if(oddsum==0){
            return evensum;
        }
        else return oddsum;
    }
}