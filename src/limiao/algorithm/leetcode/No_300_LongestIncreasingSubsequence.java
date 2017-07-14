package limiao.algorithm.leetcode;

/**
 * Longest Increasing Subsequence
 * @author seektech
 * @time Jul 24, 2016 1:25:15 PM
 */
public class No_300_LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No_300_LongestIncreasingSubsequence test = new No_300_LongestIncreasingSubsequence();
		int nums[] = {10,9,2,5,3,7,101,18};
		System.out.println("LIS:"+test.lengthOfLIS(nums));
	}
	
	public int lengthOfLIS(int[] nums) {
		if(nums.length == 0) return 0;
		int max = 1;
        int tempArray[] = new int[nums.length];
        for(int i=0; i<nums.length;i++){
        	int temp = 1;
        	for(int j=0; j<i; j++){
        		if(nums[i]>nums[j]){
        			if(tempArray[j]+1>temp)
        				temp = tempArray[j]+1;
        		}
        	}
        	tempArray[i] = temp;
        	if(temp > max) max = temp;
        }
        return max;
    }

}
