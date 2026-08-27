package trees;
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

public class BST {
	
	static void dfs(TreeNode root)
	{
		if(root == null)
			return;
		
		dfs(root.left);
		System.out.print(root.val + " -> ");
		dfs(root.right);
	}
	
	static boolean search(TreeNode root , int x)
	{
		if(root == null)return false;
		if(root.val == x) return true;
		
		if(x > root.val)
			return search(root.right , x);
		else
			return search(root.left , x);
	}
	
	
	static int findMin(TreeNode root)
	{
		while(root.left != null)
			root = root.left;
		
		return root.val;
	}
	
	static TreeNode insert(TreeNode root , int ele)
	{
		if(root == null)
		{
			return new TreeNode(ele);
		}
		
		if(ele > root.val)
			root.right = insert(root.right , ele);
		else
			root.left = insert(root.left , ele);
		
		return root;
	}
	
	static TreeNode delete(TreeNode root , int del)
	{
		if(root == null) return null;
		if(root.val == del)
		{
			if(root.right == null && root.left == null)
				return null;
			else
			{
				if(root.left == null)
					return root.right;
				if(root.right == null)
					return root.left;
				int successor =  findMin(root.right);
				root.val = successor;
				root.right = delete(root.right , successor);
			}
		}
		if(root.right != null && del > root.val)
			root.right = delete(root.right , del);
		else
			root.left = delete(root.left , del);
		
		return root;
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5 , 3 , 1 , 2 ,7 , 4};
		TreeNode root = new TreeNode(arr[0]);
		
		for(int i = 1 ; i < arr.length ; i++)
			insert(root , arr[i]);
		
		dfs(root);
		delete(root, 3);
		System.out.println();
		dfs(root);
		
	}

}
