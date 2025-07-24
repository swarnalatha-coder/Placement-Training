class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
         ArrayList<Integer> result = new ArrayList<>();
    
    for (int i = 0; i < arr.length; i++) {
        if (i == 0 || arr[i] != arr[i - 1]) {
            result.add(arr[i]);
        }
    }
    
    return result;

        
    }
}
