/*
 * Find number of occurrences of a character in string. 
 * Provide multiple approaches for the solution and choose the best why? For "string aabcadd output=a3b1c1d2
 */


import java.util.HashMap;

public class NumberofOccurance {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abacab";
		occurance(str);

	}
	
	
	static void occurance(String str) {
		
		HashMap <Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char key = str.charAt(i);
			
			if(map.containsKey(key)) {
				
				int freq = map.get(key);
				
				freq++;
				
				map.put(key, freq);
			}else {
				map.put(str.charAt(i), 1);
			}
			
		}
		
		System.out.println(map);
	}

}
