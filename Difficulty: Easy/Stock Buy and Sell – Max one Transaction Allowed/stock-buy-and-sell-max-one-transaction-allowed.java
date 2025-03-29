//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int prices[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                prices[i] = Integer.parseInt(arr[i]);
            }
            Solution obj = new Solution();
            int res = obj.maximumProfit(prices);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
   
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE; // To keep track of the lowest price so far
        int maxProfit = 0; // To store the maximum profit

        // Loop through the prices array
        for (int i = 0; i < n; i++) {
            // Update the minimum price if the current price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate the profit and update the maximum profit
            else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }
}

   