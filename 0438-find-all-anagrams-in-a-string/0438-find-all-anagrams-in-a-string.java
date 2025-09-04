class Solution {

    static boolean Fun(HashMap<Character,Integer> hma,HashMap<Character,Integer> hmb){
        if(hma.size()!=hmb.size()){
            return false;
        }
        for(char key:hma.keySet()){
            if(!hmb.containsKey(key)){
                return false;
            }
            int a=hma.get(key);
            int b=hmb.get(key);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> hmp=new HashMap<>();
        HashMap<Character,Integer> hms=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch1=p.charAt(i);
            hmp.put(ch1,hmp.getOrDefault(ch1,0)+1);
        }
        int l=0;
        int k=p.length();
        boolean valid;
        ArrayList<Integer> list=new ArrayList<>();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
           hms.put(ch,hms.getOrDefault(ch,0)+1);
           if(r-l==k){
               char chl=s.charAt(l);
               hms.put(chl,hms.get(chl)-1);
               if(hms.get(chl)==0){
                   hms.remove(chl);
            }
             l++;
           }
           if(r-l+1==k){
               valid=Fun(hms,hmp);
               if(valid){
                  list.add(l);
                }
            }
        }
        return list;
    }
}