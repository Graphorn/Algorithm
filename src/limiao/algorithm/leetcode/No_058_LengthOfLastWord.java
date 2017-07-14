package limiao.algorithm.leetcode;

/**
 * 58. Length of Last Word
 * @author seektech
 * @time Dec 9, 2016 8:37:41 PM
 */
public class No_058_LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("a  "));
	}
	public static int lengthOfLastWord(String s) {
		if(s == null || s.length() == 0) return 0;
		char[] array = s.toCharArray();
//		int spaceNumButtom = 0;
//		for(int i=array.length-1;i>=0;i--){
//			if(array[i] == ' ') spaceNumButtom++;
//			else break;
//		}
//		System.out.println(spaceNumButtom);
//		int count = 0;
//		for(int j=0; j<array.length-spaceNumButtom; j++){
//			if(array[j] == ' ') count = 0;
//			else count++;
//		}
//        return count;
        
		int count = 0;
        for(int i=array.length-1;i>=0;i--){
			if(array[i] != ' ') count++;
			if(count != 0 && array[i] == ' '){
				break;
			}
		}
        return count;
    }
}
