package string1;

import java.util.HashMap;
import java.util.Scanner;

public class AllFunctions {
	static boolean areOccurrencesEqual(String s) {
		HashMap<Character , Integer> freqMap = new HashMap<>();
		
		for(int i = 0 ; i < s.length() ; i++) // tc = > O(n) || SC =>O(n)     
		{
			int newVal = freqMap.getOrDefault(s.charAt(i) , 0) + 1;
			freqMap.put(s.charAt(i), newVal);
		}
		int value = freqMap.get(s.charAt(0));
		for(char x : freqMap.keySet()) // O(n)
		{
			if(freqMap.get(x) != value)
				return false;
		}
		
		return true;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		
		System.out.println(areOccurrencesEqual(str));

		sc.close();
	}

}
