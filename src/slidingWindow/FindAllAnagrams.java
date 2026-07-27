package slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

public class FindAllAnagrams {

	public static void main(String[] args) {
// TC => O(p) + O(p) + O(26) + O(n * 26) => O(26n)
		String s = "cbaebabacd";
		String p = "abc";
		ArrayList<Integer> res = new ArrayList<>();
		HashMap<Character, Integer> pattern = new HashMap<>();
		for(int i = 0 ; i< p.length() ; i++) 
		{
			int value = pattern.getOrDefault(p.charAt(i) , 0);
			pattern.put(p.charAt(i), value + 1);
		}
		
		
		HashMap<Character, Integer> window = new HashMap<>();
		for(int i = 0 ; i< p.length() ; i++)
		{
			int value = window.getOrDefault(s.charAt(i) , 0);
			window.put(s.charAt(i), value + 1);
		}
		int start = 0;
		int end = p.length() - 1;
		
		boolean flag = true;
		for(char key : pattern.keySet())
		{
			if(window.getOrDefault(key, 0) != pattern.get(key))    
			{
				flag = false;
			}
		}
		if(flag)
		res.add(start);
		
		
		while(end < s.length() - 1)
		{
			char out = s.charAt(start);
			window.put(out, window.get(out) - 1);
			start++;
			end++;
			char in =  s.charAt(end);
			window.put(in, window.getOrDefault(in, 0) + 1);
			System.out.println(window + " => " +pattern);
			
			flag = true;
			for(char key : pattern.keySet()) // O(26)
			{
				if(window.getOrDefault(key, 0) != pattern.get(key))    
				{
					flag = false;
				}
			}
			if(flag)
			res.add(start);
		}
		
		
		System.out.println(res);
		
	}

}
