package input;
import java.util.*;
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
public class TreeInput {

	public static void dfs(TreeNode root)
	{
		if(root == null) return;
		
		dfs(root.left);
		System.out.println(root.val);
		dfs(root.right);
	}
	public static void bfs(TreeNode root)
	{
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty())
		{
			int levelEle = q.size();
			while(levelEle-- > 0)
			{
				TreeNode curr =  q.poll();
				System.out.print(curr.val + " , ");
				if(curr.left!= null)
					q.offer(curr.left);
				if(curr.right != null)
					q.offer(curr.right);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		String input = "[1,null,2,3]";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		// 1 null 2 3
		String line = sc.nextLine();
		String[] list = line.split(" ");
		sc.close();
		n = n + 0;
		Queue<TreeNode> q = new LinkedList<>();
		TreeNode root = new TreeNode(Integer.parseInt(list[0]));
		q.offer(root);
		int i = 1;
		while(i < list.length)
		{
			TreeNode curr = q.poll();
			if(!list[i].equals("null"))
			{
				curr.left = new 
						TreeNode(
						Integer.parseInt(list[i]));
				q.offer(curr.left);	
			}
			i++;
			if(i < list.length && !list[i].equals("null"))
			{
				curr.right = new 
						TreeNode(
						Integer.parseInt(list[i]));
				q.offer(curr.right);
			}
			i++;
		}
		dfs(root);
		bfs(root);
	}

}
