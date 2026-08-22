package stacks;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class DinnerTable {
	    ArrayList<Stack<Integer>> table;
	    PriorityQueue<Integer> avail;
	    int maxCap;
	    public DinnerTable(int capacity) {
	        maxCap = capacity;
	        table = new ArrayList<>();
	        avail = new PriorityQueue<>();
	    }
	    
	    public void push(int val) {
	        // System.out.println(avail + " avail");
	        int index = 0;
	         while(
	            !avail.isEmpty() &&
	            (avail.peek() >= table.size() ||
	            table.get(avail.peek()).size() == maxCap)
	            )
	                avail.poll();

	        if(table.size() == 0)
	            table.add(new Stack<>());
	        else
	        {
	            if(avail.isEmpty())
	            {
	                table.add(new Stack<>());
	                index = table.size() - 1;
	            }
	            else
	                index = avail.poll();
	        }
	            
	        
	        table.get(index).push(val);
	        if(table.get(index).size() < maxCap)
	            avail.offer(index);
	        
	        // System.out.println(table);
	    }
	    
	    public int pop() {
	        if(table.size() == 0) return -1;
	        int index = table.size() - 1;
	        
	        while(table.get(index).isEmpty())
	            table.remove(index--);

	        int removed = table.get(index).pop();

	        if(table.get(index).isEmpty())
	            table.remove(index);
	        else
	            avail.offer(index);
	        // System.out.println(table);
	        return removed;
	    }   
	    
	    public int popAtStack(int index) {
	        
	        if(index > table.size() - 1 ||
	        table.get(index).isEmpty()
	        ) return -1;
	        int removed = table.get(index).pop(); 
	        // System.out.println(table);
	        avail.offer(index);
	        return removed;

	    }

	/**
	 * Your DinnerPlates object will be instantiated and called as such:
	 * DinnerPlates obj = new DinnerPlates(capacity);
	 * obj.push(val);
	 * int param_2 = obj.pop();
	 * int param_3 = obj.popAtStack(index);
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
