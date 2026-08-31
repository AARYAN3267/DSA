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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
   if(head==null||head.next==null)return new int []{-1,-1}; 
    int prevind=-1;
    int firstcri= -1;
    int min= Integer.MAX_VALUE;
     ListNode curr= head.next;
     ListNode prev= head;
    int currind=1;
    while(curr.next!=null){
    boolean isMax= curr.val>prev.val&& curr.val>curr.next.val;
    boolean isMin= curr.val<prev.val&& curr.val<curr.next.val;
  if(isMax||isMin){
    if(firstcri==-1)firstcri=currind;
    else{
        min= Math.min(min,currind-prevind);
    }
    prevind=currind;
  }
  prev=curr;
  curr=curr.next;
  currind++;
    }
    if(firstcri==-1||firstcri==prevind)return new int[]{-1,-1};
    return new int[]{min,prevind-firstcri};
    }
}