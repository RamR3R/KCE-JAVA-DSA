package trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int value)
	{
		this.val = value;
	}
}

public class CreationOfTree {	
	
	static void dfs(TreeNode root)
	{
		if(root == null) return;
		
		dfs(root.left);
		System.out.println(root.val);
		dfs(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "[1,null,2,3]";
		input = input.substring(1 , input.length() - 1);
		String[] nodes = input.split(",");
		TreeNode root = new TreeNode(Integer.parseInt(nodes[0].trim()));
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		int i = 1;
		while(i < nodes.length)
		{
			TreeNode curr = q.poll();
			if(!nodes[i].equals("null"))
			{
				curr.left = new TreeNode(Integer.parseInt(nodes[i]));
				q.offer(curr.left);
			}
		
			i++;
			if(i < nodes.length)
			{
				if(!nodes[i].equals("null"))
				{
					curr.right = new TreeNode(Integer.parseInt(nodes[i]));
					q.offer(curr.right);
				}
				i++;
			}
		}
		dfs(root);
		
	}

}
