package limiao.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 438. Find All Anagrams in a String
 * 
 * @author seektech Oct 27, 2016 9:14:39 AM
 */
public class No_438_FindAllAnagramsinAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> result = findAnagrams3(s,p);
		for(int a:result){
			System.out.print(a+" ");
		}
	}
	/**
	 * @param s
	 *            目标字符串
	 * @param p
	 *            需要找到p的随机序列
	 * @return
	 */
	public static List<Integer> findAnagrams2(String s, String p) {
	    List<Integer> list = new ArrayList<>();
	    // 判断参数正确性
	    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
	    //将p中所有的字符的个数以按ascII码存在数组中，26个英文小写字母ascII码97-122
	    int[] hash = new int[128];
	    for (char c : p.toCharArray()) {
	        hash[c]++;
	    }
	    int left = 0, right = 0, count = p.length();
	    while (right < s.length()) {
	        if (hash[s.charAt(right++)]-- >= 1) count--; 
	        if (count == 0) list.add(left);
	        if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
	    }
	    return list;
	}
	/**
	 * @param s
	 *            目标字符串
	 * @param p
	 *            需要找到p的随机序列
	 * @return
	 */
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
		if (s == null || s.length() == 0 || p == null || p.length() == 0)
			return list;

		int[] hash = new int[256];

		for (char c : p.toCharArray()) {
			hash[c]++;
		}

		int left = 0, right = 0, count = p.length();

		while (right < s.length()) {

			if (hash[s.charAt(right)] >= 1) {
				count--;
			}
			hash[s.charAt(right)]--;
			right++;

			if (count == 0) {
				list.add(left);
			}

			if (right - left == p.length()) {

				if (hash[s.charAt(left)] >= 0) {
					count++;
				}
				hash[s.charAt(left)]++;
				left++;

			}

		}
		return list;
	}
	/**
	 * @param s
	 *            目标字符串
	 * @param p
	 *            需要找到p的随机序列
	 * @return
	 */
	public static List<Integer> findAnagrams3(String s, String p) {
	    List<Integer> list = new ArrayList<>();
	    // 判断参数正确性
	    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
	    //将p中所有的字符的个数以按ascII码存在数组中，26个英文小写字母ascII码97-122
	    int[] hash = new int[128];
	    for (char c : p.toCharArray()) {
	        hash[c]++;
	    }
	    int left = 0, right = 0, count = p.length();
	    while (right < s.length()) {
	        if (hash[s.charAt(right++)]-- >= 1) count--; 
	        if (count == 0) {
	        	list.add(left);
	        }
	        if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
	    }
	    return list;
	}
}
