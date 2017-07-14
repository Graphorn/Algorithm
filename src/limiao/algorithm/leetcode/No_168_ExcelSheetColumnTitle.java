package limiao.algorithm.leetcode;

/**
 * @author seektech
 * Feb 27, 2017 10:08:42 AM
 * 
 * 168. Excel Sheet Column Title
 */
public class No_168_ExcelSheetColumnTitle {
	public static void main(String args[]){
		No_168_ExcelSheetColumnTitle no_168_ExcelSheetColumnTitle = new No_168_ExcelSheetColumnTitle();
		System.out.println(no_168_ExcelSheetColumnTitle.convertToTitle(26));
	}
	public String convertToTitle(int n) {
		String rString = "";
		char[] characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		while(n != 0){
			int remainder = 0;
			remainder = (n-1) % characters.length;
			n = (n-1) / characters.length;
			rString = characters[characters.length-1] + rString;
		}
		return rString;
    }
}
