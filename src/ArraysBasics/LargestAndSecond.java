package ArraysBasics;

//import java.util.Scanner;

public class LargestAndSecond {
	static int thirdMax(int[] nums) {
        int first = nums[0];
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        // [ 2 2 3 1]
        for(int i = 1 ; i < nums.length ; i++)
        {
        	if(nums[i] > first)
        	{
        		third = second;
        		second = first;
        		first = nums[i];
        	}
        	else if(nums[i] > second && nums[i] != first)
        	{
        		third = second;
        		second = nums[i];
        	}
        	else
        	{
        		if(nums[i] > third && nums[i] != second && nums[i]!= first)
        			third = nums[i];
        	}
        	System.out.println(first + " , " + second + " , " + third);
        }
        
        if(third == Integer.MIN_VALUE)
            return (int)first;
        return (int)third;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,2,5,3,5};
		System.out.println(thirdMax(arr));
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		
//		for(int i = 0 ; i < n ; i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		//solve the problem
//		
//		int large = arr[0];
//		int second = 0;
//		for(int i = 1 ; i < arr.length ; i++)
//		{
//			if(arr[i] > large)
//			{
//				second = large;
//				large = arr[i];
//			}
//			else
//			{
//				if(arr[i] > second)
//				{
//					second = arr[i];
//				}
//			}
//		}
//		System.out.println(second);
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		sc.close();
		
		
		
		
		
		
		
	}

}
