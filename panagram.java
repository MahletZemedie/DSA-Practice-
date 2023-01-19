
public class panagram {
	
	public static void main(String [] args) {
		String str = "zzzzb";
		
		
		missingletter(str);
	}
	
	
	public static void missingletter(String input) {
		
		boolean present [] = new boolean[26];
		
		input = input.toLowerCase();
		
		for(int i=0; i<input.length(); i++) {
			
			char c = input.charAt(i);
			
			if(c>='a' && c<='z'){
				
				present[c-'a'] = true;
			}
			
		}
		
		for(int i=0; i<26; i++) {
			if(!present[i]) {
				System.out.println(i + 'a');
				System.out.println((char)(i+'a') +  "   ");
			}
		}
	}

}
