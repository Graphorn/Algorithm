package limiao.algorithm.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author limiao
 * Mar 31, 2017 10:51:10 AM
 * 
 * 344. Reverse String
 */
public class No_344_ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}
	public static String reverseString(String s) {
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length/2;i++){
			char tmp = ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i] = tmp;		
		}
        return String.valueOf(ch);
    }
}
