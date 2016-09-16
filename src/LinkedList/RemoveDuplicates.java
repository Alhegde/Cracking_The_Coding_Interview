package LinkedList;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Set;


public class RemoveDuplicates {
	
   // private	LinkedListNode head ;
	static LinkedListNode head;
	static class LinkedListNode
	{
		int data;
		LinkedListNode next;
		LinkedListNode(int data)
		{
		    this.data=data;	
		    this.next=null;
		}
		
	}

	public static void removeDups(LinkedListNode n )
	{
		Hashtable<Integer,Boolean> table = new Hashtable<Integer,Boolean>();
		LinkedListNode prev = null;
		while(n !=null)
		{
			if(table.containsKey(n.data))
			{
				prev.next=n.next;
			}
			else
			{
				table.put(n.data, true);
				prev=n;
			}
			n=n.next;
			
			/*Set<Integer> keys= table.keySet();
			for(int key:keys)
			{
				System.out.println(key);
			}*/
		}
		
		System.out.println(table);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //LinkedListNode root = new LinkedListNode();
		RemoveDuplicates rd = new RemoveDuplicates();
		/* LinkedList<Integer> list=new LinkedList<Integer>();
		 list.add(1);
		 list.add(2);
		 list.add(5);
		 list.add(4);
		 list.add(1);
		 list.add(5);
		 list.add(2);
		// System.out.println(list);
		 LinkedListNode head = new LinkedListNode(list.getFirst());
		 RemoveDuplicates.removeDups(head);
		// System.out.println(list);*/
		rd.head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(1);
		rd.removeDups(head);
		
		
		 
		
		

	}

}
