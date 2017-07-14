package limiao.algorithm.leetcode;

/**
 * 38. Count and Say
 * @author seektech
 * @time Dec 7, 2016 7:08:49 PM
 */
public class No_038_CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(6));
	}
	public static String countAndSay(int n) {
		String tmp = "1";
        for(int i=2;i<=n;i++){
        	String t = "";
        	//计算tmp中每个字符的个数，并形成新的字符串赋值给tmp
        	char[] array = tmp.toCharArray();
        	int count = 0;
        	char standard = array[0];
        	for(int j=0; j<array.length; j++){
        		if(standard == array[j]){
        			count++;
        		}else{
        			standard = array[j];
        			t += count+""+array[j-1]+"";
        			count = 1;// 重置count
        		}
        	}
        	t += count+""+array[array.length-1]+"";
        	tmp = t;
        }
        return tmp;
    }
}
