package limiao.algorithm.leetcode;

/**
 * 6. ZigZag Conversion
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * @author seektech
 * @time Sep 27, 2016 10:08:04 PM
 */
public class No_006_ZigZagConversion {
	public static void main(String args[]){
		System.out.println(convert("PAYPALISHIRING", 4));
	}
	public static String convert(String s, int numRows) {
		int len = s.length();
		if(s.length()==0 || numRows<2) return s;
		
		String convert = "";
		int per = 2*numRows - 2;
		for(int i=0; i<numRows; i++){
			for(int j=i; j<len; j+=per){
				convert += s.charAt(j);
				
				if(i>0 && i<numRows-1){
					int t = j + per - 2*i;  
                    if (t < len) {  
                        convert += s.charAt(t);  
                    }  
				}
			}
		}
        return convert;
    }
}
