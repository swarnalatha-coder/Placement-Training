//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.encryptString(S));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String encryptString(String S){
        StringBuilder finalStr = new StringBuilder();
        char curr=S.charAt(S.length()-1);
        int curlen=1;
        for(int i=S.length()-2;i>=0;i--){
            if(S.charAt(i)==curr){
                curlen++;
            }
              else{
              StringBuilder hexVal = new StringBuilder();
              int count=curlen;
              while(count>0){
                int rem=count%16;
                if(rem<10)
                hexVal.append((char)('0'+rem));
                else
                hexVal.append((char)('a'+rem-10));
                count/=16;
              }
              finalStr.append(hexVal.reverse()).append(curr);
              curr=S.charAt(i);
              curlen=1;
            }
        }
        StringBuilder hexVal = new StringBuilder();
        int count=curlen;
        while(count>0){
            int rem=count%16;
            if(rem<10)
            hexVal.append((char)('0'+rem));
            else
            hexVal.append((char)('a'+rem-10));
            count/=16;
        }
        finalStr.append(hexVal.reverse()).append(curr);
        return finalStr.toString();
    }
}