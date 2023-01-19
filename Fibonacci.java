import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((fib(10)));
		

	}
	
	public static List<Integer> fib(int n) {
		
		List<Integer> list = new ArrayList<>();
		
		//base case numbers
		int n1 = 0;
		int n2=1;
		int counter = 0;
		
		while(counter < n) {
			
			list.add(n1);
			int sum = n1+ n2;
			n1 = n2; 
			n2 = sum;
			
			counter ++;
		
		}
		
		return list;	
	}

}
