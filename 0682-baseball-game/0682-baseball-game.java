class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record =new Stack<>();
        
        for(String op : operations){
            int sum=0;
            if(op.equals("+")){
                int to=record.pop();
                int to2=record.peek();
                sum=to+to2;
                record.push(to);
                record.push(sum);
            }
            else if(op.equals("D")){
                record.push(2*record.peek());
            }
            else if(op.equals("C")){
                record.pop();
            }
            else{
                int num=Integer.valueOf(op);
                record.push(num);
            }
        }
        int ans=0;
        for(int val : record){
             ans+=val;
        }

        return ans;
    }
}