// package DSAA;

public class recursion {
	public static void main(String[] args) {
		int n = 10;
		long startTime1 = System.nanoTime();
		int res1 = factorial(n);
		System.out.println(res1);
		long endTime1 = System.nanoTime();
		System.out.println(endTime1 - startTime1);
		
		long startTime2 = System.nanoTime();
		int res2 = tail_factorial(n, 1);
		System.out.println(res2);
		long endTime2 = System.nanoTime();
		System.out.println(endTime2 - startTime2);


	}
	
	public static int factorial(int n) {
		if (n == 1) return 1;
		return n * factorial(n - 1);
	}

	public static int tail_factorial(int n, int res) {
		if (n == 1) return res;
		return tail_factorial(n-1, res * n);
	}
}
