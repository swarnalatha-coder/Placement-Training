/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        // Return if the linked list is empty.
        if (head == null) return null;

        // Using a HashSet to keep track of seen values.
        HashSet<Integer> seen = new HashSet<>();
        Node curr = head;
        Node prev = null;

        // Iterating through the linked list.
        while (curr != null) {
            // If the current value is a duplicate, remove the node.
            if (seen.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                // If the value is not a duplicate, add it to the set and update the
                // pointers.
                seen.add(curr.data);
                prev = curr;
            }
            curr = prev.next;
        }
        return head;
    }
}