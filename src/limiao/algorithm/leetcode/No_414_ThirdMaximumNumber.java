package limiao.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 414. Third Maximum Number
 * @author seektech
 * Oct 24, 2016 5:00:45 PM
 */
public class No_414_ThirdMaximumNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int source[] = {2,2,3};
		System.out.println(thirdMax(source));
	}
	public static int thirdMax(int[] nums) {
		List<Integer> list = new ArrayList<>();
		boolean equal;
		int tmp;
		for(int i=0; i<nums.length; i++){
			equal = false;
			int j;
			for(j=0; j<list.size()&&j<3; j++){
				tmp = list.get(j);
				if(nums[i]>tmp) break;
				if(nums[i]==tmp){
					equal = true;
					break;
				} 
			}
			if(!equal&&j<3) list.add(j, nums[i]);
		}
		if(list.size()<3) return list.get(0);
		return list.get(2);
    }
}
