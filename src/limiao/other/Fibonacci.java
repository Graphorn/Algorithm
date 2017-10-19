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
		System.out.println(fibonacci.FibonacciIterative(3));
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
	/**
	 * 非递归，自下向上计算
	 */
	public int FibonacciIterative(int n) {
		int first = 0;
		int second = 1;
		
		if(n==0) return first;
		if(n==1) return second;
		
		int result = 0;
		for(int i=2; i<=n; i++) {
			result = first + second;
			first = second;
			second = result;
		}
		return result;
	}
}
