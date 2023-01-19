
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(gcd(12,4));
	}
	
	static int gcd(int a, int b) {
		
//		if (b==0) return a;
//		   return gcd(b,a%b);
//		   
		   return b==0 ? a:gcd(b, a%b);
	}

}
