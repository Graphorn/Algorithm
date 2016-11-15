package limiao.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
 * @author seektech
 * Oct 26, 2016 1:56:28 PM
 */
public class No_169_MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        int n = nums.length/2;
        for(int i=0; i<nums.length; i++){
        	if(map.get(nums[i])==null) map.put(nums[i],1);
        	else map.put(nums[i], map.get(nums[i])+1);
        }
        
        for(int i:map.keySet()){
        	if(map.get(i) > n) return i;
        }
        return -1;
    }
}
