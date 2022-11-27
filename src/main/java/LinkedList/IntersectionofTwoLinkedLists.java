package LinkedList;


import java.util.HashSet;

// * Definition for singly-linked list.
  class ListtNode {
      int val;
      ListtNode next;
      ListtNode(int x) {
          val = x;
          next = null;
      }
  }

public class IntersectionofTwoLinkedLists {
    public ListtNode getIntersectionNode(ListtNode headA, ListtNode headB) {
        HashSet<ListtNode> set = new HashSet<>();
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}