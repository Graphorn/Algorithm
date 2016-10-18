package limiao.stringmatch;

/**
 * The Knuth-Morris-Pratt Algorithm
 * @author seektech
 * Oct 10, 2016 11:22:12 AM
 */
public class KMP2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "BBCABCDACABCDABCDABDE";
		String find = "ABCDA";
		KMP2 kmp2 = new KMP2();
		int next[] = kmp2.getNext(find);
		System.out.println("next数组为：");
		for(int i:next) System.out.print(i+" ");
		System.out.print("\n结果：");
		int target = kmp2.search(original, find, next);
		System.out.println(target);
	}
	
    /**
     * 字符串匹配
     * @param original 待匹配的字符串
     * @param find 查找的关键字
     * @param next next数组
     * @return 返回第一次完成匹配的位置
     */
    public int search(String original,String find,int[] next){
    	int i = 0,j = 0;
    	int lenO = original.length();
    	int lenF = find.length();
    	while (i < lenO && j < lenF)  
	    {  
	        //①如果j = -1，或者当前字符匹配成功（即S[i] == P[j]），都令i++，j++      
	        if (j == -1 || original.charAt(i)==find.charAt(j))  
	        {  
	            i++;  
	            j++;  
	        }  
	        else  
	        {  
	            //②如果j != -1，且当前字符匹配失败（即S[i] != P[j]），则令 i 不变，j = next[j]      
	            //next[j]即为j所对应的next值        
	            j = next[j];  
	        }  
	    }  
	    if (j == lenF)  
	        return i - j;  
	    else  
	        return -1;  
    }
    
    /**
     * 求next数组
     * @param find 关键字字符串
     * @return next数组
     */
    public int[] getNext(String find){
    	int next[] = new int[find.length()]; 
    	int len = find.length();  
        next[0] = -1;  
        int k = -1;  
        int j = 0;  
        while (j < len - 1)  
        {  
            //k表示前缀索引，j表示后缀索引    
            if (k == -1 || find.charAt(j)==find.charAt(k))  
            {  
                ++j;  
                ++k;  
                //较之前next数组求法，改动在下面4行  
                if (find.charAt(j)!=find.charAt(k))  
                    next[j] = k;   //之前只有这一行  
                else  
                    //因为不能出现find[j] = find[ next[j ]]，所以当出现时需要继续递归，k = next[k] = next[next[k]]  
                    next[j] = next[k];  
            }  
            else  
            {  
                k = next[k];  
            }  
        }
        return next;
    }
    
}
