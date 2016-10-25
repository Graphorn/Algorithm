package limiao.leetcode;

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
		List<Integer> lst = new ArrayList<>();
        boolean equal;
        int tmp;

        for (int i=0; i<nums.length; i++) {
            equal = false;
            int j=0;
            for (;j<3&&j<lst.size(); j++) {
                tmp = lst.get(j);
                if (tmp == nums[i]) {
                    equal = true;
                    break;
                }
                else if (tmp < nums[i]) {
                    break;
                }
            }
            if (!equal && j<3)
            lst.add(j, nums[i]);
        }

        if (lst.size() < 3) {
            if (lst.size() > 0) {
                return lst.get(0);
            }
            return 0;
        }

        return lst.get(2);
    }
}
