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
    public ListNode removeElements(ListNode head, int x) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        temp=head;
        ListNode room=new ListNode(0);
        ListNode ans=room;
      while(temp!=null){
        if(temp.val!=x){
            ListNode y=new ListNode(temp.val);
            ans.next=y;
            ans=ans.next;
        }
        temp=temp.next;
      }
       return room.next;

    }
}