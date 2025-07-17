class Solution {
    int floorSqrt(int n) {
        // code here
        int res=1;
        while(res*res<=n){
            res++;
        }
        return res-1;
    }
}