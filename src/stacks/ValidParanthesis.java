package stacks;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		String q = ")";
		
		Stack<Character> st = new Stack<>();
		boolean flag = true;
		for(int i = 0 ; i < q.length() ; i++)
		{
			char c = q.charAt(i);
			if(c == '(' || c == '[' || c == '{')
				st.push(c);
			else
			{
				if(!st.isEmpty() &&
						((c == ')' && st.peek() == '(') ||
						(c == '}' && st.peek() == '{') ||
						(c == ']' && st.peek() == '[')
						))
					st.pop();
				else
					flag = false;
			}
		}
		
		if(st.isEmpty() && flag)
			System.out.println("valid");
		else
			System.out.println("Invalid");
		
	}

}
