package limiao.leetcode;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * The brackets must close in the correct order, 
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * @author seektech
 * Oct 13, 2016 4:08:44 PM
 */
public class No_20_ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	public boolean isValid(String s) {
		Stack st = new Stack();
		st.push(s.charAt(0));
		for(int i=1; i<s.length(); i++){
			//if()st.push(s.charAt(i));
		}
        return false; 
    }
}
