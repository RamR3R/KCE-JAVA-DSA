package queue;

import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		PriorityQueue<int[]> pq = new PriorityQueue
				<>((a , b) -> b[1] - a[1]);            
		int[][] arr = { {96 , 8} , {99 , 10} , {92 , 7}};
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i][1] = arr[i][1];
			pq.add(arr[i]);
		}
//		int k = 3;
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll()[0]);
		}
		
		
	}

}
