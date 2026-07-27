package slidingWindow;

import java.util.HashMap;

public class FruitBasket {

	public static void main(String[] args) {
		int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
		
		int left = 0;
        int right = 0;
        int maxi = 0;

        HashMap<Integer , Integer> set = new HashMap<>();
        while(right < fruits.length)
        {
            set.put(fruits[right] , set.getOrDefault(fruits[right] , 0) + 1);
//            int pop = fruits[left];
            while(set.size() > 2)
            {
                set.put(fruits[left] , set.getOrDefault(fruits[left] , 0) - 1);
                if(set.get(fruits[left]) <= 0)
                    set.remove(fruits[left]);
                
                left++;
            }

            maxi = Math.max(maxi , right - left + 1);
            right++;
        }
	        System.out.println(set + " => " + left +" ," + right +" ," + maxi);
	        right++;
	    }
	}
