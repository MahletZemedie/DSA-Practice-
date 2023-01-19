
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[] = { 'g', 'r', 'a', 'm' };
        char b[] = { 'a', 'r', 'm', 'g' };
		
		System.out.println(anagram(a,b));
		
		String str = "gram";
		String str2 = "armg";
		
		System.out.println(gram(str,str2));

	}
	
	//if char is given 
	//time complexity O(N *log n) 
	public static boolean anagram(char [] a, char [] b) {
		
		
		int aSize = a.length;
		int bSize = b.length;
		
		//base case
		if(aSize != bSize)
			return false;
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(a.equals(b)) return true;
		
		
		return true;
	}
	
	//if String is given 
	//O(n)
	public static boolean gram(String a, String b) {
		
		
		if(a.length()!=b.length()) return false;
		
		
		// Create a HashMap containing Character as Key and
        // Integer as Value. We will be storing character as
        // Key and count of character as Value.
		HashMap <Character, Integer> map = new HashMap<>();
				
		for(int i=0; i<a.length(); i++) {
			
			if(!map.containsKey(a.charAt(i))){
				
				map.put(a.charAt(i), 1);
				
			}else {
				map.put(a.charAt(i),map.get(a.charAt(i))+1);
			}
		}
		
		for(int i=0; i<b.length(); i++) {
			if(map.containsKey(b.charAt(i))) {
				map.put(b.charAt(i),map.get(b.charAt(i))-1);
			}
		}
		
		
		Set<Character> ch = map.keySet();
		
				for (Character key : ch) {
		            if (map.get(key) != 0) {
		                return false;
		            }
		        }
				
				return true;
		
		
	}
	
}
