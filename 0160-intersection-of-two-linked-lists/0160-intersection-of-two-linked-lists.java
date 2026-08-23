/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Approach 2 
        ListNode a = headA;
        ListNode b = headB;

        while(a!=b){
            //using IF_ELSE LADDER
            // if(a==null) a=headB;
            // else a=a.next;

            // if(b==null) b=headA;
            // else b=b.next;

            //USING TERNARY OPERATOR
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}