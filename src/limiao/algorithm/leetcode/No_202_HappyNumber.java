package limiao.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author limiao
 * Mar 31, 2017 10:20:51 AM
 * 
 * 202. Happy Number
 */
public class No_202_HappyNumber {

	Set<Integer> set = new HashSet<>();
	public static void main(String[] args) {

	}
	public boolean isHappy(int n) {
		int sum = 0;
		while(n!=0){
			int mod = n%10;
			n = n/10;
			sum += Math.pow(mod, 2);
		}
		if(sum==1) return true;
		if(set.contains(sum)) return false;
		else set.add(sum);
		return isHappy(sum);
    }
}
