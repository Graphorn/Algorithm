package limiao.other;

/**
 * 汉诺塔问题的递归和非递归解
 * @author LiMiao
 * @time 2017年7月20日 下午5:29:04
 */
public class Hanoi {

	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi();
		int n = 5;
		int from = 1;
		int to = 3;
		int other = 2;
		hanoi.recursion(n,from,to,other);
		hanoi.iteration(n,from,to,other);
	}

	/**
	 * 递归解
	 */
	public void recursion(int n, int from, int to, int other) {
		if(n == 1) {
			System.out.println(from +"->" + to);
		}else {
			recursion(n-1, from, other, to);
			recursion(1, from, to, other);
			recursion(n-1, other, to, from);
		}
	}
	/**
	 * 非递归解
	 */
	public void iteration(int n, int from, int to, int other) {
		
	}
	
}











