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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return head;
        }
          ListNode temp=head;
          ListNode newNode=null;
          ListNode y=null;
          while(temp!=null){
            if(temp.val<x){
                  ListNode t=new ListNode(temp.val);
                if(newNode==null||y==null){
                    newNode=t;
                    y=t;
                }else{
                    y.next=t;
                    y=t;
                }
            }
            temp=temp.next;
          }
        //   y.next=null;
          
          ListNode temp2=head;
         while(temp2!=null){
            if(temp2.val>=x){
                ListNode t=new ListNode(temp2.val);
                if(newNode==null){
                    newNode=t;
                    y=t;
                
                }else{
                    y.next=t;
                    y=t;
                }
            }
            temp2=temp2.next;
         }
          return newNode;

        
    }
}