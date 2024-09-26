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
    public int getDecimalValue(ListNode head) {
        int size = -1;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int ans = 0;
        while(head != null){
            ans += head.val * Math.pow(2, size--);
            head = head.next;
        }
        return ans;
    }
}