package limiao.leetcode;

/**
 * 371. Sum of Two Integers
 * Calculate the sum of two integers a and b, 
 * but you are not allowed to use the operator + and -.
 * Example:
 *	Given a = 1 and b = 2, return 3.
 * @author seektech
 * @time Aug 5, 2016 5:01:52 PM
 */
public class No_371_SumofTwoIntegers {
	public static void main(String args[]){
		No_371_SumofTwoIntegers instance = new No_371_SumofTwoIntegers();
		System.out.println(instance.getSum(9, 5));
	}
	public int getSum(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        /* 二进制位相异或和与，异或得到每一位的值，与得到进位位 */
        while(b != 0){
            int carry = a & b;
            a = a^b;
            b = carry << 1;
        }
        return a;
    }
}
