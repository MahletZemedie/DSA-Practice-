import java.util.PriorityQueue;

/*Given N elements, you can remove any two elements from the list, note their sum, 
 * and add the sum to the list.
 *  Repeat these steps while there is more than a single element in the list.
 *   The task is to minimize the sum of these chosen sums in the end.
 *   We need to return the min cost
 * More detail : 
 * https://www.geeksforgeeks.org/minimize-the-sum-calculated-by-repeatedly-removing-any-two-elements-and-inserting-their-sum-to-the-array/
 */
public class MinSum {
	
	public static void main(String [] args) {
	
	int arr [] = {4,6,8,2};
	
	System.out.println(getMinSum(arr));
	
	
	}
	public static int getMinSum(int [] arr) {
		
		int cost = 0;
		//it helps to rearrange in desc order even when we add the sum(cost)
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<arr.length; i++) 
			pq.add(arr[i]);
			
			while(pq.size()>1) {
				
				int min = pq.poll();
				int min2 = pq.poll();
				
				cost += (min+min2);
				
				
				pq.add(min+min2);
			}
			
		
		return cost;
		
		
	}

}
