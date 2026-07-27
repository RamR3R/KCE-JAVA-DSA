package twoPointers;

public class ValidPalindrome {
	static boolean isAlphaNum(char s) // O(1)
	{
		if((s <= 'z' && s >= 'a')
	    		||(s <= 'Z' && s >= 'A')
	    		||(s <= '0' && s >= '9'))  
		return true;
		else return false;
	}
	
    static boolean isPalindrome(String s) {
    	
    	int left = 0;
    	int right = s.length() - 1;
    	s.toLowerCase();
    	while(left < right)
    	{
    		
    		if(isAlphaNum(s.charAt(left)) && isAlphaNum(s.charAt(right)))
			{
    			if(s.charAt(left) != s.charAt(right))
    				return false;
    			else
    			{
    				left++;
    				right--;
    			}
    			
			}
    		else
    		{
    			if(!isAlphaNum(s.charAt(left)))
    			{
    				left++;
    			}
    			
    			if(!isAlphaNum(s.charAt(right)))
    			{
    				right--;
    			}
    		}
    	}
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(input));
	}

}
