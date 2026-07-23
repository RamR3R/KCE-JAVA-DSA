package string1;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
	static int lengthOfLongestSubstring(String s) {
        
		int maxLength = 0 ;
		
		
		for(int i = 0 ; i< s.length() ; i++)
		{
			HashSet<Character> set = new HashSet<>();
			set.add(s.charAt(i));
			for(int j = i + 1 ; j < s.length() ; j++)
			{
				if(set.contains(s.charAt(j)))
				{
					break;
				}
				else
				{
					set.add(s.charAt(j));
					maxLength = Math.max(maxLength, set.size());
				}
			}
			maxLength = Math.max(maxLength, set.size());
		}
		return maxLength;
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcde"));
	}

}
