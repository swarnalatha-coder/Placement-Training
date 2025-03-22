//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int n = s.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int[] arr = IntArray.input(br);

            Solution obj = new Solution();
            int res = obj.maxValue(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    int maxValue(int[] arr) {
        int n = arr.length;
        
        // Handle edge cases
        if (n == 1) return arr[0]; // Single house
        if (n == 2) return Math.max(arr[0], arr[1]); // Two houses
        
        // Solve for two cases: skip first or skip last house
        int case1 = rob(arr, 0, n - 2); // Exclude the last house
        int case2 = rob(arr, 1, n - 1); // Exclude the first house

        return Math.max(case1, case2); // Take the maximum of the two cases
    }

    // Helper method: Linear rob function for non-circular range
    int rob(int[] arr, int start, int end) {
        int prev2 = 0; // Two houses before
        int prev1 = 0; // One house before

        for (int i = start; i <= end; i++) {
            int pick = arr[i] + prev2; // Rob current house
            int notPick = prev1; // Skip current house
            int curr = Math.max(pick, notPick); // Take the max of the two choices
            prev2 = prev1; // Move forward
            prev1 = curr; // Move forward
        }
        return prev1; // The maximum profit
    }
}
