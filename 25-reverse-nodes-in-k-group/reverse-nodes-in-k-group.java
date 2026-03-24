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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null ||k==1)return head;
     ListNode start= head;
     ListNode end= head;
    
     for(int i=1; i<=k-1;i++){
        end= end.next;
         if(end==null)return head;
     }
     ListNode ans=reverseKGroup(end.next, k);
     reverse (start,end);
     start.next= ans;
     return end;
    }
    public void reverse(ListNode start, ListNode end){
        ListNode prev= null;
        ListNode curr= start;
        while(prev!=end){
          ListNode  temp= curr.next;
            curr.next= prev;
            prev= curr;
            curr= temp;
        }
    }
}