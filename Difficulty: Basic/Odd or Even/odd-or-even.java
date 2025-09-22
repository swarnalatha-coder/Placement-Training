class Solution {
    static boolean isEven(int n) {
        // code here
        int a=n&1;
        if(a==1) return false;
        else return true;
    }
}