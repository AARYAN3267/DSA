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
    public ListNode rotateRight(ListNode head, int k) {
     ListNode temp= head;
     int size=1;
     if(head==null|| head.next== null)return head;
     while (temp.next!=null){
        temp=temp.next;
        size++;
     }
     k= k%size;
     temp.next=head;
     ListNode t1=head;
     int steps= size-k;
     for (int i=1; i<steps; i++){
        t1=t1.next;
     }
     ListNode h1= t1.next;
     t1.next=null;
     return h1;
     
    }
}