// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int mxp=0;
        int minCost=prices[0];
        for(int i=1;i<prices.length;i++){
            mxp=Math.max(mxp,prices[i]-minCost);
            minCost=Math.min(prices[i],minCost);
        }
        return mxp;
    }
}