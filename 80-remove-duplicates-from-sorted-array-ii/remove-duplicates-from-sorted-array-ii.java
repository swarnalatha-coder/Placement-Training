class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;


        for (int num : nums) {
                            // Allow at most two occurrences of each element
            if (i < 2 || num != nums[i - 2]) {
                nums[i] = num;
                i++;
            }
        }
    return i; // Length of modified array
    }

}

