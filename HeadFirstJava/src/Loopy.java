
public class Loopy {
	
	public static void main (String[] args) {
		int x = 1;
		System.out.println("Before the start of the cycle");
		while (x < 4) {
			System.out.println("Within the cycle");
			System.out.println("The value of x is " + x);
			x = x + 1;
		}
		System.out.println("After the end of the cycle");
	}
}
