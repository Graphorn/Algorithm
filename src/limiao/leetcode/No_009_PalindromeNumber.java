package limiao.leetcode;

/**
 * 9. Palindrome Number
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * @author seektech
 * @time Sep 29, 2016 10:18:54 PM
 */
public class No_009_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1));
	}
	public static boolean isPalindrome(int x) {
		if(x<0){
			return false;
		}
		long reverse = 0;
		int temp = x;
		while(temp!=0){
			int s = temp%10;
			reverse = reverse*10 + s;
			temp = temp/10;
		}
		if(reverse == x) return true;
		else return false;
    }
}
