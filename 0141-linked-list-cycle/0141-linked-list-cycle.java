/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode sloww=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            sloww=sloww.next;
            fast=fast.next.next;
            if(sloww==fast){
                return true;
            }
        }
        return false;
    }
}