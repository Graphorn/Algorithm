package limiao.algorithm.other;

import java.util.HashMap;
import java.util.Map;

/**
 * 寻找缺失的整数
 * @author seektech
 * Oct 18, 2016 9:40:10 AM
 */
public class SearchLostInteger {

	/**一个无序数组里有99个不重复的正整数，范围从1到100，
	 * 唯独缺少一个数，请找出缺失的整数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sourceArray[] = {5,2,6,4,3,8,1,7,10};
	}

	/**
	 * 方法一：利用所有数的和减去已经知道的数就是缺失的数了
	 * @param source
	 * @return
	 */
	public int serach1(int[] source){
		int total = 55;
		for(int i=0; i<source.length; i++){
			total -= source[i];
		}
		return total;
	}
	/**
	 * 方法一：利用hash，利用这10个数作为键值将所有的值默认为0，遍历数组将存在的数字的值都变成1
	 * @param source
	 * @return
	 */
	public int serach2(int[] source){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<10; i++){
			map.put(i, 0);
		}
		for(int i=0; i<source.length; i++){
			map.put(source[i], 1);
		}
		for(int i: map.keySet()){
			if(map.get(i).equals(0)){
				return i;
			}
		}
		return 0;
	}
}
