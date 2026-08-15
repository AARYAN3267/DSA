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
    public int[] nextLargerNodes(ListNode head) {
     ListNode prev=null;
     ListNode curr= head;
     Stack<Integer>st= new Stack<>();
     List<Integer>list= new ArrayList<>();
     while(curr!=null){
        ListNode next= curr.next;
        curr.next= prev;
        prev=curr;
        curr=next;
     }
     curr=prev;
     while(curr!=null){
 while(!st.isEmpty()&& st.peek()<=curr.val){
st.pop();
 }
 if(st.isEmpty())list.add(0);
 else{list.add(st.peek());}
 st.push(curr.val);
 curr=curr.next;
     }
     int ans[]= new int[list.size()];
     int j=ans.length-1;
     for(int a:list){
        ans[j]=a;
        j--;
     }
     return ans;
    }
}