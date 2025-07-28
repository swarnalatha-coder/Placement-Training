class Solution {
    int maxProduct(int[] arr) {
        // code here
        int res=arr[0];
        int maxprod=arr[0];
        int minprod=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=maxprod;
                maxprod=minprod;
                minprod=temp;
            }
         maxprod=Math.max(arr[i],arr[i]*maxprod);
         minprod=Math.min(arr[i],arr[i]*minprod);
         res=Math.max(res,maxprod);
        }   
        return res;
    }
}