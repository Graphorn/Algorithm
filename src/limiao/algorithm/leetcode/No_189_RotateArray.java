package limiao.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 189. Rotate Array 
 * @author seektech
 * Oct 26, 2016 11:16:36 AM
 */
public class No_189_RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,7};
		rotate1(array,6);
	}
	public static void rotate1(int[] nums, int k) {
//		if(nums.length <= 1) return;
//		int tmp;
//		k%=nums.length;
//        for(int i=0; i<nums.length; i++){
//        	if(i > nums.length-k-1){
//        		tmp = nums[i];
//        		for(int j=i-1; j>=i+k-nums.length; j--){
//        			nums[j+1] = nums[j];
//        		}
//        		nums[i+k-nums.length] = tmp;
//        	}
//        }
		
		if(nums.length <= 1) return;
		k%=nums.length;
		int tmpLat[] = new int[k];
		int tmpPre[] = new int[nums.length-k];
		for(int i = 0; i<nums.length; i++){
			if(i>nums.length-k-1)
				tmpLat[i-nums.length+k] = nums[i];
			else
				tmpPre[i] = nums[i];
		}
		for(int i = 0; i<nums.length; i++){
			if(i<k)
				nums[i] = tmpLat[i];
			else
				nums[i] = tmpPre[i-k];
		}
        for(int i=0; i<nums.length; i++){
        	System.out.print(nums[i]+" ");
        }
    }
}
