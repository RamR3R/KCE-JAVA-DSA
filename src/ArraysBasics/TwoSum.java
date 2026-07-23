package ArraysBasics;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {3 , 2 , 4 , 3};
		int target = 6;
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i < arr.length ; i++) //O(n^2)
		{			
			map.put(arr[i], i);
		}
		System.out.println(map);
		
		for(int i = 0 ; i < arr.length; i++)
		{
			int find = target - arr[i];
			if(map.containsKey(find) && map.get(find) != i)
			{
				System.out.println(i + " , " + map.get(find));
				break;
			}
		}
		
		

	}

}
