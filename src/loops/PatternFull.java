package loops;

public class PatternFull {

	public static void main(String[] args) {
		
		int n = 6;
		for(int i = 0 ; i < n ; i++)
		{
//			int print = 65;
			char print = 'A';
			for(int j = 0 ; j < i + 1 ; j++)
			{
				System.out.print(print++);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i = 0 ; i < n ; i++) // TC =>O(n^2)
//		{
//			// for printing the spaces
//			for(int s = 0 ; s < n - 1 - i ; s++) // O(s)
//			{
//				System.out.print("  ");
//			}
//			// TC => O(n) 
//			for(int j = n - 1 - i ; j < n ; j++) // O(j)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		for(int i = 0 ; i < n ; i++)
//		{
//			for(int j = 0 ; j < i + 1 ; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		

	}

}
