import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;

/*
 * Given an array with length n , find highest value which occurs same number of times within the array.
 *  [3,8,3,2,1,3,2] 3 occurs 3 times output=3.
 *   [4,6,7,6,7,5,4,2,4,9,4,1,9] 4 occurs 3 times output=4
 * 
 */
public class MaxOccurance {

	public static void main(String[] args) {
		
		int arr [] = {40,50,30,40,50,30,30};
		
		System.out.println(HighestValue(arr));

	}
	
	public static int HighestValue(int [] arr) {
		int count =0; 
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			
			if(map.containsKey(key)) {
				int frq = map.get(key);
				frq++;
				map.put(key, frq);
			}else {
				map.put(key, 1);
			}
			
		}
		
//		int max_count = 0, res = -1;
//        
//        for(Entry<Integer, Integer> val : map.entrySet())
//        {
//            if (max_count < val.getValue())
//            {
//                res = val.getKey();
//                max_count = val.getValue();
//            }
//        }
//          
//        return res;
		
		//to find the key associated with the max value in map
		
		// return map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
		
		return Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
		
		
	
	}

}
