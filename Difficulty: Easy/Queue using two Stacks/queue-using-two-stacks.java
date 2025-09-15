// User function Template for Java
class StackQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void push(int B) {
        // code here
        s1.push(B);
    }

    public int pop() {

        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        // If s2 is empty, transfer all elements from s1 → s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        // Pop from s2 (front of queue)
        return s2.pop();
        // code here
    }
}