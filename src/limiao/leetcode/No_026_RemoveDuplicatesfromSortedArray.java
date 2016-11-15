package limiao.leetcode;

/**
 * 26. Remove Duplicates from Sorted Array
 * @author seektech
 * Oct 26, 2016 8:33:48 PM
 */
public class No_026_RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int removeDuplicates(int[] nums) {
		if(nums.length < 2) return nums.length;
		
		int count = 0;
        for(int i=0; i<nums.length-1; i++){
        	if(nums[i] == nums[i+1]) continue;
        	else{
        		nums[count] = nums[i];
        		count++;
        	} 
        }
        // 每一次都是拿当前的和后一个比较，那么最后一个一定是不会重复的，必须保留
        nums[count] = nums[nums.length-1];
        return ++count;
    }
}
