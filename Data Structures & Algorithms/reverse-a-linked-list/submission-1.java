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
    public ListNode reverseList(ListNode head) {
        ListNode behind = null;
        ListNode ahead = head;
        while(head!=null){
            ahead = ahead.next;
            head.next = behind;
            behind = head;
            head = ahead;
        }
        return behind;
    }
}
