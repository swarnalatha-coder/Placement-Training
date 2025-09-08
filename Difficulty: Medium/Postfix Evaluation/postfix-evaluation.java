class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack <Integer> st = new Stack<>();
        for(String token:arr){
            switch(token){
            case "+":
            st.push(st.pop()+st.pop());
            break;
            case "-":
            int b=st.pop();
            int a = st.pop();
            st.push(a-b);
            break;
            case "*":
            b=st.pop();
            a = st.pop();
            st.push(a*b);
            break;
            case "/":
            b=st.pop();
            a = st.pop();
            st.push(a/b);
            break;
            default:
                st.push(Integer.parseInt(token));

            }
        }
        return st.peek();
    }
}