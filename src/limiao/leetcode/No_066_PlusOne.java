package limiao.leetcode;

/**
 * 66. Plus One
 * @author seektech
 * Oct 26, 2016 8:18:52 PM
 */
public class No_066_PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int[] plusOne(int[] digits) {
    	int carry = 0;
        for(int i=digits.length-1; i>=0; i--){
        	carry = (digits[i]+1)/10;
        	digits[i] = (digits[i]+1)%10;
        	if(carry == 0) break;
        }
        if(carry == 1){
        	int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = carry;;
            return result;
        } else {
            return digits;
        }
    }
}
