package slidingWindow;

public class MinimumSizeSubArray {

	public static void main(String[] args) {
		
		int[] nums = {2,3,1,2,4,3};
		int target = 7;
		
		int window = 0;
		int start = 0;
		int end = 0;
		int minLen = Integer.MAX_VALUE;
//		if(window >= target)
//			minLen = 1;
		
		while(end < nums.length) // TC => O(n) || SC => O(1)
		{
			window += nums[end];
			
			while(window >= target)
			{
				minLen = Math.min(end - start + 1, minLen);
				window -= nums[start];
				start++;
			}
			end++;
		}
		System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen );

	}

}
