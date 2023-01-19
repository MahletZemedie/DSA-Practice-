import java.util.Arrays;

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * 
 */

public class MaximumProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,1,5,3,6,4};
		System.out.println(maxProf(arr));
	}
	
	static int maxProf(int [] arr) {
		
		
		int min = arr[0];
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			
			min = Math.min(min,arr[i]);
			max = Math.max(max, arr[i]-min);
		}
		
		return max;
		
	}

}
