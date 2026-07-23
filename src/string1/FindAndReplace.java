package string1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplace {
	static List<String> findAndReplacePattern(String[] words, String pattern) {
        
		List<String> res = new ArrayList<>();
		
		for(int w = 0 ; w < words.length ; w++)
		{
			String word = words[w]; // deq => abb
			boolean flag = true;
			HashMap<Character , Character> map1 = new HashMap<>();
			HashMap<Character , Character> map2 = new HashMap<>();
			for(int i = 0 ; i < word.length() ; i++)
			{
				if(!map1.containsKey(pattern.charAt(i)))
				{
					
					map1.put(pattern.charAt(i), word.charAt(i));
					
					if(map2.containsKey(word.charAt(i)))
					{
						flag = false;
						break;
					}
					map2.put(word.charAt(i), pattern.charAt(i));                     
				}
				else
				{
					if(map1.get(pattern.charAt(i)) != word.charAt(i)
						|| map2.get(word.charAt(i)) != pattern.charAt(i)
							)
					{
						flag = false;
						break;
					}
				}
			}
			// we are here 
			if(flag)
				res.add(word);
		}
		
		
		
		
		
		return res;		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
		System.out.println(findAndReplacePattern(words, "abb"));
	}

}
