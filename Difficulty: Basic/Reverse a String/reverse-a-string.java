// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        String reversed="";
        for(int i=s.length()-1;i>=0;i--){
            reversed+=s.charAt(i);
        }
        return reversed;
    }
}