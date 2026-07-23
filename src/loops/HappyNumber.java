package loops;

//import java.util.*;

public class HappyNumber {
	public boolean isHappy(int n) {
//		HashSet<Integer> visited = new HashSet<>();
		int i = 0;
		while(i < 6)
		{
			int sum = 0;
			while(n != 0)
			{
				int last = n % 10;
				sum = sum + (last * last);
				n /= 10;
			}
			if(sum == 1)
				return true;
			else
				n = sum;
			
//			if(visited.contains(n))
//			{
//				return false;
//			}
//			else
//				visited.add(n);
		}
		return false;
    }
	
	
	
	
}
