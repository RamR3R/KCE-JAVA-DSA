package graph;

import java.util.*;

public class WeightedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] edges = {{1,2,3} , {1,3,2}, 
				{1,4,5},{3,4,1},{4,5,3}};
		
		HashMap<Integer , List<int[]>> adjList = new
				HashMap<>();
		for(int i = 1 ; i<= n ; i++)
			adjList.put(i , new ArrayList<>());
		
		for(int i = 0 ; i< edges.length ; i++)
		{
//			edges[i] = > u,v,w
			int[] arr = {edges[i][1] , edges[i][2]};
			adjList.get(edges[i][0])
			.add(arr);
		}
		System.out.println(adjList.get(1).get(0)[1]);
	}

}
