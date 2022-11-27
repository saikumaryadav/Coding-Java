package LinkedList;


 //* Definition for singly-linked list.
  class ListNode {
      int val;
      LListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, LListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public LListNode removeElements(LListNode head, int val) {
        while(head != null && head.val == val) {
            head = head.next;
        }
        if(head == null) return head;

        LListNode curr = head;
        LListNode prev = null;

        while(curr!=null ){
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}