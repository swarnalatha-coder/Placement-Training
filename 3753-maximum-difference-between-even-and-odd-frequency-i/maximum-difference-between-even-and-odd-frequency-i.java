class Solution {
    public int maxDifference(String s) {
        
        Map<Character, Integer> dict=new HashMap<>();
        for(char ch: s.toCharArray()){
            dict.put(ch,dict.getOrDefault(ch,0)+1);
            
        }
        int oddf=0;
        int evenf=Integer.MAX_VALUE;
        for(int val: dict.values()){
            if(val%2==0){
                evenf=Math.min(evenf,val);
            }
            else{
                oddf=Math.max(oddf,val);

            }
        }
        return oddf-evenf;
    }
}