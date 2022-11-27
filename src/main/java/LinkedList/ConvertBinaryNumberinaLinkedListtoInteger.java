package LinkedList;


 //* Definition for singly-linked list.
  class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
  }

class ConvertBinaryNumberinaLinkedListtoInteger {
    public int getDecimalValue(ListNode2 head) {
        StringBuffer sb = new StringBuffer();
        while(head != null){
            sb.append(head.val+"");
            head = head.next;
        }
        
        sb.reverse();
        int count = 0;
        int sum = 0;
        for(int i=0;i<sb.length(); i++){
            if(sb.charAt(i) == '1'){
                sum =sum + (int)Math.pow(2, count);
            }
            count ++;
        }
        return sum;
    }
}