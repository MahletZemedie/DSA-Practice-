
/*
 * return a word from a string that is max length and even. 
 * if there are two words with the same max size, return the first word
 * 
 * Another solution on GFG: 
 */

import java.util.HashMap;


public class LongestEvenLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I Love yo yoyoyo";
		
		System.out.println(findMaxLenEven(str));
	}
	
	static String findMaxLenEven(String str) {
		
		String strArray[] = str.split(" ");
		HashMap <String, Integer> map  = new HashMap<>();
		
		for(int i = 0; i<strArray.length; i++) {
			
			if((strArray[i].length()) % 2== 0){
				map.put(strArray[i], strArray[i].length());
			}
		}
		System.out.println(map);
		int max = Integer.MIN_VALUE;
		for(int item : map.values()) {
			max = Math.max(max,item);
			
		}
		System.out.println(max);
		// ["code", 4]
		for(int i = 0; i<strArray.length; i++) {
			if(strArray[i].length() % 2 == 0 && map.get(strArray[i]) == max) {
			
				return strArray[i];
				
			}
		}
		
		
		return "Only odd words";
		
	}

}
