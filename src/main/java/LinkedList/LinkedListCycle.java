package LinkedList;



  class ListNode7 {
      int val;
      ListNode7 next;
      ListNode7(int x) {
          val = x;
          next = null;
      }
  }

public class LinkedListCycle {
    public boolean hasCycle(ListNode7 head) {
        ListNode7 fast= head;
        ListNode7 slow = head;
        if(head == null || head.next == null)
            return false;
        while(fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}