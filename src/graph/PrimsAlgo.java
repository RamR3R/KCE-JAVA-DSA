package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgo {

	public static void main(String[] args) {
		int v = 9;
		int[][]edges = {{0,1,4},{0,7,8},
				{1,2,8},{1,7,11},{2,3,7},
				{2,8,2},{2,5,4},{3,4,9},
				{3,5,14},{4,5,10},{5,6,2},
				{6,8,6},{6,7,1},{7,8,7}};
		
		HashMap<Integer,List<int[]>> adjList = new HashMap<>();
		for(int i = 0 ; i < v ; i++)
			adjList.put(i , new ArrayList<>());
		
		for(int[] edge : edges)
		{
			adjList.get(edge[0]).add(new int[] {edge[1] , edge[2]});
			adjList.get(edge[1]).add(new int[] {edge[0] , edge[2]});
		}
		
		PriorityQueue<int[]> pq = new PriorityQueue<>(
				(a,b)->a[1]-b[1]);
		
		boolean[] visited = new boolean[v];
		int total = 0;
		List<List<Integer>> mst = new ArrayList<>();
		int src = 0;
		
		pq.offer(new int[] {src , 0 , -1});
		
		while(!pq.isEmpty())
		{
			int[] curr = pq.poll();
			int node = curr[0];
			int edgeWeight = curr[1];
			int parent = curr[2];
			if(visited[node]) continue;
			
			visited[node] = true;
			total += edgeWeight;
			
			if(parent != -1)
			mst.add(new ArrayList<>(
					Arrays.asList(parent,node,edgeWeight)));
			
			for(int[] nei : adjList.get(node))
			{
				if(visited[nei[0]]) continue;
				pq.offer(new int[] {nei[0] , nei[1] , node});
			}
		}
		System.out.println(total);
		System.out.println(mst);
	}

}