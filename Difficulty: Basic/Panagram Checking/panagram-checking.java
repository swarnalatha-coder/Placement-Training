// User function Template for Java

class Solution {

    // Complete the function
    // str: input string
    public static boolean isPanagram(String str) {
        // Check if given string is panagram
        String s=str.toLowerCase();
        for(char i='a';i<='z';i++){
            if(s.indexOf(i)==-1){
                return false;
            }
            
        }
        return true;
    }
}