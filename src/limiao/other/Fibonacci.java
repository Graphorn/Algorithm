package limiao.other;

/**
 * 裴波纳契数的递归和尾递归
 * @author LiMiao
 * @time 2017年7月21日 上午11:33:38
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.FibonacciRecursive(3));
		System.out.println(fibonacci.FibonacciTailRecursive(3, 0, 1));
	}
	/**
	 * 一般递归
	 */
	public int FibonacciRecursive(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		else {
			return FibonacciRecursive(n-1)+FibonacciRecursive(n-2);
		}
	}
	/**
	 * 尾递归
	 */
	public int FibonacciTailRecursive(int n, int r1, int r2) {
		if (n == 0) return r1;
		else {
			return FibonacciTailRecursive(n-1, r2, r1+r2);
		}
	}
}
