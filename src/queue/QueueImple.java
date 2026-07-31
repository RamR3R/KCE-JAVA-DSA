package queue;

import java.util.LinkedList;
import java.util.Queue;

class Q{
	int[] arr;
	int front;
	int rear;
	
	Q(){
		arr = new int[100];
		front = 0;
		rear = -1;
	}
	
	void offer(int ele)
	{
		arr[++rear] = ele;
	}
	
	int poll()
	{
		return arr[front++];
	}
	int peek()
	{
		return arr[front];
	}
	boolean isEmpty()
	{
		return front > rear || front == -1;
	}
	
}



public class QueueImple {

	public static void main(String[] args) {
		
		Q queue = new Q();
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(6); 
		q.poll();
		q.isEmpty();
		q.peek();
		
		
		queue.offer(5);
		queue.offer(3);
		queue.offer(7);
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		queue.poll();
		queue.poll();
		System.out.println(queue.isEmpty());

		
	}

}
