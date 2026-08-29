package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Representation {
	
	static void dfs(int node , boolean[] visited 
			, HashMap<Integer , List<Integer>> adjList)
	{
		visited[node] = true;
		System.out.print(node + " -> ");
		for(int nei : adjList.get(node))
		{
			if(!visited[nei])
				dfs(nei , visited , adjList);
		}
	}

	public static void main(String[] args) {
		int n = 7;
		int[][] edges = {{1,2},{1,4},{2,3},{3,4},
				{3,5},{5,6},{5,7}};
		
		HashMap<Integer, List<Integer>> adjList =
				new HashMap<>();
		for(int i = 1 ; i<= n ; i++)
		{
			adjList.put(i, new ArrayList<>());
		}
		System.out.println(adjList);
		
		for(int i = 0 ; i<edges.length ; i++)
		{
			int[] edge = edges[i];
			int u = edge[0];
			int v = edge[1];
			
			adjList.get(u).add(v); // directed
			adjList.get(v).add(u); // undirected this too
//			adjList.get(edges[i][0]).add(edges[i][1]);
		}
		System.out.println(adjList);
		
		int[][] adjMat = new int[n+1][n+1];
		
		for(int i = 0 ; i<edges.length ; i++)
		{
			int[] edge = edges[i];
			int u = edge[0];
			int v = edge[1];
			
			adjMat[u][v] = 1;
			adjMat[v][u] = 1;
		}
		
		for(int i = 0 ; i < n+1 ; i++)
		{
			for(int j = 0 ; j < n+1 ; j++)
				System.out.print(adjMat[i][j] + " ");
			System.out.println();
		}
		
		//from here we have the traversals
		boolean[] visited = new boolean[n + 1];
		int src = 1;
		dfs(src , visited , adjList);

	}

}
