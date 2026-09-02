package graph;
import java.util.*;
public class ShortestPathWeighted {

	public static void main(String[] args) {
		int[][] edges = {{0,1,4},{0,2,8},{1,2,3},
					{1,4,6},{2,3,2},{3,4,10}};
		int n = 5;
		HashMap<Integer , List<int[]>> adjList = new HashMap<>();
		for(int i = 0; i<n ; i++)
			adjList.put(i, new ArrayList<>());
		for(int[] edge : edges)
		{
			int u = edge[0];
			int v = edge[1];
			int w = edge[2];
			
			adjList.get(u).add(new int[] {v , w});
			adjList.get(v).add(new int[] {u , w});
		}
		System.out.println(adjList);

		int[] distance = new int[n];
		Arrays.fill(distance, Integer.MAX_VALUE);
		PriorityQueue<int[]> pq = new PriorityQueue<>(
				(a,b) -> a[1]-b[1]
				);
		
		int src = 0;
//		int des = 3;
		distance[src] = 0;
		pq.offer(new int[] {src , 0});
		
		while(!pq.isEmpty())
		{			
			int[] curr = pq.poll();
			// curr[0] => node
			//curr[1] => cost used to to reach node
			int node = curr[0];
			int cost = curr[1];
			if(distance[node] < cost) continue;
			
			for(int[] nei : adjList.get(node))
			{
				int newDist = cost + nei[1];
				if(newDist < distance[nei[0]])
				{
					distance[nei[0]] = newDist;
					pq.offer(new int[] {nei[0] , newDist});
			
				}
			}
		}
		for(int i = 0 ; i < n ; i++)
			System.out.println(distance[i] + " , " + i);
	}
}