class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(' || ch== '[' || ch== '{'){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.isEmpty() || st.pop()!='('){
                   return false;
                }
            }
            else if(ch==']'){
                if(st.isEmpty() || st.pop()!='['){
                  return false;
                }
            }
            else if(ch=='}'){
                if(st.isEmpty() || st.pop()!='{'){
                 return false;
                }
            }
        }
        return st.isEmpty();
    }
}
