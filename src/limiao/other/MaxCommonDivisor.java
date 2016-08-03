package limiao.other;

/**
 * 欧几里得算法：辗转相除，求最大公约数，Greatest common divisor
 * @author limiao
 * @time 2016年5月12日 下午7:12:18
 */
public class MaxCommonDivisor{
	public static void main(String[] args){
		MaxCommonDivisor maxCommonDivisor = new MaxCommonDivisor();
		System.out.println("最大公约数:"+maxCommonDivisor.maxCommonDivisor(12, 8));
	}
	
	public int maxCommonDivisor(int a,int b){
		if(b == 0){
			return a;
		}
		int r = a%b;
		return maxCommonDivisor(b,r);
	}
}
