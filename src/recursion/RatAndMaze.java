package recursion;

import java.util.ArrayList;

public class RatAndMaze {
	
	static void solve(int r , int c , 
			int[][]maze , String path , boolean[][] visited,
			ArrayList<String> result)
	{
		//base condition
		if(c >= maze[0].length ||c < 0
		|| r >= maze.length || r < 0) return;
		if(maze[r][c] == 0)return;
		if(visited[r][c]) return;
		if(c == maze[0].length - 1 && r == maze.length - 1)
		{
			System.out.println(r +" : " + c);
			result.add(path);
			return;
		}
		visited[r][c] = true;
		
		System.out.println(r +" , " + c);
		//calls
		solve(r , c + 1 , maze , path + "R", visited, result); // moving right
		solve(r + 1 , c , maze , path + "D", visited, result); //moving down
		solve(r - 1 , c , maze , path + "U", visited, result);
		solve(r , c - 1 , maze , path + "L", visited, result);
		
		visited[r][c] = false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = {
				{1, 1, 1, 0},
				{0, 1, 1, 0},
				{0, 1, 1, 1},
				{1, 1, 1, 1}
		};
		
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		ArrayList<String> result = new ArrayList<>();
		solve(0 , 0 , maze , "" , visited ,result);
		System.out.println(result);
	}

}
