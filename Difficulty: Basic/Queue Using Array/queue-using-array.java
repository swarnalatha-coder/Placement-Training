class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        arr[rear] = x;
        rear++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if (front == rear) return -1;
            // Queue is empty
            
        
        
        // Your code here
        int x = arr[front];
        front++;
        return x;
    }
}