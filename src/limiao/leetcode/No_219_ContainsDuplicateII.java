package limiao.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 219. Contains Duplicate II
 * @author seektech
 * Oct 26, 2016 9:53:35 AM
 */
public class No_219_ContainsDuplicateII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if(nums.length<2) return false;
    	Map map = new HashMap();
        for(int i=0; i<nums.length-1; i++){
        	if(map.get(nums[i]) == null) map.put(nums[i], i);
        	else{
        		if(i-(int)map.get(nums[i]) <= k) return true;
        		else map.put(nums[i], i);// 解决1,0,1,1
        	} 
        }
        return false;
    }
}
