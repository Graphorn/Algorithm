package limiao.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 136. Single Number
 * @author seektech
 * Nov 25, 2016 2:52:15 PM
 */
public class No_136_SingleNumber {

	public static void main(String[] args) {
		
	}
	public int singleNumber(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int result = nums[0];
		for(int i=1; i<nums.length; i++){
			result = result^nums[i];
		}
        return result;
    }
}
