// User function Template for Java

class Solution {

    // Function to push an element in queue.
    void enqueue(Queue<Integer> q, int x) {
        // Code here
        q.add(x);
    }

    // Function to remove front element from queue.
    void dequeue(Queue<Integer> q) {
        
        // code here
         if(!q.isEmpty()){
             q.poll();
         }
    }

    // Function to find the front element of queue.
        
    int front(Queue<Integer> q) {
        // Code here
         if(!q.isEmpty()){
             return q.peek();
         }
         return -1;
    }

        
    // Function to find an element in the queue.
    String find(Queue<Integer> q, int x) {
        // Code here
        return q.contains(x) ? "Yes" : "No";

    }
}