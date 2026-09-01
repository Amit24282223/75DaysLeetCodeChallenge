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
    public ListNode reverseBetween(ListNode head, int left, int right) {   
        if(head==null||head.next==null){
            return head;
        }
        if(left>right){
            return head;
        }
        ListNode newnode=null; 
        ListNode newtemp=null;
        newtemp=newnode;
        ListNode temp=null;
        temp=head;
        int x=0;
        while(temp!=null){
            if(left<=x){
                break;
            }
            ListNode t=new ListNode(temp.val);
            if(newnode==null){
                newnode=t;
                newtemp=newnode;
            }else{ 
            newtemp.next=t;
            newtemp=t;
            temp=temp.next;
            }
            x++;
        }  
        List<ListNode> list=new ArrayList<>();
        while(temp!=null){
            if(x>right){
                break;
            }
            list.add(temp);
            temp=temp.next;
            x++;

        }
        for(int i=list.size()-1;i>=0;i--){
            ListNode r=new ListNode(list.get(i).val);
            newtemp.next=r;
            newtemp=r;
        }
        while(temp!=null){
            ListNode r=new ListNode(temp.val);
            newtemp.next=r;
            newtemp=r;
            temp=temp.next;
        }
        // head.next=newnode.next;
        return newnode.next;

        
    }
}