package LinkedList;

//https://leetcode.com/problems/reorder-list/
class LListNode {
      int val;
      LListNode next;
      LListNode() {}
      LListNode(int val) { this.val = val; }
      LListNode(int val, LListNode next) { this.val = val; this.next = next; }
  }

class ReorderList {
    public LListNode getMiddle(LListNode node){
        LListNode slow = node;
        LListNode fast = node;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public LListNode reverse(LListNode node){
        LListNode prev = null;
        LListNode present = node;
        LListNode future = present.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = future;
            if(future != null){
                future = future.next;
            }
        }
        return prev;
    }
    public void reorderList(LListNode head) {
        LListNode mid = getMiddle(head);
        System.out.println(mid.val);     
        LListNode hs = reverse(mid);
        LListNode hf = head;
       // System.out.println(hs.val);
         
        while(hf != null && hs != null){
           // System.out.println(hf.val);
           LListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null){
            hf.next = null;
        }
    }
}