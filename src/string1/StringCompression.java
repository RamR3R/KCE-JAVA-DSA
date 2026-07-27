package string1;

//import java.util.HashMap;

public class StringCompression {
	
	static int compress(char[] chars) {
		String res = "";
		int count = 1;
		char current = chars[0];
		for(int i = 1 ; i<chars.length ; i++) // TC => O(n) ||SC => O(1)
		{
			if(current == chars[i])
				count++;
			else
			{
				res = res + current;
				if(count != 1)res += count;
				
				current = chars[i];
				count = 1;
			}
		}
		res = res + current;
		if(count != 1)res += count;
		
		
		
		
		
		System.out.println(res);
        return res.length();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = { 'a', 'a','a','a', 'b' ,'b' ,'a','a'};
		System.out.println(compress(arr));
		
	}

}
