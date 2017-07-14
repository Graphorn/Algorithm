package limiao.algorithm.leetcode;

/**
 * 28. Implement strStr()   
 * Returns the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 * 
 * @author seektech
 * Oct 15, 2016 5:47:20 PM
 */
public class No_028_strStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public int strStr(String original, String needle) {
		/*
		 * 当匹配的字符串的长度为零的时候返回0
		 */
		if(needle.length() == 0) return 0;
		
		/*
		 * 使用KMP算法解决该题,
		 * 第一步得到next数组
		 */
		int next[] = new int[needle.length()]; 
    	int len = needle.length();  
        next[0] = -1;  
        int k = -1;  
        int j = 0;  
        while (j < len - 1)  
        {  
            if (k == -1 || needle.charAt(j)==needle.charAt(k))  
            {  
                ++j;  
                ++k; 
                if (needle.charAt(j)!=needle.charAt(k))   next[j] = k;
                else  next[j] = next[k];  
            }else  k = next[k];  
        }
        /*
         * 第二步，查询
         */
        int i = 0,m = 0;
    	int lenO = original.length();
    	int lenF = needle.length();
    	while (i < lenO && m < lenF)  
	    { 
	        if (m == -1 || original.charAt(i)==needle.charAt(m))  
	        {  
	            i++;  
	            m++;  
	        }  
	        else  m = next[m];  
	    }  
	    if (m == lenF)  return i - m;  
	    else  return -1;  
    }
}
