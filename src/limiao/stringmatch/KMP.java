/**
 * 
 */
package limiao.stringmatch;

/**
 * The Knuth-Morris-Pratt Algorithm
 * @author seektech
 * Oct 10, 2016 11:22:12 AM
 */
public class KMP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "BBCABCDACABCDABCDABDE";
		String find = "ABCDA";
		KMP kmp = new KMP();
		int next[] = kmp.getNext(find);
		System.out.println("next数组为：");
		for(int i:next) System.out.print(i+" ");
		System.out.println("\n结果：");
		kmp.search(original, find, next);
	}
	
    /**
     * 字符串匹配
     * @param original 待匹配的字符串
     * @param find 查找的关键字
     * @param next next数组
     * @return 返回第一次完成匹配的位置
     */
    public void search(String original,String find,int[] next){
        int i = 0,j = 0;// i控制original，j控制find
        int lenO = original.length();
        int lenF = find.length();
        for(;i<lenO; ) {
            if(original.charAt(i) == find.charAt(j)) {//匹配就自动递增，往后匹配。
                if(j==lenF-1) {
                    System.out.println(i-lenF+1);
                    break;
                }
                j++;
                i++; 
            }
            else if(j==0) {
                 i++;
            }
            else {
                j = next[j-1]+1;
            }
        }
    }
    
    /**
     * 求next数组
     * @param find 关键字字符串
     * @return next数组
     */
    public int[] getNext(String find){
    	int len = find.length();
    	int[] next = new int[len];
        int i,j;
        next[0] = -1;
        i = 0;
        for(j=1;j<len;j++) {
             i = next[j - 1];
             while(i>=0&&find.charAt(j)!=find.charAt(i+1)) {
                 i = next[i];    
             }
            if(find.charAt(j)==find.charAt(i+1)) {
                next[j] = i+1;
            }
            else {
                next[j] = -1;
            }
         }
         return next;
    }
    
}
