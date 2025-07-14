class Solution {
    public boolean isHappy(int n) {
        while(n!=4){
            if(n==1){
               return true;
            
              
            }
            n=sumOfpower(n);
        }
        return false;
    }
    public int sumOfpower(int n){
        int res=0;
        while(n!=0){
            res+=(n%10)*(n%10);
            n=n/10;
        }
        return res;
    }
    
}