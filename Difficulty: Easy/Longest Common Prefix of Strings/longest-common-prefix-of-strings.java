// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr==null || arr.length==0)
         return "";
        String pre=arr[0];
        for(String word:arr){
            while(word.indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
            }
        }
        return pre;
    }
}