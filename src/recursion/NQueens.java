package recursion;

import java.util.HashSet;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		char[][] board = new char[n][n];
		for(int i  = 0; i < n ; i++)
			for(int j = 0 ; j<n ; j++)
				board[i][j] = '.';
		backtrack(0, 4, new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>(), board);
		
	}
	
	static void backtrack(int col, int n,
			HashSet<Integer> rowSet, HashSet<Integer> colSet,
			HashSet<Integer> rdSet, HashSet<Integer> ldSet,
			char[][] board)
	{
		if(col == n)
		{
			for(int i  = 0; i < n ; i++)
			{
				for(int j = 0 ; j<n ; j++)
				{
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}
		
		
		
		for(int row = 0 ; row<n ; row++)
		{
			if(!(rowSet.contains(row) || 
					colSet.contains(col)||
					ldSet.contains(row + col)||
					rdSet.contains(row - col)))
			{
				board[row][col] = 'Q';
				rowSet.add(row);
				colSet.add(col);
				rdSet.add(row - col);
				ldSet.add(row + col);
				backtrack(col + 1 , n ,
						rowSet , colSet , rdSet, ldSet,
						board);
				
				board[row][col] = '.';
				rowSet.remove(row);
				colSet.remove(col);
				rdSet.remove(row - col);
				ldSet.remove(row + col);
				
			}
			
			
		}
			
			
			
			
			
			
			
	}

}
