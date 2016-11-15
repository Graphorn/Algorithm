package limiao.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 438. Find All Anagrams in a String
 * @author seektech
 * Oct 27, 2016 9:14:39 AM
 */
public class No_438_FindAllAnagramsinAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @param s 目标字符串
	 * @param p 需要找到p的随机序列
	 * @return
	 */
	public List<Integer> findAnagrams(String s, String p) {
		if(p.length() == 0 || s.length() == 0) return null;
        List<Integer> result = new ArrayList<>();
        // 第一步找到p的所有的随机序列
        int len = p.length();
        Map<Integer,Integer> map = new HashMap<>();
        // 利用KMP算法循环匹配输出
        return result;
    }
	
	public void perm(char[] c,int start,int end)
	 {
	  if(start==end)
	  {
	   for(int i=0;i<=end;i++)
	   {
	    System.out.print(c[i]);
	   }
	   System.out.println();
	  }
	  else
	  {
	   for(int i=start;i<=end;i++)
	   {
	    char temp=c[start];
	    c[start]=c[i];
	    c[i]=temp;
	    perm(c,start+1,end);
	    temp=c[start];
	    c[start]=c[i];
	    c[i]=temp;
	   }
	  }
	 }
}
