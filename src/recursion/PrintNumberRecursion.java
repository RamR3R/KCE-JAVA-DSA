package recursion;

public class PrintNumberRecursion {
	
	// from n -> 1 // from 1 -> n
	
	static void print(int n)
	{
		//base condition
		if(n == 0)
			return;
		
		//recursive call
		print(n - 1);
		
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
	}

}
