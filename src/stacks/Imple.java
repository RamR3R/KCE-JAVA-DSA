package stacks;

import java.util.Stack;

class stackImple
{
	int[] arr = new int[100];
	int top = -1;
	
	void push(int element)
	{
		arr[++top] = element;
	}
	
	int pop()
	{
		return arr[top--];
	}
	
	int peek()
	{
		return arr[top];
	}
	boolean isEmpty()
	{
		return top == -1;
	}
	
}



public class Imple {

	public static void main(String[] args) {
//		stackImple st = new stackImple();
//		st.push(7);
//		System.out.println(st.isEmpty());
//		st.push(3);
//		System.out.println(st.peek());
//		st.pop();
//		System.out.println(st.peek());
//		st.push(2);
//		System.out.println(st.peek());
//		st.pop();
//		st.pop();
//		System.out.println(st.isEmpty());
		
		Stack<Integer> st = new Stack<>();
		st.push(0);   // O(1)
		st.pop();     // O(1)
		st.peek();    // O(1)
		st.isEmpty(); // O(1)
		
		
	}

}
