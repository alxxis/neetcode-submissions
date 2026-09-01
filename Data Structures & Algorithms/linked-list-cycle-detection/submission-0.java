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
    public boolean hasCycle(ListNode head) {
    ListNode temp = head;
    ListNode tempp = head.next;
    while(tempp!=null){
        if(temp==tempp) return true;
        temp = temp.next;
        tempp = tempp.next;
        if(tempp!=null){
            tempp=tempp.next;
        }
    }
    return false;
    }
}
