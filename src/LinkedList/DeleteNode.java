package LinkedList;

import LinkedList.NthToLast.Node;

public class DeleteNode {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
		    this.data=data;	
		    this.next=null;
		}
		
	}
	public boolean isDeleteNode(Node n)
	{
		if(n == null || n.next == null)
		{
			return false;
		}
		
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}
	
	public void printElements(Node n)
	{
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
   // Hey this is my first comment
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteNode obj = new DeleteNode();
		head = new Node(1);
		head.next = new Node(3);
		head.next.next= new Node(4);
		head.next.next.next= new Node(5);
		head.next.next.next.next= new Node(6);
		obj.printElements(head);
		obj.isDeleteNode(head.next.next);
		System.out.println("Print list after deleting node");
		obj.printElements(head);

	}

}
