package day1;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 10; //O(1)
		int y = 20;//O(1)
		int z =  5;//O(1
//		tc => O(3)
		//operators
		//arth ops
//		+ -  * / % 
		System.out.println(x % y); // 2.5
		
//		relational ops
//		< > <= >= == !=
		System.out.println(x <= y);
		
// 		logical ops
//		and => && 
//		or => ||
		
		System.out.println(x > z && x < y);
		
		
// ? => condition ? true block : false block;
		
//		Bitwise operator  & | ^
		System.out.println(20);
		
		
//		shift operator
//	    << => left operator
//		>> => right operator
		
//		if(conditon 1)
//		{
//			block to run if true
//		}
//		else if(conditon 2)
//		{
//			
//		}
//		else
//		{
//			
//		}
		
//		condition ? true block :  false block;
		
//		switch('*')
//		{
//		case '+':
//			System.out.println(x + y);
//			break;
//		case '-':
//			System.out.println(x - y);
//			break;
//			default:
//				System.out.println("enter valid da bro");
//		}
		
		
//		looping
//		for while do while for each
		int n = sc.nextInt();
		for(int i = 0 ; i < n; i++ ) // O(n^2)
		{
			System.out.println("Hai");
			for(int j = 0 ; j < n; j++ )
			{
				System.out.println("Hai");
			}
		}
//		TC => O(n^2) + O(m) => O(n^2 + m)
		int m = sc.nextInt();
		for(int i = 0 ; i < m; i++ ) // O(m)
		{
			System.out.println("Hai");
		}
		
//		int number = 3243;
//		
//		while(number != 0)
//		{
//			number = number / 10; //324 => 32 => 3 => 0 => 0 => 0 => 0
//		}
//		
		
		
		
		
		sc.close();
		
		
		

	}

}
