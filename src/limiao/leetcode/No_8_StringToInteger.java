package limiao.leetcode;

/**
 * 8. String to Integer (atoi)  
 * Implement atoi to convert a string to an integer.
 * 
 * @author seektech
 * @time Sep 28, 2016 10:17:12 PM
 */
public class No_8_StringToInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("-2147483648"));
	}
    public static int myAtoi(String str) {
    	if(str == null || str.length() == 0) return 0;
    	
    	int j = 0;
    	while(str.charAt(j) == ' ') j++;
    	
    	int sign = 1;
    	if(str.charAt(j) == '+'){
    		sign = 1;
    		j++;
    	}else if(str.charAt(j) == '-'){
    		sign = -1;
    		j++;
    	} 
    	
    	double sum = 0;
    	for(int i=j; i<str.length(); i++){
    		char current = str.charAt(i);
    		if(current>='0' && current<='9'){
    			sum = sum*10 + (int)(current-'0');
    		}else{
    			break;
    		}
    	}
    	
    	double res = sum*sign;
    	if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
    	if(res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
    	
    	return (int)res;
    }
}
