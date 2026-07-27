package slidingWindow;

public class MaxSumSubarraySizeK {

	public static void main(String[] args) {
		int[] arr = {1 , 2 , 3 , 0 , 4 , 12};
		int k = 3;
		int windowSum = 0;		
		for(int i = 0 ; i< k ; i++) // TC => O(k)
		{
			windowSum += arr[i];
		}
		int maxSum = windowSum;
		int start = 0;
		int end = k - 1;
		while(end < arr.length - 1) // TC(n) || SC => O(1) 
		{
			windowSum += arr[++end] - arr[start++];
			maxSum = Math.max(windowSum, maxSum);
		}
		
		System.out.println(maxSum);
		
		
		
		
		
		
		
		

	}

}
