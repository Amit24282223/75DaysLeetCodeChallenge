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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode current=new ListNode(0);
    int count=0;
    ListNode temp=current;
    while(l1!=null||l2!=null||count!=0){
        int sum=0;
        sum+=count;
        if(l1!=null){
             sum+=l1.val;
             l1=l1.next;
        }
        if(l2!=null){
             sum+=l2.val;
             l2=l2.next;
        }
        ListNode newnode=new ListNode(sum%10);
        temp.next=newnode;
        temp=newnode;
         count=sum/10;
    }
    return current.next;
        
    }  
}