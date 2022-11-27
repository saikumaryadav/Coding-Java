package LinkedList;


 // Definition for singly-linked list.
  class Listnode {
      int val;
      Listnode next;
      Listnode() {}
      Listnode(int val) { this.val = val; }
      Listnode(int val, Listnode next) { this.val = val; this.next = next; }
  }

class PalindromeLinkedList {
    public Listnode getMiddleNode(Listnode head){
        if(head == null){
            return null;
        }
        Listnode fast = head;
        Listnode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Listnode reverse(Listnode node){
        Listnode prev = null;
        Listnode present = node;
        Listnode nextt = present.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = nextt;
            if(nextt != null){
                nextt = nextt.next;
            }
        }
        return prev;
    }
    public boolean isPalindrome(Listnode head) {
        Listnode mid = getMiddleNode(head);
       // System.out.println(mid);
        Listnode headSecond = reverse(mid);
       // System.out.println(headSecond);
        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        
        return head == null || headSecond == null;
    }
}