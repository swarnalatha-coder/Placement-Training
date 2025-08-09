class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        Map<Character, Character> dict = new HashMap<>();
        Map<Character, Character> dict1=new HashMap<>();
        int n=s1.length();
        for(int i=0;i<n;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(dict.containsKey(c1)){
                if(dict.get(c1)!=c2) return false;
            }
            else{
                dict.put(c1,c2);
            }
            if(dict1.containsKey(c2)){
                if(dict1.get(c2)!=c1) return false;
            }
            else{
                dict1.put(c2,c1);
            }
        }
        return true;
    }
}