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
        if(head.next==null){
            return;
        }
        List<ListNode> list=new ArrayList<>();
        ListNode temp=head;

        while(temp!=null){
            ListNode newnode=new ListNode(temp.val);
            list.add(newnode);
            temp=temp.next;
        }
        int i=0;
        ListNode top=null;
        ListNode tr=null;
        int j=list.size()-1;
        while(i<j){
            ListNode x=list.get(i);
            ListNode y=list.get(j);
            if(top==null){
                top=x;
                tr=top;
                tr.next=y;
            tr=y;
            }else{
                tr.next=x;
                tr=x;
            tr.next=y;
            tr=y;
            }
            i++;
            j--;

        }
        if(list.size()%2!=0){
            ListNode yy=list.get(j);
            tr.next=yy;
            tr=yy;
        }
        // head=top;
        head.next=top.next;
        return;


     
        
    }
}