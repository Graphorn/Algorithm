package limiao.algorithm.leetcode;

/**
 * @author limiao
 * Apr 1, 2017 5:09:41 PM
 * 
 */
public class No_125_ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	public boolean isPalindrome(String s) {
		if(s.isEmpty() == true) return true;
		int head = 0;
		int tail = s.length()-1;
		while(head<=tail){
			char cHead = s.charAt(head);
			char cTail = s.charAt(tail);
			if(!Character.isLetterOrDigit(cHead)) head++;
			else if(!Character.isLetterOrDigit(cTail)) tail--;
			else{
				if(Character.toLowerCase(cHead) == Character.toLowerCase(cTail)){
					head++;
					tail--;
				}else{
					return false;
				}
			}
		}
		
		return true;
    }
}
