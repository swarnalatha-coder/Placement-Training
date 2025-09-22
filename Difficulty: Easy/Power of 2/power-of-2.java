class Solution {
    public static boolean isPowerofTwo(int n) {
       while(n>0){
       return (n&(n-1))==0;
       }
       return false;
    }
}