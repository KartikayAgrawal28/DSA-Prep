/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //copy value of next  node to the node which we want to delte and simple remove the next ndoe
        node.val = node.next.val;
        //remove the next node 
        node.next=node.next.next;
    }
}