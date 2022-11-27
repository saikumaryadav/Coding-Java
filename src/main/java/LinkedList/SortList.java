package LinkedList;


// * Definition for singly-linked list.
 class ListNode5 {
     int val;
     ListNode5 next;
     ListNode5() {}
     ListNode5(int val) { this.val = val; }
     ListNode5(int val, ListNode5 next) { this.val = val; this.next = next; }
 }

class SortList {
   public ListNode5 getmiddleNode(ListNode5 head) {
		/* ListNode midPrev = head;
        while (head != null && head.next != null) {
            midPrev =  midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
      // System.out.println(mid.val);
        return mid;*/
       ListNode5 slow = null;
        ListNode5 fast = head;
        while(fast != null && fast.next != null){
            slow = slow == null ? head : slow.next;
            fast = fast.next.next;
        }
       ListNode5 mid = slow.next;
        slow.next = null;
      // System.out.println(slow.val);
        return mid;
	}

	public ListNode5 mergeTwoLists(ListNode5 list1, ListNode5 list2) {
		ListNode5 head = new ListNode5();
		ListNode5 temp = head;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				temp.next = list1;
				temp = temp.next;
				list1 = list1.next;
			} else {
				temp.next = list2;
				temp = temp.next;
				list2 = list2.next;
			}
		}
		if (list1 != null) {
			temp.next = list1;
		}
		if (list2 != null) {
			temp.next = list2;
		}
		return head.next;
	}

	public ListNode5 sortList(ListNode5 head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode5 mid = getmiddleNode(head);
		ListNode5 left = sortList(head);
		ListNode5 right = sortList(mid);
		return mergeTwoLists(left, right);
	}
}