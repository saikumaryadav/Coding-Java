package LinkedList;


// * Definition for singly-linked list.
  class ListNode9 {
      int val;
      ListNode9 next;
      ListNode9() {}
      ListNode9(int val) { this.val = val; }
      ListNode9(int val, ListNode9 next) { this.val = val; this.next = next; }
  }
class RemoveDuplicatesfromSortedList {
    public ListNode9 deleteDuplicates(ListNode9 head) {
        ListNode9 temp = head;
        if(head == null){
            return head;
        }
        while( temp.next != null){
            if( temp.val == temp.next.val){
                 temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
       // temp.next = null;
        return head;
    }
}