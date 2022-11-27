package LinkedList;


 //* Definition for singly-linked list.
  class ListNode6 {
      int val;
      ListNode6 next;
      ListNode6(int x) {
          val = x;
          next = null;
      }
  }

public class LinkedListCycleII {
    public int cycleCount(ListNode6 slow, ListNode6 fast){
        int count = 0;
        do{
            slow = slow.next;
            count++;
        }while(slow != fast);
        return count;
    }
 /*   public int CycleLength(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		if (head == null || head.next == null)
			return 0;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				ListNode temp = slow;
				int count = 0;
				do {
					temp = temp.next;
					count++;
				} while (temp != slow);
				return count;
			}
		}
		return 0;
	}*/
    public ListNode6 detectCycle(ListNode6 head) {
        ListNode6 fast = head;
        ListNode6 slow = head;
        if(head == null || head.next == null){
            return null;
        }
        int count = 0;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                count = cycleCount(slow, fast);
                break;
            }
        }
        if(count == 0){
            return null;
        }
        int index =count;
        ListNode6 f = head;
        ListNode6 s = head;
        while(count >0){
            s = s.next;
            count--;
        }
        while(s!=f){
            s = s.next;
            f = f.next;
            
        }
        return s;
        
        
        
     /*   int length = 0;
        ListNode fast= head;
        ListNode slow = head;
        if(head == null || head.next == null)
            return null;
        while(fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                length = CycleLength(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        
        ListNode f = head;
        ListNode s = head;
        while(length > 0){
            s= s.next;
            length--;
        }
        while(f !=s){
            s= s.next;
            f=f.next;
        }
        return s;*/
    }
}