// 30th June 2024
// Difficulty - Easy
// Topic Tags - doubly-linked-list, Linked List, Data Structures & Algorithms
// Asked in the companies like - Amazon & Walmart

class Solution {
      public Node deleteNode(Node head, int x) {
        if(x==1)return head.next;
        int count=1;
        Node temp=head;
        while(count<x){
            temp=temp.next;
            count++;
        }
        temp.prev.next=temp.next;
        if(temp.next!=null)temp.next.prev=temp.prev;
        return head;
    }
}
// Time Complexity:- O(N)
// Space Complexity:- O(1)

