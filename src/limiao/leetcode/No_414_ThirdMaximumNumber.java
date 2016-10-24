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
		int source[] = {2,2,3,1};
		System.out.println(thirdMax(source));
	}
	public static int thirdMax(int[] nums) {
		if(nums.length == 1) return nums[0];
		if(nums.length == 2) return nums[0]>=nums[1]?nums[0]:nums[1];
		
		List<Integer> list = new ArrayList<>();
		list.add(nums[0]);
		for(int i=1; i<nums.length; i++){
			if(nums[i]<list.get(list.size()-1)){
				list.add(nums[i]);
			}
			if(nums[i]>list.get(list.size()-1)){
				int temp = list.get(list.size()-1);
				list.set(list.size()-1,temp);
				list.add(nums[i]);
			}
			if(list.size() == 3) break;
		}
		//haha
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]>list.get(2)&&nums[i]<list.get(1)){
				list.set(2, nums[i]);
			}
			if(nums[i]>list.get(1)&&nums[i]<list.get(0)){
				list.set(2, list.get(1));
				list.set(1, nums[i]);
			}
			if(nums[i]>list.get(0)){
				list.set(2, list.get(1));
				list.set(1, list.get(0));
				list.set(0, nums[i]);
			}
		}
        return nums[2];
    }
}
