package LinkedList;


 //* Definition for singly-linked list.
  class ListNode8 {
      int val;
      ListNode8 next;
      ListNode8() {}
      ListNode8(int val) { this.val = val; }
      ListNode8(int val, ListNode8 next) { this.val = val; this.next = next; }
  }
class MergeTwoSortedLists {
  
    public ListNode8 mergeTwoLists(ListNode8 list1, ListNode8 list2) {
    
        ListNode8 head = new ListNode8();
        ListNode8 temp =head;
        while(list1 !=null && list2 !=null){
            if(list1.val < list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }else{
                temp.next = list2;
                temp = temp.next;
                list2= list2.next;
            }
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2!=null){
            temp.next = list2;
        }
       // temp.next = list1 == null ? list2:list1; 
        return head.next;
        
        
        
        
        
        /*  ListNode ans = new ListNode();
        ListNode head = ans;
        
        while(list1 != null && list2!= null){
            if(list1.val < list2.val ){
                ListNode node = new ListNode(list1.val);
                if(ans == null){
                    ans = node;
                    head = ans;
                }else{
                    while(ans.next !=null){
                        ans = ans.next;
                    }
                    ans.next = node;
                }
                list1 = list1.next;
            }else{
                  ListNode node = new ListNode(list2.val);
                if(ans == null){
                    ans = node;
                    head = ans;
                }else{
                    while(ans.next !=null){
                        ans = ans.next;
                    }
                    ans.next = node;
                }
                list2 = list2.next;
            }
        }
        while(list1 != null){
                ListNode node = new ListNode(list1.val);
                if(ans == null){
                    ans = node;
                    head = ans;
                }else{
                    while(ans.next !=null){
                        ans = ans.next;
                    }
                    ans.next = node;
                }
                list1 = list1.next;
        }
        while(list2 != null){
            ListNode node = new ListNode(list2.val);
                if(ans == null){
                    ans = node;
                    head = ans;
                }else{
                    while(ans.next !=null){
                        ans = ans.next;
                    }
                    ans.next = node;
                }
                list2 = list2.next;
        }
      //  System.out.println(head.val);
        return head.next;*/
    }
}