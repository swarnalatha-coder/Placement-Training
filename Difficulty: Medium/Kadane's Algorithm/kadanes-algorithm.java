class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        
        int mx=arr[0];
        int sum=0;
        for(int n:arr){
            sum=sum+n;
            mx=Math.max(mx,sum);
            if(sum<0){
                sum=0;
            }
        
        }
        return mx;
    }
}
    

