package limiao.algorithm.leetcode;

/**
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * @author seektech
 * @time Oct 7, 2016 2:36:50 PM
 */
public class No_014_LongestCommonPrefix {
	public static void main(String args[]){
		
	}
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) return "";
		String prefix = strs[0];
		for(int i=0; i<strs.length; i++){
			if(prefix.length() == 0 || strs[i].length() == 0) return "";
			int len = prefix.length() < strs[i].length()? prefix.length():strs[i].length();
			int j;
			for(j=0; j<len; j++){
				if(prefix.charAt(j) != strs[i].charAt(j)) break;
			}
			prefix = prefix.substring(0, j);
		}
		return prefix;
    }
}
