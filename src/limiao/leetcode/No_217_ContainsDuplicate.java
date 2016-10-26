package limiao.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 217. Contains Duplicate
 * @author seektech
 * Oct 26, 2016 10:06:30 AM
 */
public class No_217_ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public boolean containsDuplicate(int[] nums) {
		Map map = new HashMap();
		int tmp;
		for(int i=0; i<nums.length; i++){
			tmp = nums[i];
			if(map.get(tmp) == null) map.put(tmp, 1);
			else return true;
		}
		return false;
    }
}
