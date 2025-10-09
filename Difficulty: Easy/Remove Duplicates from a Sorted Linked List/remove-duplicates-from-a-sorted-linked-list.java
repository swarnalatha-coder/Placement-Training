/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
         // Base case: if the list is empty, return
        if (head == null || head.next == null)
            return head;

        // Recursively remove duplicates from the rest of the list
        head.next = removeDuplicates(head.next);

        // If current node is a duplicate of the next node
        if (head.data == head.next.data)
            return head.next;  // skip the duplicate
        else
            return head; 
    }

   

    
}