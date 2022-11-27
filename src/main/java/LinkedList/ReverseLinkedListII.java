package LinkedList;


 //* Definition for singly-linked list.
  class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1() {}
      ListNode1(int val) { this.val = val; }
      ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
  }

class ReverseLinkedListII {
    public ListNode1 reverseBetween(ListNode1 head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode1 present  = head;
        ListNode1 prev = null;
        ListNode1 newEnd = null;
        
        for(int i=0; i<left -1; i++){
            prev = present;
            present = present.next;
        }
        ListNode1 last = prev;
        newEnd = present;
        
        ListNode1 next = present.next;
        for(int i=0 ;i <right-left+1 ; i++){
            present.next = prev;
			prev = present;
			present = next;
			if (next != null)
				next = next.next;
        }
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = present;
        
        return head;
    }
}