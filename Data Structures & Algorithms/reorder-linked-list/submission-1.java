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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode temp = slow;
        while(slow!=null){
            temp = temp.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        ListNode h1 = head;
        ListNode h2 = prev;
        while(h1!=null){
            ListNode temp1 = h1.next;
            h1.next = h2;
            h1 = temp1;
            ListNode temp2 = h2.next;
            h2.next = h1;
            h2 = temp2;
        }
    }
}
