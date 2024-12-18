//package linkedlist;
//class Node
//{
//	 int data;
//	 Node next;
//	 
//	 public Node(int data)
//	 {
//		 this.data=data;
//		 this.next=null;
//	 }
//}
//class LinkedList
//{
//	Node head;
//	void insertAtFront(int newData)
//	{
//		Node newNode= new Node(newData);
//		//set the next pointer of new node to the current head.
//		newNode.next= head;
//		
//		//update the head of point to the new node
//		 head=newNode;
//		
//	}
//	
//	//method to print the linked list
//	void printList()
//	{
//		Node temp=head;
//		while(temp!=null)
//		{
//			System.out.println(temp.data +" ");
//			temp=temp.next;
//		}
//		System.out.println();
//	}
//
//	
//}
//public class InsertionAtFront
//{
//	public static void main(String[] args)
//	{
//		LinkedList mylist = new LinkedList();
//		mylist.insertAtFront(1);
//		mylist.insertAtFront(2);
//		mylist.insertAtFront(3);
//		System.out.println("before fornt node update");
//		mylist.printList();
//		
//		mylist.insertAtFront(4);
//		System.out.println("before fornt node update");
//		mylist.printList();
//	}
//
//}
