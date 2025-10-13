/*
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
    Node sortedMerge(Node head1, Node head2) {
        // code here
        // Base cases
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node result;

        if (head1.data < head2.data) {
            result = head1;
            // Recursive call to sortedMerge, not mergeTwoLists
            result.next = sortedMerge(head1.next, head2);
        } else {
            result = head2;
            result.next = sortedMerge(head1, head2.next);
        }

        return result;
    }
}