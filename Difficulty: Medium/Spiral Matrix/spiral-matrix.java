// User function Template for Java

class Solution {

    public int findK(int a[][], int n, int m, int k) {
        // Your code goes here
        ArrayList<Integer> res=new ArrayList<>();
        n=a.length;
        m=a[0].length;
       int top=0,bot=n-1,left=0,right=m-1;
       while(top<=bot && left<=right){
        for(int i=left;i<=right;i++){
            res.add(a[top][i]);
        }   
          top++;
        for(int i=top;i<=bot;i++){
            res.add(a[i][right]);
           
        }
        right--;
        if(top<=bot){
            for(int i=right;i>=left;i--){
                res.add(a[bot][i]);
            }
        }
        bot--;
        if(left<=right){
            for(int i=bot;i>=top;i--){
                res.add(a[i][left]);
            }
        }
        left++;  
       }
       return res.get(k-1);


    }
}