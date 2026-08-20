package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputTaking {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// input type 1
		// 5
//		// 1 2 2 3 3

//		sc.nextInt()
		
		// type 2 without n
		
		// 10 20 30 40 50
		List<Integer> list = new ArrayList<>();
		while(sc.hasNext())
		{
			int x = sc.nextInt();
			list.add(x);
		}
		
		//type 3 multiple line input
		// 20  30  40   

		BufferedReader reader = 
				new 
				BufferedReader(
						new InputStreamReader(System.in));
		
		try {
			
			String  line = reader.readLine().trim();
			String[] input = line.split("\\s+");
			int[] arr = new int[input.length];
			for(int i = 0 ; i< input.length ; i++)
			{
				arr[i] = Integer.parseInt(input[i]);
			}
			
			
			//type 4
			// add 2
			// add 3
			// output
			while((line = reader.readLine()) != null)
			{
				//you can do the process
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
