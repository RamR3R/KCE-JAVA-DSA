package linkedList;

class Node
{
	int value;
	Node next;
	
	Node(int val , Node n)
	{
		this.value = val;
		this.next = n;
	}
}

public class LinkedListImple {

	public static void main(String[] args) {
		
		Node node1 = new Node(1, null);
		Node node2 = new Node(2 , null);
		Node node3 = new Node(3 , null);
		Node node4 = new Node(4 , null);
		node4.value = 5;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		Node head = node1;
		
		
		Node current = head;
		// traverse in a LL
		int length = 0;
		while(current != null)
		{
			System.out.print(current.value + " => ");
			current = current.next;
			length++;
		}
		int middle  = length / 2;
		current = head;
		int count = 0;
		while(count < middle)
		{
			current = current.next;
			count++;
		}
		
		System.out.println();
		System.out.println(length);	
		
		
		
		
	}

}
