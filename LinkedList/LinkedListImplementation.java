package LinkedList;

/*
 * 
 * 1. Basic LinkedList Implementations
 * 2. Find Middle in a LinkedList
 * 3. Delete Node whose pointer is Given (Head Node is Not Given)
 * 
 * 
 */

class Node<T>{
	T data;
	Node<T>next;
	public Node(T data) {
		this.data=data;
	}
		
}


public class LinkedListImplementation {
	
	/* Find Middle of LinkedList*/
	
	public static void middleLinkedList(Node<Integer> head) {
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("Middle of LinkedList : "+ slow.data);
	}
	
	/* Delete Node Whose Pointer is Given and Not (Head Node) */
	
	public static void deletePointerNode(Node<Integer> n) {
		
		n.data=n.next.data;
		n.next=n.next.next;
	}
	
	/* Zero Based Indexing */
	public static Node<Integer> InsertNode(int data,int position,Node<Integer> head) {
		Node<Integer>n=new Node(data);
		if(position==0) {
			n.next=head;
			head=n;
			return head;
		}
		Node <Integer>current=head;
		for(int i=0;i<position-1;i++) {
			current=current.next;
			if(current==null) {
				return head;
			}
		}
		n.next=current.next;
		current.next=n;
		return head;
	}
	
	public static Node<Integer> deleteNode(int position,Node<Integer> head) {
		Node <Integer>current=head;
		if(head==null)return null;
		if(position==0) {
			head=current.next;
			return head;
		}
		for(int i=0;i<position-1;i++) {
			current=current.next;
			if(current==null|| current.next==null) {
				return head;
			}
		}
		current.next=current.next.next;
		return head;
		
	}
	
	public static void printLinkedList(Node head) {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}

		System.out.println("End");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>n1=new Node(11);
		Node<Integer> n2=new Node(12);
		Node<Integer> n3=new Node(13);
		Node<Integer> n4=new Node(14);
		Node n5=new Node(15);		
		Node <Integer>head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		printLinkedList(head);
		System.out.println();
		middleLinkedList(head);
		System.out.println();
		printLinkedList(head);
		deletePointerNode(n3);
		System.out.println();
		printLinkedList(head);
	}

}
