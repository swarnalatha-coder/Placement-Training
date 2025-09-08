class Solution {
    public int maxLength(String s) {
        // code here


        // code here
        int mx=0;
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(i);
            else{
                st.pop();
                if(st.isEmpty()) st.push(i);
                else
                    mx=Math.max(mx,i-st.peek());
            
            }
        }
        return mx;
    }
}
    
