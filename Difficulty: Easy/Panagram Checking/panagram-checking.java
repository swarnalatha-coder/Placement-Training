class Solution {
    public static boolean checkPangram(String s) {
        // code here
        String str=s.toLowerCase();
        for(char i='a';i<='z';i++){
            if(str.indexOf(i)==-1){
                return false;
            }
        }
        return true;
    }
}