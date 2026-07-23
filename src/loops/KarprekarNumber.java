package loops;

public class KarprekarNumber {
	
	static boolean isKaprekar(int n) {
		// code here
		int square = n * n;
		int power = 1; // 10 => 100 => 1000
		int org = n;
		while (n != 0)
			{
			n /= 10;
			power = power * 10;
		}
		int right = square % power; // getting n digits
		int left = square / power; // del n digits
		return left+right == org;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isKaprekar(45));
	}

}
