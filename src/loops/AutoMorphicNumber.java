package loops;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
//		2 => 62 => true
		
		int n = 76;
		int square = n * n; // 625
//		boolean flag = true;
//		while(n != 0)
//		{  // TC => O(log10 n)
//			int nOdaLastDigit = n % 10;
//			int squareOdaLastDigit = square % 10;
//			if( nOdaLastDigit != squareOdaLastDigit)
//			{
//				flag = false;
//				break;
//			}
//			n /= 10;
//			square /= 10;
//		} 
		int divideNumber = 1;
		int org = n;
		while(n != 0) // O(log10 N)
		{
			n = n /10;
			divideNumber = divideNumber * 10;
		}
		
		if(square % divideNumber == org)
			System.out.println("Automorphic");
		else
			System.out.println("Not a Automorphic");
		
		
		
		
		
		
		
	}

}
