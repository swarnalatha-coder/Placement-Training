// User function Template for Java

class Solution {
    public int getSingle(int[] arr) {
        // code here
    
        int a=0;
        int b=0;
        for(int n: arr){
            a^=(n&~b);
            b^=(n&~a);
        }
        return a;
    }
}
  