class Solution {
    public double myPow(double x, int n) {
        double res=1;
        if(n<0){
            n=-1*n;
            x=1/x;
        }
        while(n!=0){
           if(n%2!=0){
              res=res*x;
           }
           
  
            x=x*x;
            n=n/2;
        }
        

        
        

        
        return res;
    }
}