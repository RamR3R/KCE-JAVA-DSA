package stacks;

import java.util.Stack;

public class BaseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] operations = {"5","2","C","D","+"};
		Stack<Integer> st =  new Stack<>();

        for(String str : operations)
        {
            switch(str)
            {
            case "+" :{
                int first = st.pop();
                int second = st.peek();
                int third = first + second;
                st.push(first);
                st.push(third);
                break;
            }
            case "D":
                st.push(st.peek() * 2);
                break;
            case "C":
                st.pop();
            	break;
            default:
                st.push(Integer.parseInt(str));
        }
        int res = 0;
        while(!st.isEmpty())
            res += st.pop();

        System.out.println(res);
	}
	}
	}
