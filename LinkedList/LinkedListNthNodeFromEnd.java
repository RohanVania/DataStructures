/*

1. Nth Node From the End of the LinkedList (2 Approaches )
  
  (Naive Approach) : O(n)
  Calculate the size by traversing the Entire Linkedlist and then size-n will give you the node from the end of the LinkedList. (size-n+1) Non-Zero Based Indexing
  
  (Two Pointer Approach): O(n)
  
  Point the slow and fast node at head and Move fast node till n , and then move fast node by 1 and slow node by 1 till, fast node reaches Last Node
  and at that time slow node pointer will be at Nth Position from the End
  

*/

public class LinkedListNthNodeFromEnd {
	
	 // Naive Approach 
	
   public static int getNthNode(Node <Integer> head,int n) {
	   Node <Integer>current=head;
	   int size=0;
	   if(n==0) return -1;
	   while(current!=null) {
		   current=current.next;
		   size++;
	   }
	   current=head;
	   if(n>size)return -1;
	   
	   for(int i=0;i<size-n;i++) {
		   current=current.next;
		   
	   }
	   return current.data;
   }
        
    // Two Pointer Approach
   
   public static int getNthNodeOptimized(Node<Integer> head,int n) {
	   Node<Integer> slow=head;
	   Node<Integer> fast=head;
	   if(n==0)return -1;
	   
	   for(int i=0;i<n-1;i++) {
		   fast=fast.next;
		   if(fast==null) {
			   return -1;
		   }
	   }
	   
	   while(fast.next!=null) {
		   fast=fast.next;
		   slow=slow.next;
   }
	   return slow.data;
	   
   }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1=new Node(10);
		Node<Integer> n2=new Node(11);
		Node<Integer> n3=new Node(12);
		Node<Integer> n4=new Node(13);
		Node<Integer> n5=new Node(14);
		Node<Integer> n6=new Node(15);
		Node<Integer> n7=new Node(16);
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		
		System.out.println(getNthNode(head, 0));
		System.out.println(getNthNodeOptimized(head, 10));

	}

}
