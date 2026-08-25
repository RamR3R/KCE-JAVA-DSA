package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int val;
	Node left;
	Node right;
	
	Node(int value){
		this.val = value;
		this.right = null;
		this.left = null;
	}
	
}

public class Implementation {
	
	public static void dfs(Node root)
	{
		if(root == null) return;
		
		System.out.print(root.val + " => ");
		dfs(root.left);
		
		dfs(root.right);
		
	}
	
	public static void bfs(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty())
		{
			Node curr = q.poll();
			if(curr.left != null)
				q.offer(curr.left);
			if(curr.right != null)
				q.offer(curr.right);
			System.out.print(curr.val + " => ");
		}
		
	}
	
	public static int height(Node root)
	{
		if(root == null) return 0;
		
		int left = height(root.left);
		int right = height(root.right);
		
		return 1 + Math.max(left, right);
	}
	
	public static int hbfs(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int height = 0;
		while(!q.isEmpty())
		{
			int remove = q.size();
			while(remove > 0)
			{
				Node curr = q.poll();
				if(curr.right != null) 
					q.offer(curr.right);
				if(curr.left != null) 
					q.offer(curr.left);
				remove--;
			}
			height++;
		}
		return height;
	}

	public static void main(String[] args) {
		
		Node root = new Node(1);
		Node obj1 = new Node(2);
		Node obj2 = new Node(3);
		Node obj3 = new Node(4);
		Node obj4 = new Node(5);
		Node obj5 = new Node(7);
		Node obj6 = new Node(8);

		
		root.left = obj1;
		root.right = obj2;
		
		obj1.left = obj6;
		obj1.right = obj3;
		
		root.right.left = obj5;
		root.right.right = obj4;
		root.right.left.left = new Node(16);
		
		dfs(root);
		System.out.println();
		bfs(root);
		System.out.println();
		System.out.println("Tree height : " + hbfs(root));
	}

}
