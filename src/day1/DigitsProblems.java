package day1;

public class DigitsProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to count the number of digits
		int x = 659; // => 200 + 40 + 3 => 243
		int sum = 0;
		int i = 0;
		while(x > 10)
		{
			while(x != 0) // O(log10 x)
			{
//				if u want the last digit of ur number
				int last = x % 10;
				x = x / 2; // => 24
				sum = sum + last;
				i++;
			}
			x = sum; // 74 11
			sum = 0;
		}

		System.out.println(x + "  " + i);
	}

}
