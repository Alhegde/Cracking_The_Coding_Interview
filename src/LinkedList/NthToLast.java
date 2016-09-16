package LinkedList;



public class NthToLast {
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
	public void printElements(Node h, int n)
	{
		
			for(int i=0;i<n;i++)
				{
				   h=h.next;
				}
			//System.out.println(h.data);
			while(h!=null)
			{
				System.out.println(h.data);
				h=h.next;
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NthToLast obj = new NthToLast();
		obj.head = new Node(1);
		head.next = new Node(3);
		head.next.next= new Node(4);
		head.next.next.next= new Node(5);
		head.next.next.next.next= new Node(6);
		obj.printElements(head, 2);
		
		
	}

}
