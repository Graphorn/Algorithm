package limiao.algorithm.other;

/**
 * 最小公倍数，最小公倍数×最大公约数 = 两数之积
 * @author limiao
 * @time 2016年5月12日 下午9:24:35
 */
public class MinCommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		MaxCommonDivisor maxCommonDivisor = new MaxCommonDivisor();
		System.out.println("最小公倍数:"+a*b/maxCommonDivisor.maxCommonDivisor(a, b));
	}

}
