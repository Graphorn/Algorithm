package limiao.algorithm.leetcode;

/**
 * 283. Move Zeroes
 * Given an array nums, 
 * write a function to move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], 
 * after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * @author limiao
 * @time 2016年7月24日 上午10:12:15
 */
public class No_283_MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,1,0,3,12};
		No_283_MoveZeroes instance = new No_283_MoveZeroes();
		instance.moveZeroes(nums);
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i]+" ");
        }
		
	}
	public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++){
        	if(nums[i] == 0){
        		for(int j=i+1;j<nums.length; j++){
        			if(nums[j] != 0){
        				int temp = nums[i];
        				nums[i] = nums[j];
        				nums[j] = temp;
        				break;
        			}
        		}
        	}
        }
    }
}
