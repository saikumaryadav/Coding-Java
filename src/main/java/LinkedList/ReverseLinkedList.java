package LinkedList;


 //* Definition for singly-linked list.
  class ListNode3 {
      int val;
      ListNode3 next;
      ListNode3() {}
      ListNode3(int val) { this.val = val; }
      ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
  }

class ReverseLinkedList {
    public ListNode3 reverseList(ListNode3 head) {
        if(head == null){
            return head;
        }
      ListNode3 prev = null;
      ListNode3 present = head;
      ListNode3 next = present.next;
        
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null)
                next = next.next;
        }
        
        return prev;
    }
}