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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode ans = null;
        ListNode j = list1;
        ListNode k = list2;
        if(list1 == null) return list2;
        if(list2==null) return list1;
        if(list1.val> list2.val){
            ans = list2;
            k = ans.next;
        }
        else{
            ans = list1;
            j = ans.next;
        }
        ListNode head = ans;
        while(j!= null && k != null){
            if(j.val > k.val){
                head.next = k;
                head = k;
                k = k.next;
            } else{
                head.next = j;
                head = j;
                j = j.next;
            }
        }
        if(j == null){
            head.next = k;
        } else head.next = j;
        return ans;
    }
}