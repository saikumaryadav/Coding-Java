package LinkedList;


 //* Definition for singly-linked list.
  class ListNode4 {
      int val;
      ListNode4 next;
      ListNode4() {}
      ListNode4(int val) { this.val = val; }
      ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
  }

class MiddleoftheLinkedList {
    public ListNode4 middleNode(ListNode4 head) {
    /*    ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }*/
         ListNode4 midPrev = null;
        if(head== null || head.next == null){
            return head;
        }
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode4 mid = midPrev.next;
        midPrev.next = null;
      // System.out.println(mid.val);
        return mid;
    }
}