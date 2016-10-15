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
public class No_020_ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	public boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		int len = s.length();
		if(len == 0) return true;
		if(len%2!=0) return false;
		
		for(int i=0; i<s.length(); i++){
			char current = s.charAt(i);
			if(!st.isEmpty()){
				if(current!='('&&current!='['&&current!='{'){
					switch(st.peek()){
					case '(':
						if(current == ')'){
							st.pop();
						}
						break;
					case '[':
						if(current == ']'){
							st.pop();
						}
						break;
					case '{':
						if(current == '}'){
							st.pop();
						}
						break;
					}
				}else st.push(s.charAt(i));
			}else st.push(s.charAt(i));
		}
        return st.isEmpty(); 
    }
}
