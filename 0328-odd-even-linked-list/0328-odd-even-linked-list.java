/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null) return head;

        //create two linkedlist
        ListNode odd = head;
        ListNode even = head.next;

        //to add the list further
        ListNode evenHead = even;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd = odd.next;

            even.next=odd.next;
            even = even.next;
        }
        //to add both the linked list
        odd.next=evenHead;

        return head;


    }
}