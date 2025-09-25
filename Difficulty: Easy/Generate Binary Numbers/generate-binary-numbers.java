class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> result = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {
            int temp = num;
            String binary = "";

            // Convert decimal number to binary
            while (temp > 0) {
                int rem = temp % 2;

                if (rem == 0)
                    binary += "0";
                else
                    binary += "1";

                temp = temp / 2;
            }

            // reverse to get correct order
            StringBuilder sb = new StringBuilder(binary);
            binary = sb.reverse().toString();

            result.add(binary);
        }

        return result;
    }
}
