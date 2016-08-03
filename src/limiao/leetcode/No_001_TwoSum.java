package limiao.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * @author limiao
 * @time 2016年3月10日 上午12:04:11
 */
public class No_001_TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No_001_TwoSum twoSum = new No_001_TwoSum();
		No_001_TwoSum.Solution solution = twoSum.new Solution();
		int nums[] = {3,2,4};
        int target = 6;		
		System.out.println(Arrays.toString(solution.twoSum1(nums,target)));
		System.out.println(Arrays.toString(solution.twoSum2(nums,target)));
	}
	
	public class Solution{
		//利用双重循环，时间复杂度高
		public int[] twoSum1(int[] nums, int target) {
	        int i = 0;
	        for(i=0; i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==target){
	                    int[] result = new int[2];
	                    result[0] = i;
	                    result[1] = j;
	                    return result;
	                }
	            }
	        }
			return null;
	    }
		//利用hashMap，时间复杂度低
		public int[] twoSum2(int[] nums, int target) {
			int result[] = new int[2];
	        Map hashMap = new HashMap<Integer, Integer>();
	        for(int i=0;i<nums.length;i++){
	        	hashMap.put(nums[i], i);
	        }
	        for(int i=0;i<nums.length;i++){
	        	int a = target-nums[i];
	        	if(hashMap.get(a)!=null&&!hashMap.get(a).equals(i)){
	        		result[0] = i;
	        		result[1] = (int) hashMap.get(a);
	        		return result;
	        	}
	        }
	        return null;
	    }
	}
}
