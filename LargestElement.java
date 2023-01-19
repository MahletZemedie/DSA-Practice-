
import java.util.Arrays;

/*
 * Implement a solution nth_largest (array, n) that takes in an array of arbitrary size and
 *  returns the nth largest element.
 */
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] input = {1,3,5,3,7,0,20,30,15,2,100};
		//2,3,7,9
		
		System.out.println(nth_largest(input, 9));
		
	    
	    

	}
	
	public static int nth_largest(int [] input, int n) {
		
		Arrays.sort(input);
		
		System.out.println(Arrays.toString(input));
		
		
		return input[input.length-n];
		
		
	}
	
	
}
