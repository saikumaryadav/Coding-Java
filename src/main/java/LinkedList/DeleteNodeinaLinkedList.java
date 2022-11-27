package LinkedList;


 //* Definition for singly-linked list.
  class Listnnode {
      int val;
      Listnnode next;
      Listnnode(int x) { val = x; }
  }

class DeleteNodeinaLinkedList {
    public void deleteNode(Listnnode node) {
      node.val = node.next.val;
        node.next = node.next.next;
    }
}