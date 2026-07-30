package stacks;

import java.util.Stack;

public class NGE {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		int[] arr = {2 ,3 ,4 ,1 ,4};
		int[] res = new int[arr.length];
		st.push(arr[arr.length - 1]);
		res[arr.length - 1] = -1;
		for(int i = arr.length - 2 ;  i >= 0 ; i--)
		{
			while(!st.isEmpty() && st.peek() <= arr[i])
				st.pop();
			
			if(st.isEmpty())
				res[i] = -1;
			else
				res[i] = st.peek();
			
			st.push(arr[i]);
		}
		
		for(int i = 0 ; i<res.length ; i++)
		{
			System.out.print(res[i] + " ");
		}

	}

}
