package day1;

public class ExcelTitle {

	public static void main(String[] args) {
		
		int n = 703; // O(1) constant time
		String title = "";
		
		while(n != 0)
		{
			n = n - 1;
			int digit = n % 26;
			title = (char)(digit + 65) + title;
			n = n / 26;
		}
		
		// AAA => 703
		
		
		System.out.println(title);
	}

}
