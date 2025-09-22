class Solution {
    public static int countBitsFlip(int a, int b) {
        // code here
        int count=0;
        int ans=a^b;
        while(ans!=0){
          ans=(ans&(ans-1));
          count++;
        }
        return count;
    }
}
