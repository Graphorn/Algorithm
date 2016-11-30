package limiao.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 136. Single Number 
 * 变形1：一个数组中有两个元素只出现一次，其他所有元素都出现两次，求这两个只出现一次的元素
 * @author seektech
 * Nov 25, 2016 2:52:15 PM
 */
public class No_136_SingleNumber1 {

	@Test
	public static void main(String[] args) {
		int source[] = {21,2,2,5,5,6,7,7,8,8,9,9};
		int result[] = singleNumber(source);
		for(int i:result){
			System.out.println("res:"+i);
		}
	}
	public static int[] singleNumber(int[] nums) {
		if(nums == null || nums.length == 0) return null;
		int result[] = new int[2];
		/* 
		 * 先将所有的元素求出异或值，利用该异或值任意一个为1的位将所有的元素分成两组，为1的一组，为0的一组，
		 * 这两组元素就转化成了原始的SingleNumber的问题
		 */ 
		int xor = nums[0];
		// 求出异或值
		for(int i=1; i<nums.length; i++){
			xor = xor^nums[i];
		}
		// 找到分组的位
		char charArray[] = Integer.toBinaryString(xor).toCharArray();
		int index = 0;// 存储分组的那个位的index
		for(int i=0; i<charArray.length; i++){
			char c = charArray[i];
			if(c == '1'){
				index = i;
				break;
			}
		}
		// 分组
		List<Integer> array1 = new ArrayList<>();
		List<Integer> array2 = new ArrayList<>();
		for(int i=0; i<nums.length; i++){
			char array[] = Integer.toBinaryString(nums[i]).toCharArray();
			if(array.length < charArray.length){
				array2.add(nums[i]);
			}else{
				if(array[array.length-charArray.length+index] == '1'){
					array1.add(nums[i]);
				}else{
					array2.add(nums[i]);
				}
			}
		}
		// 进行singleNumber一样的操作
		int one = array1.get(0);
		for(int i=1; i<array1.size(); i++){
			one = one^array1.get(i);
		}
		result[0] = one;
		int two = array2.get(0);
		for(int i=1; i<array2.size(); i++){
			two = two^array2.get(i);
		}
		result[1] = two;
        return result;
    }
}
