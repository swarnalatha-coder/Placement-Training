// User function Template for Java

/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node partition(Node node, int x) {
        // Your code here
        Node small = new Node(0), equal = new Node(0), high = new Node(0);
        Node s = small, e = equal, h = high;

        while (node != null) {
            if (node.data < x) {
                s.next = node;
                s = s.next;
            } else if (node.data == x) {
                e.next = node;
                e = e.next;
            } else {
                h.next = node;
                h = h.next;
            }
            node = node.next;
        }

        h.next = null;          // terminate the last list
        e.next = high.next;     // connect equal → high
        s.next = equal.next;    // connect small → equal

        return small.next;   
    }
}