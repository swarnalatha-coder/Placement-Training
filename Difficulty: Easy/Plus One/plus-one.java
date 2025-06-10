// User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // code here
       for (int i = N - 1; i >= 0; i--) {
            if (arr.get(i) < 9) {
                arr.set(i, arr.get(i) + 1);
                return arr;
            }
            arr.set(i, 0); // Set current digit to 0 if it's 9
        }

        // If all digits were 9, we need an extra leading 1
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.addAll(arr);
        return result;
    }
}