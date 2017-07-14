package limiao.algorithm.leetcode;

/**
 * 27. Remove Element
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 * 
 * @author seektech
 * @time Oct 8, 2016 10:23:05 AM
 */
public class No_027_RemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,2,2,3};
		removeElement(nums,3);
	}
	public static int removeElement(int[] nums, int val) {
		if(nums.length == 0) return 0;
		
//		int i = 0;
//	    for (int j = 0; j < nums.length; j++) {
//	        if (nums[j] != val) {
//	            nums[i] = nums[j];
//	            i++;
//	        }
//	    }
		
		 int i = 0;
		    int n = nums.length;
		    while (i < n) {
		        if (nums[i] == val) {
		            nums[i] = nums[n - 1];
		            n--;
		        } else {
		            i++;
		        }
		    }
		    //return n;
   
        for(int j=0; j<nums.length; j++)
        	System.out.println(nums[j]);
        return n;
    }
}
